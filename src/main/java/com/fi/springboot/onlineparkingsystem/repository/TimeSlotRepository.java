package com.fi.springboot.onlineparkingsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.fi.springboot.onlineparkingsystem.entity.TimeSlot;

@Repository
@EnableJpaRepositories
public interface TimeSlotRepository extends JpaRepository<TimeSlot, Long> 
{
	List<TimeSlot> findByParkingLocationId(long parkingLocation_id);
}