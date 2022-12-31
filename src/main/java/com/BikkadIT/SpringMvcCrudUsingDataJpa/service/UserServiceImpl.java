package com.BikkadIT.SpringMvcCrudUsingDataJpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BikkadIT.SpringMvcCrudUsingDataJpa.model.User;
import com.BikkadIT.SpringMvcCrudUsingDataJpa.repository.UserRepository;

@Service
public class UserServiceImpl implements UserServiceI{

	@Autowired
	private UserRepository userRepository;

	@Override
	public User saveUser(User user) {
		
		User save = userRepository.save(user);
		return save;
	}
	
}