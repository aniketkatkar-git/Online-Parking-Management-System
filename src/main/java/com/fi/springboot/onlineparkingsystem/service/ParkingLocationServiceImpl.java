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
	public ParkingLocation getLocationById(long id)
	{
		return locationRepository.findById(id).get();
	}

	@Override
	public List<ParkingLocation> getLocationByAreaId(long area_id) 
	{
		return locationRepository.findByAreaId(area_id);
	}

	@Override
	public ParkingLocation registerLocation(ParkingLocation location)
	{
		return locationRepository.save(location);
	}

	@Override
	public ResponseEntity<ParkingLocation> updateLocation(long id, ParkingLocation locationDetails) 
	{
		ParkingLocation location=locationRepository.findById(id).get();

		location.setName(locationDetails.getName());
		location.setContact_no(locationDetails.getContact_no());
		location.setChargesperslot(locationDetails.getChargesperslot());

		final ParkingLocation updateLocation=locationRepository.save(location);
		return ResponseEntity.ok(updateLocation);
	}

	@Override
	public String deleteLocation(long id) 
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