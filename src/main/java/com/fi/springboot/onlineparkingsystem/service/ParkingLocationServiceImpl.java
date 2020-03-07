package com.fi.springboot.onlineparkingsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fi.springboot.onlineparkingsystem.entity.ParkingLocation;
import com.fi.springboot.onlineparkingsystem.repository.ParkingLocationRepository;

@Service
public class ParkingLocationServiceImpl implements ParkingLocationService 
{
	@Autowired
	ParkingLocationRepository locationRepository;

	@Override
	public List<ParkingLocation> getAllLocations() 
	{
		return locationRepository.findAll();
	}

	@Override
	public ParkingLocation getLocationById(int id)
	{
		return locationRepository.findById(id).get();
	}

	@Override
	public List<ParkingLocation> getLocationByAId(int aid) 
	{
		return locationRepository.findByAid(aid);
	}

	@Override
	public ParkingLocation registerLocation(ParkingLocation location)
	{
		return locationRepository.save(location);
	}

	@Override
	public ResponseEntity<ParkingLocation> updateLocation(int id, ParkingLocation locationDetails) 
	{
		ParkingLocation location=locationRepository.findById(id).get();

		location.setPlname(locationDetails.getPlname());
		location.setPlcontactno(locationDetails.getPlcontactno());
		location.setPlchargesperslot(locationDetails.getPlchargesperslot());
		
		final ParkingLocation updateLocation=locationRepository.save(location);
		return ResponseEntity.ok(updateLocation);
	}

	@Override
	public String deleteLocation(int id) 
	{
		Optional<ParkingLocation> location=locationRepository.findById(id);
		if(location.isPresent())
		{
			locationRepository.delete(location.get());
			return " Location is deleted ";
		}
		else
		{
			throw new RuntimeException("Location not found for the id : "+ id);
		}
	}
}
