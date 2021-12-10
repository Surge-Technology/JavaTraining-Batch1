package com.vms.camunda.integrator;



import java.util.List;

import org.camunda.bpm.engine.filter.Filter;
import org.camunda.bpm.engine.rest.dto.runtime.FilterDto;
import org.camunda.bpm.engine.rest.dto.task.TaskDto;
import org.camunda.bpm.engine.task.Task;

public interface VMSService {
    
    public void sendRejectEmail();
    
    public void sendApproveEmail();
    
    public void sendApproverQuery(String PID, String qry);
    
    public void updatePIDStatus(String PID, String newStatus);
    
    public List<TaskDto> getTaskListByuser(String userName);
    
    public List<TaskDto> getTaskListByCandidateGroup(String candidateGroup);
    
	public List<TaskDto> getTaskListByCandidateGroupList(List<String> candidateUserList);
    
    public FilterDto createFilterByOwner(String ownerName, String filterName);
    
    
    
   // public void tbd();
   
}
