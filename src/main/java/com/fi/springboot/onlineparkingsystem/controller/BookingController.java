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
@RequestMapping
@CrossOrigin("http://localhost:4200")
public class BookingController 
{
	@Autowired
	BookingService bookingService;

	@GetMapping("api/booking")
	public List<Booking>getAllBookings()
	{
		return bookingService.getAllBookings();
	}

	@GetMapping("api/booking/{id}")
	public Booking getBookingById(@RequestParam(name="id") long id)
	{
		return bookingService.getBookingById(id);
	}


	@PostMapping("api/booking")
	public Booking registerBooking(@RequestBody Booking booking)
	{
		return bookingService.registerBooking(booking);
	}

	@PutMapping("api/booking/{id}")
	public ResponseEntity<Booking> updateBooking(@PathVariable(value="id") long id,@RequestBody Booking bookingDetails)
	{
		return bookingService.updateBooking(id, bookingDetails);
	}

	@DeleteMapping("api/booking/{id}")
	public String deleteBooking(@PathVariable long id)
	{
		return bookingService.deleteBooking(id);
	}
}