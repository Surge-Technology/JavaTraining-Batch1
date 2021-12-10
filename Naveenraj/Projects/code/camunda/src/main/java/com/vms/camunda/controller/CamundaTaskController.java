package com.vms.camunda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vms.camunda.integrator.VMSService;

import java.util.ArrayList;
import java.util.List;

import org.camunda.bpm.engine.filter.Filter;
import org.camunda.bpm.engine.rest.dto.runtime.FilterDto;
import org.camunda.bpm.engine.rest.dto.task.TaskDto;
import org.camunda.bpm.engine.task.Task;

@RestController
@Validated
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CamundaTaskController {

	@Autowired
	private VMSService vmsService;

	// Find
	@GetMapping("/demotask/{userName}")
	List getTaskByUser(@PathVariable String userName) {

		List<TaskDto> taskDtoList = vmsService.getTaskListByuser(userName);

		System.out.println("done done...:");

		return taskDtoList;

	}

	// Find
	@GetMapping("/task/candidategroups/{candidateGroup}")
	List getTaskListByCandidateGroup(@PathVariable String candidateGroup) {

		List<String> candidateGrpList = new ArrayList<String>();

		candidateGrpList.add(candidateGroup);

		List<TaskDto> taskDtoList = vmsService.getTaskListByCandidateGroup(candidateGroup);

		return taskDtoList;

	}

	// Find
	@GetMapping("/task/candidategroupList/")
	List<TaskDto> getTaskListByCandidateGroupList(@RequestParam("candidateGroupIds") List<String> candidateGroupIds) {

		System.out.println(candidateGroupIds);

		List<TaskDto> taskDtoList = vmsService.getTaskListByCandidateGroupList(candidateGroupIds);

		return taskDtoList;

	}

	@PostMapping("/create/{filterName}/{ownerName}")
	// ResponseEntity<List> getTaskByUser() {
	FilterDto getTaskByUser(@PathVariable String filterName, @PathVariable String ownerName) {

		FilterDto newFilterDto = vmsService.createFilterByOwner(ownerName, filterName);
		return newFilterDto;

	}

}