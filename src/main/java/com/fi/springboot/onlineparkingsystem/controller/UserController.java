package com.fi.springboot.onlineparkingsystem.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.fi.springboot.onlineparkingsystem.entity.User;
import com.fi.springboot.onlineparkingsystem.service.UserService;

@RestController
@RequestMapping
@CrossOrigin("http://localhost:4200")
public class UserController
{
	@Autowired
	UserService userService;

	@GetMapping("api/users")
	public List<User>getAllUsers()
	{
		return userService.getAllUsers();
	}

	@GetMapping("api/users/{id}")
	public User getUserById(@RequestParam(name="id") long id)
	{
		return userService.getUserById(id);
	}

	@GetMapping("api/users/login")
	public int  validate(@RequestParam(name="username") String Username,@RequestParam(name="password") String Password)
	{
		return userService.login(Username, Password);
	}

	@PostMapping("api/users")
	public User registerArea(@RequestBody User user)
	{
		return userService.registerUser(user);
	}

	@PutMapping("api/users/{id}")
	public ResponseEntity<User> updateUser(@PathVariable(value="id") long id,@RequestBody User userDetails)
	{
		return userService.updateUser(id, userDetails);
	}

	@DeleteMapping("api/users/{id}")
	public String deleteUser(@PathVariable long id)
	{
		return userService.deleteUser(id);
	}

}