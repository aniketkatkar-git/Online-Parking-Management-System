package com.fi.springboot.onlineparkingsystem.service;

import org.springframework.stereotype.Service;

@Service
public interface AdminService 
{
	int login(String userName,String password);
}