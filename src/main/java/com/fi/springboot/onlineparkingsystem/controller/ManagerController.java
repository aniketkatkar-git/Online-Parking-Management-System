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
@RequestMapping
@CrossOrigin("http://localhost:4200")
public class ManagerController 
{
	@Autowired
	ManagerService managerService;

	@GetMapping("api/manager")
	public List<Manager>getAllManagers()
	{
		return managerService.getAllManagers();
	}

	@GetMapping("api/manager/{id}")
	public Manager getManagerById(@RequestParam(name="id") int id)
	{
		return managerService.getManagerById(id);
	}

	@GetMapping("api/manager/login")
	public int  validate(@RequestParam(name="musername") String Username,@RequestParam(name="spassword") String Password)
	{
		return managerService.login(Username, Password);
	}

	@PostMapping("api/manager")
	public Manager registerManager(@RequestBody Manager manager)
	{
		return managerService.registerManager(manager);
	}

	@PutMapping("api/manager/{id}")
	public ResponseEntity<Manager> updateManager(@PathVariable(value="id") long id,@RequestBody Manager managerDetails)
	{
		return managerService.updateManager(id, managerDetails);
	}

	@DeleteMapping("api/manager/{id}")
	public String deleteManager(@PathVariable long id)
	{
		return managerService.deleteManager(id);
	}
}