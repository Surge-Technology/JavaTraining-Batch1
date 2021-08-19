package com.cms.courseManagementSystem.service;




import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.cms.courseManagementSystem.model.Admin;
import com.cms.courseManagementSystem.model.InstructorRegistration;
import com.cms.courseManagementSystem.repo.AdminRepo;
import com.cms.courseManagementSystem.repo.InstructorRegistrationRepo;

@Service
public class CmsService {

	@Autowired
	private AdminRepo repository;
	private InstructorRegistrationRepo irrepository;
	private InstructorRegistration ir;

	
	
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
	
	
	
//	public InstructorRegistration instructorSave()
//	{
//		return irrepository.save(ir);
//	}
	
	public InstructorRegistration save(InstructorRegistration ir1) {
		return irrepository.save(ir1);
		}
}
