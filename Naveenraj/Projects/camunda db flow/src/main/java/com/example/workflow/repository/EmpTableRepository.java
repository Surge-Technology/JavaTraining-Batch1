package com.example.workflow.repository;


import org.springframework.stereotype.Repository;

import com.example.workflow.entity.EmpTable;

import org.springframework.data.repository.CrudRepository;





@Repository
public interface EmpTableRepository extends CrudRepository<EmpTable, Long> {


}