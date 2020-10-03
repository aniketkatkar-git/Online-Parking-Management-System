package com.fi.springboot.onlineparkingsystem.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fi.springboot.onlineparkingsystem.entity.City;

@Service
public interface CityService 
{
	List<City> getAllCities();
	City getCityById(long id);
	public City registerCity(City city);
	public ResponseEntity<City> updateCity(long id,City cityDetails);
	public String deleteCity(long id);
}