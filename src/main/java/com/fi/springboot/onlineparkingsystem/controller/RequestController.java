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

import com.fi.springboot.onlineparkingsystem.entity.Request;
import com.fi.springboot.onlineparkingsystem.service.RequestService;

@RestController
@RequestMapping
@CrossOrigin("http://localhost:4200")
public class RequestController
{
	@Autowired
	RequestService requestService;

	@GetMapping("api/requests")
	public List<Request>getAllRequest()
	{
		return requestService.getAllRequest();
	}

	@GetMapping("api/requests/{id}")
	public Request getRequestById(@RequestParam(name="id") long id)
	{
		return requestService.getRequestById(id);
	}


	@PostMapping("api/requests")
	public Request registerRequest(@RequestBody Request request)
	{
		return requestService.registerRequest(request);
	}

	@PutMapping("api/requests/{id}")
	public ResponseEntity<Request> updateRequest(@PathVariable(value="id") long id,@RequestBody Request requestDetails)
	{
		return requestService.updateRequest(id, requestDetails);
	}

	@DeleteMapping("api/requests/{id}")
	public String deleteRequest(@PathVariable int id)
	{
		return requestService.deleteRequest(id);
	}

}