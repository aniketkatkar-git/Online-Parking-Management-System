package com.fi.springboot.onlineparkingsystem.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fi.springboot.onlineparkingsystem.entity.ParkingLocation;

@Service
public interface ParkingLocationService
{
	List<ParkingLocation> getAllLocations();
	ParkingLocation getLocationById(int id);
	List<ParkingLocation> getLocationByAId(int aid);
	public ParkingLocation registerLocation(ParkingLocation location);
	public ResponseEntity<ParkingLocation> updateLocation(int id,ParkingLocation locationDetails);
	public String deleteLocation(int id);
}
