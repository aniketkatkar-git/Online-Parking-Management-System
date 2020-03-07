package com.fi.springboot.onlineparkingsystem.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fi.springboot.onlineparkingsystem.entity.TimeSlot;

@Service
public interface TimeSlotService 
{
	List<TimeSlot> getAllSlots();
	TimeSlot getSlotById(int id);
	List<TimeSlot> getTimeslotByPId(int pid);
	public TimeSlot registerSlot(TimeSlot slot);
	public ResponseEntity<TimeSlot> updateSlot(int id,TimeSlot slotDetails);
	public String deleteSlot(int id);
}
