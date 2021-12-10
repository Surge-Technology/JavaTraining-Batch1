
  package com.example.workflow.integerator;
  
  
  
  import org.camunda.bpm.engine.rest.dto.repository.ProcessDefinitionDto;
  import org.camunda.bpm.engine.rest.dto.runtime.ProcessInstanceDto;
  
  import com.example.workflow.entity.PurchaseOrderItemList;


  
  public interface CamundaProcessInstanceService {
  
  public ProcessInstanceDto startProcessDefinitions(String processName, String
  businessKey);
  
  public ProcessInstanceDto startProcessDefinitionsPO(String processName, Long
  businesskey);
  
  public int postCamundaVariable(String pId, String variableName, String
  variableValue);
  
  public int postMessageListenerTriggee(String msgListenerName, String
  bussinessKey);
  
  
  public void callCamundaCustomRestApi();
  
  public ProcessInstanceDto startProcessInstance(String processName, String
  businessKey);
  
  public ProcessInstanceDto getProcessInstanceDto(String processInstanceId);
  
  public ProcessDefinitionDto[] getAllProcessDefinitionName();
  
  public int postPurchaseOrderDataToWorkflow(String id, PurchaseOrderItemList
  purchaseOrder);
  
  int postPODataToWorkflow(String pId, PurchaseOrderItemList poItem);
  
  }
 