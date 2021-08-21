package com.cms.courseManagementSystem.controller;



import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.servlet.ModelAndView;

import com.cms.courseManagementSystem.model.Admin;
import com.cms.courseManagementSystem.model.InstructorRegistration;
import com.cms.courseManagementSystem.repo.AdminRepo;
import com.cms.courseManagementSystem.repo.InstructorRegistrationRepo;
import com.cms.courseManagementSystem.service.CmsService;



@Controller
public class CMSController {
	
	@Autowired
	private CmsService service;
	private AdminRepo repository;
	private Admin admin;
	private InstructorRegistration ir;
	private InstructorRegistrationRepo irrepository;
	
	
	@RequestMapping("home")
	public String home()
	{
		return "home";
	}

	@RequestMapping("admin")
	public String admin()
	{
		return "admin";
	}

	@RequestMapping("instructorregistration")
	public String getinstructor()
	{
		return "instructorRegistration";
	}
	
	@RequestMapping("fetch")
	public String validate(@RequestParam String uname , String psw)
	{
		
		for(Admin ad : service.fetch())
		{
			if(uname.equals(ad.getUname()) && psw.equals(ad.getPassword()))
			{
				
	             return "Success";
			}
			else
			{
				return "Error";
			}
		}
		return null;
	}
	
	@RequestMapping(value = "isave", method = RequestMethod.POST)
	public InstructorRegistration saverecipe(InstructorRegistration ir1) {
	
	return service.save(ir1);
	}
	
	
}
