package com.vms.workflow;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.DelegateTask;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;

import com.vms.camunda.integrator.VMSService;
import com.vms.camunda.integrator.VMSServiceImpl;

import org.camunda.bpm.engine.impl.RuntimeServiceImpl;
import org.camunda.bpm.engine.impl.runtime.*;
import org.camunda.bpm.engine.runtime.ProcessInstance;

import java.util.List;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.ProcessEngines;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.TaskService;
import org.camunda.bpm.engine.task.Task;

public class TaskDemoUserAssignment implements org.camunda.bpm.engine.delegate.TaskListener {

	private ProcessEngine processEngine;

	@Override
	public void notify(DelegateTask taskDemo) {

		System.out.println("TaskDemoUserAssignment Called...." + taskDemo.getAssignee());

		getProcessEngine();

		TaskService taskService = processEngine.getTaskService();

		List<Task> taskListBharani = taskService.createTaskQuery().taskAssignee("bharani").list();
		List<Task> taskListPrem = taskService.createTaskQuery().taskAssignee("prem").list();
		List<Task> taskListSubbu = taskService.createTaskQuery().taskAssignee("subbu").list();

	}

	public void getProcessEngine() {
		processEngine = ProcessEngines.getDefaultProcessEngine();

	}
}
