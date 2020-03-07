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

import com.fi.springboot.onlineparkingsystem.entity.ParkingLocation;
import com.fi.springboot.onlineparkingsystem.service.ParkingLocationService;

@RestController
@RequestMapping("location")
@CrossOrigin("http://localhost:4200")
public class ParkingLocationController 
{
	@Autowired
	ParkingLocationService locationService;

	@GetMapping("getAllLocations")
	public List<ParkingLocation>getAllLocations()
	{
		return locationService.getAllLocations();
	}
	
	@GetMapping("getLocationById")
	public ParkingLocation getLocationById(@RequestParam(name="id") int id)
	{
		return locationService.getLocationById(id);
	}
	
	@GetMapping("getLocationByAId")
	public List<ParkingLocation> getLocationByAId(@RequestParam(name="aid") int aid)
	{
		return locationService.getLocationByAId(aid);
	}
	
	@PostMapping("registerLocation")
	public ParkingLocation registerLocation(@RequestBody ParkingLocation location)
	{
		return locationService.registerLocation(location);
	}
	
	@PutMapping("updateLocation/{id}")
	public ResponseEntity<ParkingLocation> updateLocation(@PathVariable(value="id") int id,@RequestBody ParkingLocation locationDetails)
	{
		return locationService.updateLocation(id, locationDetails);
	}
	
	@DeleteMapping("deleteLocation/{id}")
	public String deleteLocation(@PathVariable int id)
	{
		return locationService.deleteLocation(id);
	}
}