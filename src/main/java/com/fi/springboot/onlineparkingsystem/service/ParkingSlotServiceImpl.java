package com.fi.springboot.onlineparkingsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fi.springboot.onlineparkingsystem.entity.ParkingSlot;
import com.fi.springboot.onlineparkingsystem.repository.ParkingSlotRepository;

@Service
public class ParkingSlotServiceImpl implements ParkingSlotService 
{
	@Autowired
	ParkingSlotRepository slotRepository;

	@Override
	public List<ParkingSlot> getAllSlots() 
	{
		return slotRepository.findAll();
	}

	@Override
	public ParkingSlot getSlotById(int id) 
	{
		return slotRepository.findById(id).get();
	}
	
	@Override
	public List<ParkingSlot> getPSlotByTId(int tid) 
	{
		return slotRepository.findByTid(tid);
	}

	@Override
	public ParkingSlot registerSlot(ParkingSlot slot) 
	{
		return slotRepository.save(slot);
	}

	@Override
	public ResponseEntity<ParkingSlot> updateSlot(int id, ParkingSlot slotDetails)
	{
		ParkingSlot slot=slotRepository.findById(id).get();
		
		slot.setTid(slotDetails.getTid());
		slot.setPSname(slotDetails.getPSname());
		
		final ParkingSlot updateSlot=slotRepository.save(slot);
		return ResponseEntity.ok(updateSlot);

	}

	@Override
	public String deleteSlot(int id) 
	{
		Optional<ParkingSlot> slot=slotRepository.findById(id);
		if(slot.isPresent())
		{
			slotRepository.delete(slot.get());
			return " ParkingSlot is deleted ";
		}
		else
		{
			throw new RuntimeException("ParkingSlot not found for the id : "+ id);
		}
	}

}
