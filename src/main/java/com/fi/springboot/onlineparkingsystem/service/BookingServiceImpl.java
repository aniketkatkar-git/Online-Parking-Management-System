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
	public Booking getBookingById(long id) 
	{
		return bookingRepository.findById(id).get();
	}

	@Override
	public Booking registerBooking(Booking booking)
	{
		return bookingRepository.save(booking);
	}

	@Override
	public ResponseEntity<Booking> updateBooking(long id, Booking bookingDetails) 
	{
		Booking booking=bookingRepository.findById(id).get();

		booking.setDate(booking.getDate());
		booking.setTimeslot_slots(booking.getTimeslot_slots());
		booking.setParkinglocation_name(booking.getParkinglocation_name());
		booking.setArea_name(booking.getArea_name());
		booking.setCity_name(booking.getCity_name());
		booking.setCharges(booking.getCharges());
		booking.setPayment_mode(booking.getPayment_mode());
		booking.setPayment_status(booking.getPayment_status());
		booking.setStatus(booking.getStatus());

		final Booking updateBooking=bookingRepository.save(booking);
		return ResponseEntity.ok(updateBooking);
	}

	@Override
	public String deleteBooking(long id) 
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