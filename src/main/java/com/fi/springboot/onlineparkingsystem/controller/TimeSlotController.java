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

import com.fi.springboot.onlineparkingsystem.entity.TimeSlot;
import com.fi.springboot.onlineparkingsystem.service.TimeSlotService;

@RestController
@RequestMapping("time")
@CrossOrigin("http://localhost:4200")
public class TimeSlotController 
{
	@Autowired
	TimeSlotService slotService;
	
	@GetMapping("getAllSlots")
	public List<TimeSlot>getAllSlots()
	{
		return slotService.getAllSlots();
	}
	
	@GetMapping("getSlotById")
	public TimeSlot getSlotById(@RequestParam(name="id") int id)
	{
		return slotService.getSlotById(id);
	}
	
	@GetMapping("getTimeslotByPId")
	public List<TimeSlot> getTimeslotByPId(@RequestParam(name="pid") int pid)
	{
		return slotService.getTimeslotByPId(pid);
	}
	
	@PostMapping("registerSlot")
	public TimeSlot registerSlot(@RequestBody TimeSlot slot)
	{
		return slotService.registerSlot(slot);
	}
	
	@PutMapping("updateSlot/{id}")
	public ResponseEntity<TimeSlot> updateSlot(@PathVariable(value="id") int id,@RequestBody TimeSlot slotDetails)
	{
		return slotService.updateSlot(id, slotDetails);
	}
	
	@DeleteMapping("deleteSlot/{id}")
	public String deleteSlot(@PathVariable int id)
	{
		return slotService.deleteSlot(id);
	}

}
