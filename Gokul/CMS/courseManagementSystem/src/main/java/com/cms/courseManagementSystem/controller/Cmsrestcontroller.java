package com.cms.courseManagementSystem.controller;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cms.courseManagementSystem.model.Admin;
import com.cms.courseManagementSystem.repo.AdminRepo;

@RestController
public class Cmsrestcontroller {
	
	@Autowired
	private AdminRepo repository;
//	private Admin admin;
	
//	@GetMapping("fetch")
//	public List<Admin> fetch ()
//	{
//		return (List<Admin>) repository.findAll();
//	}
//	   
//		Iterator<Admin> itr = (Iterator<Admin>) repository.findAll();
//		 while(itr.hasNext())
//		{
//		if(uname.equals(admin.getUname()) && psw.equals(admin.getPassword()))
//		{
//			System.out.println("Success");
//		}
//		else
//		{
//			System.out.println("sorry");
//		}
//		}
//		return null;
//	}

}
