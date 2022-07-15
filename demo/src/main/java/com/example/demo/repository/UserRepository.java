package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	//Both methods have the same result
    @Query("select u From User u where u.login = ?1")
    public User findUserByMyCustomQueryMethod(String login);

    public User findByLogin(String login);

}
