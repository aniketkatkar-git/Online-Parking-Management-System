package com.fi.springboot.onlineparkingsystem.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fi.springboot.onlineparkingsystem.entity.Feedback;

@Service
public interface FeedbackService 
{
	List<Feedback> getAllFeedbacks();
	Feedback getFeedbackById(long id);
	public Feedback registerFeedback(Feedback feedback);
	public ResponseEntity<Feedback> updateFeedback(long id,Feedback feedbackDetails);
	public String deleteFeedback(long id);
}