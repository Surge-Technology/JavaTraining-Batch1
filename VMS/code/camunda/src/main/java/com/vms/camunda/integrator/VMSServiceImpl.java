package com.vms.camunda.integrator;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;

import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import camundajar.com.google.gson.JsonObject;

import org.camunda.bpm.engine.rest.dto.runtime.FilterDto;
import org.camunda.bpm.engine.rest.dto.task.TaskDto;

import org.camunda.bpm.engine.FilterService;
import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.ProcessEngines;
import org.camunda.bpm.engine.TaskService;
import org.camunda.bpm.engine.filter.Filter;
import org.camunda.bpm.engine.rest.ProcessInstanceRestService;
import org.camunda.bpm.engine.rest.dto.task.UserDto;
import org.camunda.bpm.engine.task.Task;
import org.camunda.bpm.engine.variable.Variables;
import org.camunda.bpm.engine.variable.value.ObjectValue;
import org.camunda.bpm.engine.rest.UserRestService;

import org.camunda.bpm.engine.task.Task;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.*;
import org.json.simple.JSONObject;

@Service

public class VMSServiceImpl implements VMSService {

	// private final RestTemplate rest;
	// @Value("${camunda.server.rest.url}")

	private String restPDurl = "http://localhost:8080//engine-rest/process-definition/";

	private String restURL = "http://camunda:camupass@localhost:8080/engine-rest/engine";

	private String sendRejectEmailUrl = "http://localhost:8082/sendRejectedEmail";

	private String sendApproveEmailUrl = "http://localhost:8082/sendApprovedEmail";

	private String sendApproveQryUrl = "http://localhost:8081/vendor/query/";

	private String sendPIDStatusUrl = "http://localhost:8081/vendor/status/";

	private ProcessEngine processEngine;

	public VMSServiceImpl() {

	}

	private RestTemplate getRestTemplate() {
		RestTemplate restTemplate = new RestTemplate();

		// Add the Jackson and String message converters
		restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
		restTemplate.getMessageConverters().add(new StringHttpMessageConverter());

		return restTemplate;
	}

	public void sendRejectEmail() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		String requestJson = "{ \"to\":\"muthumur@gmail.com\",\"from\":\"pecansurge@gmai.com\", \"subject\":\"Java Pecan Surge Mail\", \"name\":\"Joey\" }";
		HttpEntity<String> entity = new HttpEntity<String>(requestJson, headers);
		ResponseEntity<String> response = getRestTemplate().postForEntity(sendRejectEmailUrl, entity, String.class);
		System.out.println(response);
	}

	public void sendApproveEmail() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		String requestJson = "{ \"to\":\"muthumur@gmail.com\",\"from\":\"pecansurge@gmai.com\", \"subject\":\"Java Pecan Surge Mail\", \"name\":\"Joey\" }";
		HttpEntity<String> entity = new HttpEntity<String>(requestJson, headers);
		ResponseEntity<String> response = getRestTemplate().postForEntity(sendApproveEmailUrl, entity, String.class);
		System.out.println(response);
	}

	public void sendApproverQuery(String PID, String qry) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		String url = sendApproveQryUrl + PID + "/" + qry;

		System.out.println("sendApproverQuery url :" + url);

		HttpEntity<String> entity = new HttpEntity<String>(headers);

		ResponseEntity<String> response = getRestTemplate().exchange(url, HttpMethod.PUT, entity, String.class);

		System.out.println(response.getStatusCode());
	}

	public void updatePIDStatus(String PID, String newStatus) {

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		String url = sendPIDStatusUrl + PID + "/" + newStatus;

		System.out.println("sendPIDStatusUrl url :" + url);

		HttpEntity<String> entity = new HttpEntity<String>(headers);

		ResponseEntity<String> responseEntity = getRestTemplate().exchange(url, HttpMethod.PUT, entity, String.class);

		System.out.println(responseEntity.getStatusCode());

	}

	public List<TaskDto> getTaskListByuser(String userName) {

		List<TaskDto> taskList = new ArrayList<TaskDto>();

		getProcessEngine();

		TaskService taskService = processEngine.getTaskService();

		List<Task> taskListCamunda = taskService.createTaskQuery().taskAssignee(userName).list();

		List<TaskDto> taskDtoList = new ArrayList<TaskDto>();

		for (Task task : taskListCamunda) {
			TaskDto returnTask = TaskDto.fromEntity(task);
			taskList.add(returnTask);
		}

		return taskList;
	}

	public List<TaskDto> getTaskListByCandidateGroupList(List<String> candidateGroupList) {

		List<TaskDto> taskDtoList = new ArrayList<TaskDto>();

		getProcessEngine();

		TaskService taskService = processEngine.getTaskService();

		List<Task> taskListCamunda = taskService.createTaskQuery().taskCandidateGroupIn(candidateGroupList).list();

		for (Task task : taskListCamunda) {
			TaskDto returnTask = TaskDto.fromEntity(task);
			taskDtoList.add(returnTask);
		}

		return taskDtoList;
	}
	
	public List<TaskDto> getTaskListByCandidateGroup(String candidateGroup) {

		List<TaskDto> taskDtoList = new ArrayList<TaskDto>();

		getProcessEngine();

		TaskService taskService = processEngine.getTaskService();

		List<Task> taskListCamunda = taskService.createTaskQuery().taskCandidateGroup(candidateGroup).list();

		for (Task task : taskListCamunda) {
			TaskDto returnTask = TaskDto.fromEntity(task);
			taskDtoList.add(returnTask);
		}

		return taskDtoList;
	}



	
	
	public FilterDto createFilterByOwner(String ownerName, String filterName) {

		getProcessEngine();

		FilterService filterService = processEngine.getFilterService();

		Filter newFilter = filterService.newTaskFilter().setName(filterName).setOwner(ownerName)
				.setProperties(new HashMap<String, Object>());

		newFilter = filterService.saveFilter(newFilter);

		FilterDto filterDto = FilterDto.fromFilter(newFilter);

		return filterDto;
	}

	public void getProcessEngine() {
		processEngine = ProcessEngines.getDefaultProcessEngine();

	}
}
