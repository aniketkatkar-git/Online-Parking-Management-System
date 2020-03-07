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

import com.fi.springboot.onlineparkingsystem.entity.ParkingSlot;
import com.fi.springboot.onlineparkingsystem.service.ParkingSlotService;

@RestController
@RequestMapping("parking")
@CrossOrigin("http://localhost:4200")
public class ParkingSlotController 
{
	@Autowired 
	ParkingSlotService slotService;

	@GetMapping("getAllSlots")
	public List<ParkingSlot>getAllSlots()
	{
		return slotService.getAllSlots();
	}
	
	@GetMapping("getSlotById")
	public ParkingSlot getSlotById(@RequestParam(name="id") int id)
	{
		return slotService.getSlotById(id);
	}
	
	@GetMapping("getPSlotByTId")
	public List<ParkingSlot> getPSlotByTId(@RequestParam(name="tid") int tid)
	{
		return slotService.getPSlotByTId(tid);
	}
	
	@PostMapping("registerSlot")
	public ParkingSlot registerSlot(@RequestBody ParkingSlot slot)
	{
		return slotService.registerSlot(slot);
	}
	
	@PutMapping("updateSlot/{id}")
	public ResponseEntity<ParkingSlot> updateSlot(@PathVariable(value="id") int id,@RequestBody ParkingSlot slotDetails)
	{
		return slotService.updateSlot(id, slotDetails);
	}
	
	@DeleteMapping("deleteSlot/{id}")
	public String deleteSlot(@PathVariable int id)
	{
		return slotService.deleteSlot(id);
	}
}
