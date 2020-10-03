package com.fi.springboot.onlineparkingsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.fi.springboot.onlineparkingsystem.entity.ParkingSlot;

@Repository
@EnableJpaRepositories
public interface ParkingSlotRepository extends JpaRepository<ParkingSlot, Long> 
{
	List<ParkingSlot> findByTimeslotId(long timeslot_id);
}