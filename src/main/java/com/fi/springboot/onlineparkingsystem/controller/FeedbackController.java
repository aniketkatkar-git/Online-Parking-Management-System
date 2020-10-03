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
@RequestMapping
@CrossOrigin("http://localhost:4200")
public class FeedbackController 
{
	@Autowired
	FeedbackService feedbackService;

	@GetMapping("api/feedback")
	public List<Feedback>getAllFeedbacks()
	{
		return feedbackService.getAllFeedbacks();
	}

	@GetMapping("api/feedback/{id}")
	public Feedback getfeedbackById(@RequestParam(name="id") long id)
	{
		return feedbackService.getFeedbackById(id);
	}


	@PostMapping("api/feedback")
	public Feedback registerFeedback(@RequestBody Feedback feedback)
	{
		return feedbackService.registerFeedback(feedback);
	}

	@PutMapping("api/feedback/{id}")
	public ResponseEntity<Feedback> updateFeedback(@PathVariable(value="id") long id,@RequestBody Feedback feedbackDetails)
	{
		return feedbackService.updateFeedback(id, feedbackDetails);
	}

	@DeleteMapping("api/feedback/{id}")
	public String deleteFeedback(@PathVariable long id)
	{
		return feedbackService.deleteFeedback(id);
	}

}