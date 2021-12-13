package com.example.crud.Services;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.crud.Entity.EmpTable;


import com.example.crud.Repo.EmpTableRepo;



@Service
public class EmpService {

	
	
	
	
	
	
	
	
	
	
	
	
	
	
@Autowired
EmpTableRepo repository;

public List<EmpTable> getAllEmp()
{
List<EmpTable> list = repository.findAll();

if(list.size() > 0) {
return list;
} else {
return new ArrayList<EmpTable>();
}
}



  public EmpTable getEmpById(Long id) throws Exception { Optional<EmpTable> emp
  = repository.findById(id);
  
  if(emp.isPresent()) { return emp.get(); } else { throw new
  Exception("No Employee record exist for given id"); } }
 




 
public EmpTable createOrUpdateEmp(EmpTable entity) 
{
Optional<EmpTable> list = repository.findById(entity.getId());

//Optional<EmpTable> emp = Optional.empty();
if(list.isPresent())
{
	EmpTable newEntity = list.get();



newEntity.setName(entity.getName());
newEntity.setMail(entity.getMail());


newEntity = repository.save(newEntity);

return newEntity;
} else {
entity = repository.save(entity);

return entity;
}
}

public void deleteEmpById(Long id) 
{
Optional<EmpTable> emp = repository.findById(id);

if(emp.isPresent())
{
repository.deleteById(id);
} 
}
}




