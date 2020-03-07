package com.fi.springboot.onlineparkingsystem.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fi.springboot.onlineparkingsystem.entity.Owner;

@Service
public interface OwnerService 
{
	List<Owner> getAllOwners();
	Owner getOwnerById(int id);
	int login(String userName,String password);
	public Owner registerOwner(Owner owner);
	public ResponseEntity<Owner> updateOwner(int id,Owner owmerDetails);
	public String deleteOwner(int id);
}
