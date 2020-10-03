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
@RequestMapping
@CrossOrigin("http://localhost:4200")
public class ParkingLocationController 
{
	@Autowired
	ParkingLocationService locationService;

	@GetMapping("api/parkinglocation")
	public List<ParkingLocation>getAllLocations()
	{
		return locationService.getAllLocations();
	}

	@GetMapping("api/parkinglocation/{id}")
	public ParkingLocation getLocationById(@RequestParam(name="id") long id)
	{
		return locationService.getLocationById(id);
	}

	@GetMapping("api/parkinglocation/area/{area_id}")
	public List<ParkingLocation> getLocationByAId(@RequestParam(name="area_id") long area_id)
	{
		return locationService.getLocationByAreaId(area_id);
	}

	@PostMapping("api/parkinglocation")
	public ParkingLocation registerLocation(@RequestBody ParkingLocation location)
	{
		return locationService.registerLocation(location);
	}

	@PutMapping("api/parkinglocation/{id}")
	public ResponseEntity<ParkingLocation> updateLocation(@PathVariable(value="id") long id,@RequestBody ParkingLocation locationDetails)
	{
		return locationService.updateLocation(id, locationDetails);
	}

	@DeleteMapping("api/parkinglocation/{id}")
	public String deleteLocation(@PathVariable int id)
	{
		return locationService.deleteLocation(id);
	}
}