package com.BikkadIT.SpringMvcCrudUsingDataJpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.BikkadIT.SpringMvcCrudUsingDataJpa.model.User;
import com.BikkadIT.SpringMvcCrudUsingDataJpa.service.UserServiceI;

@Controller
public class UserController {

	@Autowired
	private UserServiceI userServiceI;

	@GetMapping("/welcome")
	public String loadForm() {
		return "welcome";

	}

	@PostMapping("/saveUser")
	public String saveUser(User user) {

		System.out.println(user);
		User saveUser = userServiceI.saveUser(user);
		
		if(saveUser !=null) {
			return "UserSuccess";
		}else {
			return "RegiFail";
		}

	}

}