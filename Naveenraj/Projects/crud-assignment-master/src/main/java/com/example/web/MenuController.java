package com.example.web;



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
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


import com.example.exception.RecordNotFoundException;
import com.example.demo.MenuEntity;
import com.example.service.MenuService;

@RestController
@RequestMapping("/dishes")
public class MenuController
{
    @Autowired
    MenuService service;
 
    @GetMapping("/getalldishes")
    public ResponseEntity<List<MenuEntity>> getAllDish() {
        List<MenuEntity> list = service.getAllDish();
 
        return new ResponseEntity<List<MenuEntity>>(list, new HttpHeaders(), HttpStatus.OK);
    }
 
	
	  @GetMapping("/{id}")
	  public ResponseEntity<MenuEntity>
	  getdishById(@PathVariable("id") Long id) throws RecordNotFoundException {
	  MenuEntity entity = service.getDishById(id);
	  
	  return new ResponseEntity<MenuEntity>(entity, new HttpHeaders(),
	  HttpStatus.OK); }
	  
	
 
    @PostMapping
    public ResponseEntity<MenuEntity> createOrUpdateDish(@RequestBody MenuEntity dish)
                                                    throws RecordNotFoundException {
        MenuEntity updated = service.createOrUpdateDish(dish);
        return new ResponseEntity<MenuEntity>(updated, new HttpHeaders(), HttpStatus.CREATED);
    }
 
    @DeleteMapping("/{id}")
    public HttpStatus deleteDishById(@PathVariable("id") Long id)
                                                    throws RecordNotFoundException {
        service.deleteDishById(id);
        return HttpStatus.FORBIDDEN;
    }
 
}