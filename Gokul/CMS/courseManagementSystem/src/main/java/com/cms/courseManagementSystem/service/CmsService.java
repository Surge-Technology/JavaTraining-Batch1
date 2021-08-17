package com.cms.courseManagementSystem.service;




import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.cms.courseManagementSystem.model.Admin;
import com.cms.courseManagementSystem.repo.AdminRepo;

@Service
public class CmsService {

	@Autowired
	private AdminRepo repository;

	
	
//	public List<Admin>  listAll(int id)
//	
//	{ 
////	    Optional<Admin> admin = repository.findById(id);
////	    
////	if(admin.isPresent()) { return admin.get(); } 
////	
////	else { return null; } 
////	
////	}
////		Admin admin;
////		
////		while(repository.findAll() != null)
////		{
////			if(admin.getUname().equals(repository.))
////			{
////				
////			}
//		}
//	}
	
	public List<Admin> fetch ()
	{
	return (List<Admin>) repository.findAll();
	}
	
}
