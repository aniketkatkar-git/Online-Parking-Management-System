package com.fi.springboot.onlineparkingsystem.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fi.springboot.onlineparkingsystem.entity.ParkingLocation;

@Service
public interface ParkingLocationService
{
	List<ParkingLocation> getAllLocations();
	ParkingLocation getLocationById(long id);
	List<ParkingLocation> getLocationByAreaId(long area_id);
	public ParkingLocation registerLocation(ParkingLocation location);
	public ResponseEntity<ParkingLocation> updateLocation(long id,ParkingLocation locationDetails);
	public String deleteLocation(long id);
}