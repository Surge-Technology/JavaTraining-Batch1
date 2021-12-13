/*
 * package com.example.workflow.controller;
 * 
 * 
 * 
 * 
 * 
 * import org.camunda.bpm.engine.RuntimeService; import
 * org.springframework.beans.factory.annotation.Autowired;
 * 
 * import org.springframework.http.HttpHeaders; import
 * org.springframework.http.HttpStatus; import
 * org.springframework.http.ResponseEntity;
 * 
 * import org.springframework.web.bind.annotation.*;
 * 
 * import com.example.workflow.entity.EmpTable; import
 * com.example.workflow.serviceimpl.TableServiceImpl;
 * 
 * 
 * 
 * 
 * 
 * @RestController
 * 
 * public class VendorCompanyController {
 * 
 * @Autowired private TableServiceImpl tableService;
 * 
 * @Autowired private RuntimeService runtimeService;
 * 
 * @PostMapping public ResponseEntity<EmpTable> addList(@RequestBody EmpTable
 * empdetail) { EmpTable updated = tableService.addList(empdetail);
 * 
 * runtimeService.startProcessInstanceByKey("camundaflow"); return new
 * ResponseEntity<EmpTable>(updated, new HttpHeaders(), HttpStatus.CREATED);
 * 
 * 
 * } }
 */