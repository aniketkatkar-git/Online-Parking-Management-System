package com.fi.springboot.onlineparkingsystem.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fi.springboot.onlineparkingsystem.entity.Booking;

@Service
public interface BookingService 
{
	List<Booking> getAllBookings();
	Booking getBookingById(long id);
	public Booking registerBooking(Booking booking);
	public ResponseEntity<Booking> updateBooking(long id,Booking bookingDetails);
	public String deleteBooking(long id);
}