package com.camundabatch1.delegate;

import org.camunda.bpm.engine.ProcessEngine;
import org.camunda.bpm.engine.ProcessEngines;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;

public class EmailRejectDelegator implements JavaDelegate {
@Autowired
RuntimeService runtimeService;

 @Override
public void execute(DelegateExecution execution) throws Exception {
ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
 RuntimeService runtimeService = processEngine.getRuntimeService();

 runtimeService.startProcessInstanceByKey("service2");
//runtimeService.startProcessInstanceByKey("loanApproval");
 System.out.println("From email reject delegator class");
 
 

 }

}