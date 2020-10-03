package com.fi.springboot.onlineparkingsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fi.springboot.onlineparkingsystem.entity.Admin;
import com.fi.springboot.onlineparkingsystem.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService 
{
	@Autowired
	AdminRepository  adminRepository;

	@Override
	public int login(String userName, String password) 
	{
		List<Admin> admin= adminRepository.validation(userName, password);

		if(admin.isEmpty())
			return 0;			
		else
			return 1;			

	}
}