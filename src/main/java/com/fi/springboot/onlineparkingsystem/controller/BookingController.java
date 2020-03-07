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

import com.fi.springboot.onlineparkingsystem.entity.Booking;
import com.fi.springboot.onlineparkingsystem.service.BookingService;

@RestController
@RequestMapping("booking")
@CrossOrigin("http://localhost:4200")
public class BookingController 
{
	@Autowired
	BookingService bookingService;

	@GetMapping("getAllBookings")
	public List<Booking>getAllBookings()
	{
		return bookingService.getAllBookings();
	}
	
	@GetMapping("getBookingById")
	public Booking getBookingById(@RequestParam(name="id") int id)
	{
		return bookingService.getBookingById(id);
	}
	
	
	@PostMapping("registerBooking")
	public Booking registerBooking(@RequestBody Booking booking)
	{
		return bookingService.registerBooking(booking);
	}
	
	@PutMapping("updateBooking/{id}")
	public ResponseEntity<Booking> updateBooking(@PathVariable(value="id") int id,@RequestBody Booking bookingDetails)
	{
		return bookingService.updateBooking(id, bookingDetails);
	}
	
	@DeleteMapping("deleteBooking/{id}")
	public String deleteBooking(@PathVariable int id)
	{
		return bookingService.deleteBooking(id);
	}
}