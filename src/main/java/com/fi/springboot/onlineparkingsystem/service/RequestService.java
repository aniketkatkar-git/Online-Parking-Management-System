package com.fi.springboot.onlineparkingsystem.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fi.springboot.onlineparkingsystem.entity.Request;

@Service
public interface RequestService
{
	List<Request> getAllRequest();
	Request getRequestById(long id);
	public Request registerRequest(Request request);
	public ResponseEntity<Request> updateRequest(long id,Request requestDetails);
	public String deleteRequest(long id);
}