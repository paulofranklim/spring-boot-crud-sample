package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long>{

	@Query("select u From Users u where u.login = ?1")
	public Users findUserByLogin(String login);
	
	public Users findByLogin(String login);
}
