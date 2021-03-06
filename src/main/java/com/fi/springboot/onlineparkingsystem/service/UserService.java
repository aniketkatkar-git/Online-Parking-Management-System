package com.fi.springboot.onlineparkingsystem.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fi.springboot.onlineparkingsystem.entity.User;

@Service
public interface UserService 
{
	List<User> getAllUsers();
	User getUserById(long id);
	int login(String userName,String password);
	public User registerUser(User user);
	public ResponseEntity<User> updateUser(long id,User userDetails);
	public String deleteUser(long id);
}