package com.fi.springboot.onlineparkingsystem.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fi.springboot.onlineparkingsystem.entity.ParkingSlot;

@Service
public interface ParkingSlotService
{
	List<ParkingSlot> getAllSlots();
	ParkingSlot getSlotById(int id);
	List<ParkingSlot> getPSlotByTId(int tid);
	public ParkingSlot registerSlot(ParkingSlot slot);
	public ResponseEntity<ParkingSlot> updateSlot(int id,ParkingSlot slotDetails);
	public String deleteSlot(int id);
}
