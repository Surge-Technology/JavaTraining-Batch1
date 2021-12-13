package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	UserDetailsRepo userRepo1;
	
	public List<UserDetails> getuserdetails()
	{
		return userRepo1.findAll();
		
	}
	
	public UserDetails getuseriddetails(Long id)
	{
		return userRepo1.findById(id).orElse(null);
	}

}

