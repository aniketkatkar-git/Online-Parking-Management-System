package com.fi.springboot.onlineparkingsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fi.springboot.onlineparkingsystem.entity.Request;
import com.fi.springboot.onlineparkingsystem.repository.RequestRepository;

@Service
public class RequestServiceImpl implements RequestService 
{
	@Autowired
	RequestRepository requestRepository;

	@Override
	public List<Request> getAllRequest() 
	{
		return requestRepository.findAll();
	}

	@Override
	public Request getRequestById(long id) 
	{
		return requestRepository.findById(id).get();
	}

	@Override
	public Request registerRequest(Request request) 
	{
		return requestRepository.save(request);
	}

	@Override
	public ResponseEntity<Request> updateRequest(long id, Request requestDetails) 
	{
		Request request=requestRepository.findById(id).get();

		request.setAddress(requestDetails.getAddress());
		request.setCount(requestDetails.getCount());
		request.setStatus(requestDetails.getStatus());

		final Request updateRequest=requestRepository.save(request);
		return ResponseEntity.ok(updateRequest);
	}

	@Override
	public String deleteRequest(long id) 
	{
		Optional<Request> request=requestRepository.findById(id);
		if(request.isPresent())
		{
			requestRepository.delete(request.get());
			return " Request is deleted ";
		}
		else
		{
			throw new RuntimeException("Request not found for the id : "+ id);
		}
	}
}