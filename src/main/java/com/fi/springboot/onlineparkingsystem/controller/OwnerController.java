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

import com.fi.springboot.onlineparkingsystem.entity.Owner;
import com.fi.springboot.onlineparkingsystem.service.OwnerService;

@RestController
@RequestMapping("owner")
@CrossOrigin("http://localhost:4200")
public class OwnerController 
{
	@Autowired
	OwnerService ownerService;
	
	@GetMapping("getAllOwners")
	public List<Owner>getAllOwners()
	{
		return ownerService.getAllOwners();
	}
	
	@GetMapping("getOwnerById")
	public Owner getOwnerById(@RequestParam(name="id") int id)
	{
		return ownerService.getOwnerById(id);
	}
	
	@GetMapping("login")
	public int  validate(@RequestParam(name="o_username") String Username,@RequestParam(name="o_password") String Password)
	{
		 return ownerService.login(Username, Password);
	}
	
	@PostMapping("registerOwner")
	public Owner registerOwner(@RequestBody Owner owner)
	{
		return ownerService.registerOwner(owner);
	}
	
	@PutMapping("updateOwner/{id}")
	public ResponseEntity<Owner> updateOwner(@PathVariable(value="id") int id,@RequestBody Owner ownerDetails)
	{
		return ownerService.updateOwner(id, ownerDetails);
	}
	
	@DeleteMapping("deleteOwner/{id}")
	public String deleteOwner(@PathVariable int id)
	{
		return ownerService.deleteOwner(id);
	}
}
