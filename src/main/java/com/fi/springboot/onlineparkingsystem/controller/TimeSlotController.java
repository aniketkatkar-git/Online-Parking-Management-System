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
@RequestMapping
@CrossOrigin("http://localhost:4200")
public class TimeSlotController 
{
	@Autowired
	TimeSlotService slotService;

	@GetMapping("api/timeslots")
	public List<TimeSlot>getAllSlots()
	{
		return slotService.getAllSlots();
	}

	@GetMapping("api/timeslots/{id}")
	public TimeSlot getSlotById(@RequestParam(name="id") int id)
	{
		return slotService.getSlotById(id);
	}

	@GetMapping("api/timeslots")
	public List<TimeSlot> getTimeslotByParkinglocationId(@RequestParam(name="parkingLocation_id") long parkingLocation_id)
	{
		return slotService.getTimeslotByParkingLocationId(parkingLocation_id);
	}

	@PostMapping("api/timeslots")
	public TimeSlot registerSlot(@RequestBody TimeSlot slot)
	{
		return slotService.registerSlot(slot);
	}

	@PutMapping("api/timeslots/{id}")
	public ResponseEntity<TimeSlot> updateSlot(@PathVariable(value="id") long id,@RequestBody TimeSlot slotDetails)
	{
		return slotService.updateSlot(id, slotDetails);
	}

	@DeleteMapping("api/timeslots/{id}")
	public String deleteSlot(@PathVariable long id)
	{
		return slotService.deleteSlot(id);
	}

}