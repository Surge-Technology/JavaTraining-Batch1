package com.example.workflow.delegate;


import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service("Delegate")
public class Delegate implements JavaDelegate {

	@Autowired
	RestTemplate RestTemp;

	@Override
	public void execute(DelegateExecution execution) {
		
		String url = "http://localhost:8081/gateway";
		String obj = RestTemp.getForObject(url, String.class);
		execution.setVariable("value", obj);
		System.out.println(obj);

	}

}