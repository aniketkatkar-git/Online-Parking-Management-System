package com.fi.springboot.onlineparkingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fi.springboot.onlineparkingsystem.entity.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Integer>
{
	
}
