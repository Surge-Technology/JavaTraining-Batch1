package com.cms.courseManagementSystem.repo;

//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cms.courseManagementSystem.model.Admin;

@Repository
public interface AdminRepo extends CrudRepository<Admin,Integer>{
	
	

}
