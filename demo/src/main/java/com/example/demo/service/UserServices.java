package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserServices {
	
	@Autowired
	private UserRepository repository;

	public User save(User user) {
		
		user = repository.save(user);
		
		return user;
	}
	
	public User get(Long id) {
		
		User user = repository.findById(id).orElse(new User());
				
		return user;
	}
}
