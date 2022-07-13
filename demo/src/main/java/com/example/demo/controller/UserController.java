package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Users;
import com.example.demo.service.UserServices;

@RestController
public class UserController {

	@Autowired
	private UserServices service;
	
	@GetMapping(value = "/user/{login}")
	public Users helloWorld(@PathVariable(name = "login") String login) {
		
		Users user = service.get(login);
		
		return user;
	}
	
	@PostMapping(value = "/user")
	public Users methodPost(@RequestBody Users user) {
		
		user = service.save(user);
		
		return user;
	}
	
}
