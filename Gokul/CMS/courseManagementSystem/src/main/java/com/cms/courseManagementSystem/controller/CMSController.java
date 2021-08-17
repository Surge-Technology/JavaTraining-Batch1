package com.cms.courseManagementSystem.controller;



import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.servlet.ModelAndView;

import com.cms.courseManagementSystem.model.Admin;
import com.cms.courseManagementSystem.repo.AdminRepo;
import com.cms.courseManagementSystem.service.CmsService;



@Controller
public class CMSController {
	
	@Autowired
	private CmsService service;
	private AdminRepo repository;
	private Admin admin;
	
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
	
	
	
	
}
