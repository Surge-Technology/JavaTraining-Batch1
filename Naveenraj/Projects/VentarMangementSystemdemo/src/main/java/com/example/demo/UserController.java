package com.example.demo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
	
	@Autowired
	 UserDetailsRepo userrepo;
	
	
	
	@GetMapping("/page")
	    public String viewHomePage() {
	        return "index";
	    }
	
	
	@GetMapping("/Register")
	
    public String showRegistrationForm(Model model) {
	      model.addAttribute("userse",new UserDetails());
		
		return "Login_form";
	}
	
	 @PostMapping("/process_register")
	    public String processRegister(UserDetails user) {
	    
	         
		userrepo.save(user);
	         
	        return "register_success";
	    }
	
	

}
