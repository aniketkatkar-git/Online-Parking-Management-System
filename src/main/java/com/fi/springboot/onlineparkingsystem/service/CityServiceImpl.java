package com.fi.springboot.onlineparkingsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fi.springboot.onlineparkingsystem.entity.City;
import com.fi.springboot.onlineparkingsystem.repository.CityRepository;

@Service
public class CityServiceImpl implements CityService 
{
	@Autowired
	CityRepository cityRepository;

	@Override
	public List<City> getAllCities() 
	{
		return cityRepository.findAll();
	}

	@Override
	public City getCityById(int id) 
	{
		return cityRepository.findById(id).get();
	}

	@Override
	public City registerCity(City city) 
	{
		return cityRepository.save(city);
	}

	@Override
	public ResponseEntity<City> updateCity(int id, City cityDetails) 
	{
		City city=cityRepository.findById(id).get();
		
		city.setCname(cityDetails.getCname());
		
		final City updateCity=cityRepository.save(city);
		return ResponseEntity.ok(updateCity);
	}

	@Override
	public String deleteCity(int id)
	{
		Optional<City> city=cityRepository.findById(id);
		if(city.isPresent())
		{
			cityRepository.delete(city.get());
			return " City is deleted ";
		}
		else
		{
			throw new RuntimeException("City not found for the id : "+ id);
		}
	}

}
