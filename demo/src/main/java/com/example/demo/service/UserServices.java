package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Users;
import com.example.demo.repository.UserRepository;

@Service
public class UserServices {
	
	@Autowired
	private UserRepository repository;

	public Users save(Users user) {
		
		user = repository.save(user);
		
		return user;
	}
	
	public Users get(String login) {
		
		Users user = repository.findByLogin(login);
				
		return user;
	}
}
