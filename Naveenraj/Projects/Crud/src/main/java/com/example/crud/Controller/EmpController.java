package com.example.crud.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.crud.Entity.EmpTable;

import com.example.crud.Services.EmpService;
import com.example.crud.Services.MyTest;

@RestController
//@RequestMapping("/emp")
public class EmpController
{
@Autowired
EmpService service;
@Autowired
MyTest serv;

/*
 * @GetMapping("/getallemp") public ResponseEntity<List<EmpTable>> getAllemp() {
 * List<EmpTable> list = service.getAllEmp();
 * 
 * return new ResponseEntity<List<EmpTable>>(list, new HttpHeaders(),
 * HttpStatus.OK); }
 */


@GetMapping("/getallemp")
public List<EmpTable> getAllemp() 
{
List<EmpTable> list = service.getAllEmp();
return list;
}

  
  @GetMapping("/{id}") public ResponseEntity<EmpTable>
  getempById(@PathVariable("id") Long id) throws Exception { EmpTable entity =
  service.getEmpById(id);
  
  return new ResponseEntity<EmpTable>(entity, new HttpHeaders(),
  HttpStatus.OK); }
 
 




@PostMapping
public ResponseEntity<EmpTable> createOrUpdateemp(@RequestBody EmpTable emp)
 {
	EmpTable updated = service.createOrUpdateEmp(emp);
return new ResponseEntity<EmpTable>(updated, new HttpHeaders(), HttpStatus.CREATED);
}

@DeleteMapping("/{id}")
public HttpStatus deleteempById(@PathVariable("id") Long id)
 {
service.deleteEmpById(id);
return HttpStatus.FORBIDDEN;
}

@GetMapping("/get")
public String get() 
{
	String sara = serv.myJSON(null);
	System.out.println(sara);
return sara;
}

}