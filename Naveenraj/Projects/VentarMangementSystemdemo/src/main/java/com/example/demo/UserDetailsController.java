package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserDetailsController {

    @Autowired
    UserService service;
	
	@GetMapping("/fetch1")
	
	public List<UserDetails> getalluser()
	{
		return service.getuserdetails();
	
	}
	
	@GetMapping("/getid/{id}")
	
	public UserDetails getpartId(@PathVariable Long id)
	
	{
		return service.getuseriddetails(id);
	}

}

