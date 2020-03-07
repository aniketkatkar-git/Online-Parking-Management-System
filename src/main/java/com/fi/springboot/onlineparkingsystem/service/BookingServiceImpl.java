package com.fi.springboot.onlineparkingsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fi.springboot.onlineparkingsystem.entity.Booking;
import com.fi.springboot.onlineparkingsystem.repository.BookingRepository;

@Service
public class BookingServiceImpl implements BookingService
{
	
	@Autowired
	BookingRepository bookingRepository;

	@Override
	public List<Booking> getAllBookings() 
	{
		return bookingRepository.findAll();
	}

	@Override
	public Booking getBookingById(int id) 
	{
		return bookingRepository.findById(id).get();
	}

	@Override
	public Booking registerBooking(Booking booking)
	{
		return bookingRepository.save(booking);
	}

	@Override
	public ResponseEntity<Booking> updateBooking(int id, Booking bookingDetails) 
	{
		Booking booking=bookingRepository.findById(id).get();
		
		booking.setBdate(bookingDetails.getBdate());
		booking.setTsslots(bookingDetails.getTsslots());
		booking.setPlname(bookingDetails.getPlname());
		booking.setAname(bookingDetails.getAname());
		booking.setCname(bookingDetails.getCname());
		booking.setBcharges(bookingDetails.getBcharges());
		booking.setBmode(bookingDetails.getBmode());
		booking.setBpaymentstatus(bookingDetails.getBpaymentstatus());
		booking.setStatus(bookingDetails.getStatus());
		
		final Booking updateBooking=bookingRepository.save(booking);
		return ResponseEntity.ok(updateBooking);
	}

	@Override
	public String deleteBooking(int id) 
	{
		Optional<Booking> booking=bookingRepository.findById(id);
		if(booking.isPresent())
		{
			bookingRepository.delete(booking.get());
			return " Booking is deleted ";
		}
		else
		{
			throw new RuntimeException("Booking not found for the id : "+ id);
		}
	}

}
