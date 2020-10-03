package com.fi.springboot.onlineparkingsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fi.springboot.onlineparkingsystem.entity.User;
import com.fi.springboot.onlineparkingsystem.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService 
{
	@Autowired
	UserRepository userRepository;

	@Override
	public List<User> getAllUsers() 
	{
		return userRepository.findAll();
	}

	@Override
	public User getUserById(long id) 
	{
		return userRepository.findById(id).get();
	}


	@Override
	public int login(String userName, String password) 
	{
		List<User> user= userRepository.validation(userName, password);

		if(user.isEmpty())
			return 0;			
		else
			return 1;			
	}

	@Override
	public User registerUser(User user) 
	{
		return userRepository.save(user);
	}

	@Override 
	public ResponseEntity<User>updateUser(long id,User userDetails)
	{
		User user=userRepository.findById(id).get();

		user.setUsername(userDetails.getUsername());
		user.setPassword(userDetails.getPassword());
		user.setFirst_name(userDetails.getFirst_name());
		user.setLast_name(userDetails.getLast_name());
		user.setEmail(userDetails.getEmail());
		user.setContact_no(userDetails.getContact_no());
		user.setAddress(userDetails.getAddress());

		final User updateUser=userRepository.save(user);
		return ResponseEntity.ok(updateUser);
	}

	@Override
	public String deleteUser(long id) 
	{
		Optional<User> user=userRepository.findById(id);
		if(user.isPresent())
		{
			userRepository.delete(user.get());
			return " User is deleted ";
		}
		else
		{
			throw new RuntimeException("User not found for the id : "+ id);
		}
	}
}