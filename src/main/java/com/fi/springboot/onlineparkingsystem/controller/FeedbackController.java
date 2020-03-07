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

import com.fi.springboot.onlineparkingsystem.entity.Feedback;
import com.fi.springboot.onlineparkingsystem.service.FeedbackService;

@RestController
@RequestMapping("feedback")
@CrossOrigin("http://localhost:4200")
public class FeedbackController 
{
	@Autowired
	FeedbackService feedbackService;
	
	@GetMapping("getAllFeedbacks")
	public List<Feedback>getAllFeedbacks()
	{
		return feedbackService.getAllFeedbacks();
	}
	
	@GetMapping("getFeedbackById")
	public Feedback getfeedbackById(@RequestParam(name="id") int id)
	{
		return feedbackService.getFeedbackById(id);
	}
	
	
	@PostMapping("registerFeedback")
	public Feedback registerFeedback(@RequestBody Feedback feedback)
	{
		return feedbackService.registerFeedback(feedback);
	}
	
	@PutMapping("updateFeedback/{id}")
	public ResponseEntity<Feedback> updateFeedback(@PathVariable(value="id") int id,@RequestBody Feedback feedbackDetails)
	{
		return feedbackService.updateFeedback(id, feedbackDetails);
	}
	
	@DeleteMapping("deleteFeedback/{id}")
	public String deleteFeedback(@PathVariable int id)
	{
		return feedbackService.deleteFeedback(id);
	}

}
