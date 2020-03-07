package com.fi.springboot.onlineparkingsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fi.springboot.onlineparkingsystem.entity.ParkingLocation;

@Repository
public interface ParkingLocationRepository extends JpaRepository<ParkingLocation, Integer>
{
	List<ParkingLocation> findByAid(int aid);
}
