package com.example.workflow.integeratorimpl;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.camunda.bpm.engine.rest.dto.repository.ProcessDefinitionDto;
import org.camunda.bpm.engine.rest.dto.runtime.ProcessInstanceDto;
import org.camunda.bpm.engine.rest.dto.task.TaskDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;



import com.example.workflow.integerator.*;

import com.example.workflow.entity.*;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CamundaProcessInstanceServiceImpl
		implements CamundaProcessInstanceService {

	private RestTemplate restTemplate;



	private String reststartPIurl = "process-definition/key/";

	private String restPostPIVariableurl = "process-instance/";

	@Value("${camunda.api.basepath}")
	private String restApiBasePath;

	public CamundaProcessInstanceServiceImpl() {

		this.restTemplate = new RestTemplate();

		// Add the Jackson and String message converters
		restTemplate.getMessageConverters()
				.add(new MappingJackson2HttpMessageConverter());
		restTemplate.getMessageConverters()
				.add(new StringHttpMessageConverter());

	}

	public ProcessInstanceDto startProcessDefinitions(String processName, String businessKey) {

		String requestUrl = restApiBasePath + reststartPIurl + processName
				+ "/start";
		System.out.println("requestUrl...:" + requestUrl);

// Set the Content-Type header
		HttpHeaders requestHeaders = new HttpHeaders();
		requestHeaders.setContentType(new MediaType("application", "json"));

		String jsonString = "{\"businessKey\" : \""+ businessKey +"\"}";

		HttpEntity requestEntity = new HttpEntity(jsonString, requestHeaders);

		// ResponseEntity<ProcessInstanceDto> responseEntity =
		// restTemplate.exchange(requestUrl, HttpMethod.POST, requestEntity,
		// ProcessInstanceDto.class);

		ResponseEntity<ProcessInstanceDto> response = restTemplate
				.postForEntity(requestUrl, requestEntity,
						ProcessInstanceDto.class);

		ProcessInstanceDto pid = response.getBody();
		System.out.println("Process InsId:" + pid.getId());

		return pid;
	}

	// Get ALL process definitions lastest version
	public ProcessDefinitionDto[] getAllProcessDefinitionName() {
		String requestUrl = restApiBasePath
				+ "process-definition?latestVersion=true";
		System.out.println("requestURL ....: " + requestUrl);

		// Set the Content-Type header
		HttpHeaders requestHeaders = new HttpHeaders();
		requestHeaders.setContentType(new MediaType("application", "json"));

		HttpEntity requestEntity = new HttpEntity(requestHeaders);
		ResponseEntity<ProcessDefinitionDto[]> response = restTemplate
				.getForEntity(requestUrl, ProcessDefinitionDto[].class);
		ProcessDefinitionDto[] processDef = response.getBody();

		return processDef;
	}

	// Start process Instance with or without business key
	public ProcessInstanceDto startProcessInstance(String processName,
			String businessKey) {

		String requestUrl = restApiBasePath + reststartPIurl + processName
				+ "/start";
		System.out.println("requestUrl...:" + requestUrl);

		// Set the Content-Type header
		HttpHeaders requestHeaders = new HttpHeaders();
		requestHeaders.setContentType(new MediaType("application", "json"));

		if (businessKey == null) {
			String jsonString = "{\"businessKey\" : \"" + businessKey + "\"}";
			HttpEntity requestEntity = new HttpEntity(jsonString,
					requestHeaders);
			ResponseEntity<ProcessInstanceDto> response = restTemplate
					.postForEntity(requestUrl, requestEntity,
							ProcessInstanceDto.class);
			ProcessInstanceDto pid = response.getBody();
			System.out.println("Process InsId:" + pid.getId());
			return pid;
		} else {
			String jsonString = "{\"businessKey\" : \"" + businessKey + "\"}";
			HttpEntity requestEntity = new HttpEntity(jsonString,
					requestHeaders);
			ResponseEntity<ProcessInstanceDto> response = restTemplate
					.postForEntity(requestUrl, requestEntity,
							ProcessInstanceDto.class);

			ProcessInstanceDto pid = response.getBody();
			System.out.println("Process InsId:" + pid.getId());
			return pid;
		}
	}

	public int postCamundaVariable(String pId, String variableName,
			String variableValue) {

		// String url =
		// "http://localhost:8080/engine-rest/process-instance/"+pId+"/variables";

		String url = restApiBasePath + restPostPIVariableurl + pId
				+ "/variables";
		System.out.println("restPostPIVariableurl...:" + url);

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		ObjectMapper mapper = new ObjectMapper();

		String requestJson = "{\n" + "  \"modifications\": {\n" + "    \""
				+ variableName + "\": { \"value\": \"" + variableValue
				+ "\", \"type\": \"String\" }\n" + "  }\n" + "}";

		Map<String, Map<String, Map<String, String>>> jsonMap = new HashMap<String, Map<String, Map<String, String>>>();

		try {

			// convert JSON string to Map
			jsonMap = mapper.readValue(requestJson, Map.class);

			System.out.println("******************");
			System.out.println(jsonMap);

		} catch (Exception e) {
			e.printStackTrace();
		}
		ResponseEntity<String> response = restTemplate.postForEntity(url,
				jsonMap, String.class);
		System.out.println(response);
		int statusCode = response.getStatusCodeValue();
		return statusCode;
	}

	

	public int postMessageListenerTriggee(String msgListenerName,
			String bussinessKey) {

		// String url =
		// "http://localhost:8080/engine-rest/process-instance/"+pId+"/variables";

		String url = restApiBasePath + "/message";
		System.out.println("postMessageListenerTriggee...:" + url);

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		Map<String, String> reqJsonMap = new HashMap<String, String>();
		reqJsonMap.put("messageName", msgListenerName);
		reqJsonMap.put("businessKey", bussinessKey);
		System.out.println(reqJsonMap);
		ResponseEntity<String> response = restTemplate.postForEntity(url,
				reqJsonMap, String.class);
		System.out.println(response);
		int statusCode = response.getStatusCodeValue();
		return statusCode;
	}

	

	public void callCamundaCustomRestApi() {
		System.out.println("callCamundaCustomRestApi");
		String url = restApiBasePath + "/task/candidategroups/skilled";
		ResponseEntity<TaskDto[]> response = restTemplate.getForEntity(url,
				TaskDto[].class);
		System.out.println("callCamundaCustomRestApi");
	}
	
	public ProcessInstanceDto getProcessInstanceDto(String processInstanceId) {
		
		String url = restApiBasePath + "/process-instance/" + processInstanceId;

		System.out.println("restGetProcessInstanceDtoURL...:" + url);
		
		ResponseEntity<ProcessInstanceDto> response = restTemplate.getForEntity(url, ProcessInstanceDto.class);
		
		return response.getBody();
		
	}

	@Override
	public ProcessInstanceDto startProcessDefinitionsPO(String processName, Long businessKey) {
		String requestUrl = restApiBasePath + reststartPIurl + processName
				+ "/start";
		System.out.println("requestUrl...:" + requestUrl);

// Set the Content-Type header
		HttpHeaders requestHeaders = new HttpHeaders();
		requestHeaders.setContentType(new MediaType("application", "json"));

		String jsonString = "{\"businessKey\" : \""+ businessKey +"\"}";

		HttpEntity requestEntity = new HttpEntity(jsonString, requestHeaders);

		// ResponseEntity<ProcessInstanceDto> responseEntity =
		// restTemplate.exchange(requestUrl, HttpMethod.POST, requestEntity,
		// ProcessInstanceDto.class);

		ResponseEntity<ProcessInstanceDto> response = restTemplate
				.postForEntity(requestUrl, requestEntity,
						ProcessInstanceDto.class);

		ProcessInstanceDto pid = response.getBody();
		System.out.println("Process InsId:" + pid.getId());
		return pid;
	}
	@Override
	public int postPurchaseOrderDataToWorkflow(String pId, PurchaseOrderItemList purchaseOrder) {
		
		
		String url = restApiBasePath + restPostPIVariableurl + pId
		+ "/variables";
		System.out.println("restPostPIVariableurl...:" + url);



		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		// vendor.setVendorReply("");
		// vendor.setApproverQuery("");


		ObjectMapper mapper = new ObjectMapper();



		String requestJson = "{\n" + " \"modifications\": {\n" +
				" \"Item1\" : {\"value\": \""+purchaseOrder.getItem1()+"\", \"type\": \"String\" },\n"+
				" \"Item2\" : {\"value\": \""+purchaseOrder.getItem2()+"\", \"type\": \"String\" },\n"+
				" \"Item3\" : {\"value\": \""+purchaseOrder.getItem3()+"\", \"type\": \"String\" },\n"+
				
				" \"Check1\" : {\"value\": 1, \"type\": \"Integer\"}"
				+ "\n" + " }\n" + "}";
		
		System.out.println("requestJson...:" + requestJson);

		Map<String, Map<String, Map<String, String>>> jsonMap = new HashMap<String, Map<String, Map<String, String>>>();

try {



		// convert JSON string to Map
		jsonMap = mapper.readValue(requestJson, Map.class);



		System.out.println("******************");
		System.out.println(jsonMap);



		} catch (Exception e) {
		e.printStackTrace();
		}
		ResponseEntity<String> response = restTemplate.postForEntity(url,
		jsonMap, String.class);
		System.out.println(response);
		int statusCode = response.getStatusCodeValue();
		return statusCode;
		}
	
	//poget
	@Override
	public int postPODataToWorkflow(String pId, PurchaseOrderItemList poItem) {
	// TODO Auto-generated method stub
	String url = restApiBasePath + restPostPIVariableurl + pId
	+ "/variables";
	System.out.println("restPostPIVariableurl...:" + url);



	HttpHeaders headers = new HttpHeaders();
	headers.setContentType(MediaType.APPLICATION_JSON);
	ObjectMapper mapper = new ObjectMapper();



	String requestJson = "{\n" + " \"modifications\": {\n" +
	" \"Item1\" : {\"value\": \""+poItem.getItem1()+"\", \"type\": \"String\" },\n"+
	" \"Item2\" : {\"value\": \""+poItem.getItem2()+"\", \"type\": \"String\" },\n"+
	" \"Item3\" : {\"value\": \""+poItem.getItem3()+"\", \"type\": \"String\" },\n"+
	
	" \"Check1\" : {\"value\": 1, \"type\": \"Integer\"}"
	+ "\n" + " }\n" + "}";



	System.out.println("requestJson...:" + requestJson);



	Map<String, Map<String, Map<String, String>>> jsonMap = new HashMap<String, Map<String, Map<String, String>>>();



	try {



	// convert JSON string to Map
	jsonMap = mapper.readValue(requestJson, Map.class);



	System.out.println("******************");
	System.out.println(jsonMap);



	} catch (Exception e) {
	e.printStackTrace();
	}
	ResponseEntity<String> response = restTemplate.postForEntity(url,
	jsonMap, String.class);
	System.out.println(response);
	int statusCode = response.getStatusCodeValue();
	return statusCode;
	}	

	}


