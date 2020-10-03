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
@RequestMapping
@CrossOrigin("http://localhost:4200")
public class ParkingSlotController 
{
	@Autowired 
	ParkingSlotService slotService;

	@GetMapping("api/parkingslots")
	public List<ParkingSlot>getAllSlots()
	{
		return slotService.getAllSlots();
	}

	@GetMapping("api/parkingslots/{id}")
	public ParkingSlot getSlotById(@RequestParam(name="id") long id)
	{
		return slotService.getSlotById(id);
	}

	@GetMapping("api/parkingslots/timeslots/{timeslot_id}")
	public List<ParkingSlot> getPSlotByTId(@RequestParam(name="timeslot_id") long timeslot_id)
	{
		return slotService.getParkingslotByTimeslotId(timeslot_id);
	}

	@PostMapping("api/parkingslots")
	public ParkingSlot registerSlot(@RequestBody ParkingSlot slot)
	{
		return slotService.registerSlot(slot);
	}

	@PutMapping("api/parkingslots/{id}")
	public ResponseEntity<ParkingSlot> updateSlot(@PathVariable(value="id") long id,@RequestBody ParkingSlot slotDetails)
	{
		return slotService.updateSlot(id, slotDetails);
	}

	@DeleteMapping("api/parkingslots/{id}")
	public String deleteSlot(@PathVariable long id)
	{
		return slotService.deleteSlot(id);
	}
}