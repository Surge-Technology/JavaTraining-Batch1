package com.cmundabatch1.main;


import java.util.List;

import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;

//import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


 

@SpringBootApplication
//@EnableProcessApplication
public class Application {

	/*
	 * @Autowired private RuntimeService runtimeService;
	 */

  public static void main(String... args)
  
  
  {
      ScriptEngineManager sem = new ScriptEngineManager();
      List<ScriptEngineFactory> factories = sem.getEngineFactories();
      for (ScriptEngineFactory factory : factories)
          System.out.println(factory.getEngineName() + " " + factory.getEngineVersion() + " " + factory.getNames());
      if (factories.isEmpty())
          System.out.println("No Script Engines found");
      
      
      
      SpringApplication.run(Application.class, args);
    
  }

	/*
	 * @EventListener private void processPostDeploy(PostDeployEvent event) {
	 * runtimeService.startProcessInstanceByKey("loanApproval"); }
	 */


}

