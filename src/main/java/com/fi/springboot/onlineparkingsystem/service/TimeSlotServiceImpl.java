package com.fi.springboot.onlineparkingsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fi.springboot.onlineparkingsystem.entity.TimeSlot;
import com.fi.springboot.onlineparkingsystem.repository.TimeSlotRepository;

@Service
public class TimeSlotServiceImpl implements TimeSlotService 
{
	@Autowired
	TimeSlotRepository slotRepository;

	@Override
	public List<TimeSlot> getAllSlots() 
	{
		return slotRepository.findAll();
	}

	@Override
	public TimeSlot getSlotById(int id) 
	{
		return slotRepository.findById(id).get();
	}

	@Override
	public List<TimeSlot> getTimeslotByPId(int pid) 
	{
		return slotRepository.findByPid(pid);
	}
	
	@Override
	public TimeSlot registerSlot(TimeSlot slot) 
	{
		return slotRepository.save(slot);
	}

	@Override
	public ResponseEntity<TimeSlot> updateSlot(int id, TimeSlot slotDetails) 
	{
		TimeSlot slot=slotRepository.findById(id).get();
		
		slot.setTsslots(slotDetails.getTsslots());

		final TimeSlot updateSlot=slotRepository.save(slot);
		return ResponseEntity.ok(updateSlot);
		
	}

	@Override
	public String deleteSlot(int id) 
	{
		Optional<TimeSlot> slot=slotRepository.findById(id);
		if(slot.isPresent())
		{
			slotRepository.delete(slot.get());
			return " TimeSlot is deleted ";
		}
		else
		{
			throw new RuntimeException("TimeSlot not found for the id : "+ id);
		}
	}
}
