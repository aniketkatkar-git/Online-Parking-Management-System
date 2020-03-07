package com.fi.springboot.onlineparkingsystem.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fi.springboot.onlineparkingsystem.service.AdminService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("admin")

public class AdminController 
{
	@Autowired
	AdminService adminService;
	
	@GetMapping("login")
	public int  validate(@RequestParam(name="a_username") String Username,@RequestParam(name="a_password") String Password)
	{
		 return adminService.login(Username, Password);
	}
}
