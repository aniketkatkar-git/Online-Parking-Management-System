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

import com.fi.springboot.onlineparkingsystem.entity.Manager;
import com.fi.springboot.onlineparkingsystem.service.ManagerService;

@RestController
@RequestMapping("manager")
@CrossOrigin("http://localhost:4200")
public class ManagerController 
{
	@Autowired
	ManagerService managerService;
	
	@GetMapping("getAllManagers")
	public List<Manager>getAllManagers()
	{
		return managerService.getAllManagers();
	}
	
	@GetMapping("getManagerById")
	public Manager getManagerById(@RequestParam(name="id") int id)
	{
		return managerService.getManagerById(id);
	}
	
	@GetMapping("login")
	public int  validate(@RequestParam(name="m_username") String Username,@RequestParam(name="m_password") String Password)
	{
		 return managerService.login(Username, Password);
	}
	
	@PostMapping("registerManager")
	public Manager registerManager(@RequestBody Manager manager)
	{
		return managerService.registerManager(manager);
	}
	
	@PutMapping("updateManager/{id}")
	public ResponseEntity<Manager> updateManager(@PathVariable(value="id") int id,@RequestBody Manager managerDetails)
	{
		return managerService.updateManager(id, managerDetails);
	}
	
	@DeleteMapping("deleteManager/{id}")
	public String deleteManager(@PathVariable int id)
	{
		return managerService.deleteManager(id);
	}
}
