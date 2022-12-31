package com.BikkadIT.SpringMvcCrudUsingDataJpa.service;

import org.springframework.stereotype.Service;

import com.BikkadIT.SpringMvcCrudUsingDataJpa.model.User;

public interface UserServiceI {
	public User saveUser(User user);

}
