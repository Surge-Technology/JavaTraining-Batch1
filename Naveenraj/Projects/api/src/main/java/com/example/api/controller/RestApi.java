package com.example.api.controller;




import java.util.Scanner;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.service.Ds;

@RestController




public class RestApi {
	
	
	@Autowired
	public Ds nav;
	@GetMapping("/naveen")
	public int naveen() {
		
		return nav.i;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	@GetMapping("/check")
	public String rainy() {
		return "hello world";
	}

	@GetMapping("/restcall")
	public String callapi() {
		return "hello world";

	}

	@GetMapping("/gateway")
	public  String service() {
	           
		/*
		 * public void execute(DelegateExecution execution) throws Exception {
		 * System.out.println("2nd workflow started");
		 */
			
		//int inputnumber = (int) ((VariableScope) execution).getVariable("inputnumber");
			  
			  //System.out.println("Name is : " +inputname);
			 
				/*
				 * 
				 * 
				 *
				 * 
				 * System.out.println("Company Name is : " +empname);
				 */
			//String empname = "naveenraj";
			
			 //((VariableScope) execution).setVariable("inputnumber", inputnumber);
		
		Scanner inputnumber = new Scanner(System.in);
		int i = inputnumber.nextInt();
			if(i < 1) {
				return "user1";
				
			} else if (i > 5) {
				return "user2";
			} else  {
				return "user3";
			}
		
		
	}
	
	
	
	

	

}
//int i = 0;
