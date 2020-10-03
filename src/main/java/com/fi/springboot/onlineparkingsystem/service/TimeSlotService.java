package com.fi.springboot.onlineparkingsystem.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fi.springboot.onlineparkingsystem.entity.TimeSlot;

@Service
public interface TimeSlotService 
{
	List<TimeSlot> getAllSlots();
	TimeSlot getSlotById(long id);
	List<TimeSlot> getTimeslotByParkingLocationId(long parkingLocation_id);
	public TimeSlot registerSlot(TimeSlot slot);
	public ResponseEntity<TimeSlot> updateSlot(long id,TimeSlot slotDetails);
	public String deleteSlot(long id);
}