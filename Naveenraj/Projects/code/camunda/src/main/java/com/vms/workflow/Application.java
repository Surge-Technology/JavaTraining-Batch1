package com.vms.workflow;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.TaskService;
import org.camunda.bpm.engine.impl.RuntimeServiceImpl;
import org.camunda.bpm.engine.management.TableMetaData;
import org.camunda.bpm.engine.task.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;
import java.util.Map;

import org.camunda.bpm.engine.ManagementService;
import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.ProcessEngines;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.vms")
public class Application {

	@Autowired
	private RuntimeService runtimeService;

	@Autowired
	private ManagementService managementService;

	private ProcessEngine processEngine;

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
		
		Application app = new Application();

		/*app.getProcessEngine();

		TaskService taskService = app.processEngine.getTaskService();

		List<Task> taskListBharani = taskService.createTaskQuery().taskAssignee("bharani").list();
		List<Task> taskListPrem = taskService.createTaskQuery().taskAssignee("prem").list();
		List<Task> taskListSubbu = taskService.createTaskQuery().taskAssignee("subbu").list();*/

	}

	public void getProcessEngine() {
		processEngine = ProcessEngines.getDefaultProcessEngine();

	}
}