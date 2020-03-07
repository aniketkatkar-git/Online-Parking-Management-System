package com.fi.springboot.onlineparkingsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fi.springboot.onlineparkingsystem.entity.Feedback;
import com.fi.springboot.onlineparkingsystem.repository.FeedbackRepository;

@Service
public class FeedbackServiceImpl implements FeedbackService 
{
	@Autowired
	FeedbackRepository feedbackRepository;

	@Override
	public List<Feedback> getAllFeedbacks() 
	{
		return feedbackRepository.findAll();
	}

	@Override
	public Feedback getFeedbackById(int id) 
	{
		return feedbackRepository.findById(id).get();
	}
	
	@Override
	public Feedback registerFeedback(Feedback feedback) 
	{
		return feedbackRepository.save(feedback);
	}

	@Override
	public ResponseEntity<Feedback>updateFeedback(int id,Feedback feedbackDetails)
	{
		Feedback feedback=feedbackRepository.findById(id).get();
		
		feedback.setFbname(feedbackDetails.getFbname());
		feedback.setFbemail(feedbackDetails.getFbemail());
		feedback.setFbmessage(feedbackDetails.getFbmessage());
		
		final Feedback updateFeedback=feedbackRepository.save(feedback);
		return ResponseEntity.ok(updateFeedback);
	}

	@Override
	public String deleteFeedback(int id) 
	{
		Optional<Feedback> feedback=feedbackRepository.findById(id);
		if(feedback.isPresent())
		{
			feedbackRepository.delete(feedback.get());
			return " Feedback is deleted ";
		}
		else
		{
			throw new RuntimeException("Feedback not found for the id : "+ id);
		}
	}

}
