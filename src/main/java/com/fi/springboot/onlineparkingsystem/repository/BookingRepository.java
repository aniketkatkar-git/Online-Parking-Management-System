package com.fi.springboot.onlineparkingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fi.springboot.onlineparkingsystem.entity.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> 
{

}
