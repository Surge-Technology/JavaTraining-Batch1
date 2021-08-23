package com.cms.courseManagementSystem.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.cms.courseManagementSystem.model.InstructorRegistration;

@Repository
public interface InstructorRegistrationRepo extends CrudRepository<InstructorRegistration,Integer> {

}
