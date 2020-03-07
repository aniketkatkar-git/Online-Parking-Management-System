package com.fi.springboot.onlineparkingsystem.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fi.springboot.onlineparkingsystem.entity.City;

@Service
public interface CityService 
{
	List<City> getAllCities();
	City getCityById(int id);
	public City registerCity(City city);
	public ResponseEntity<City> updateCity(int id,City cityDetails);
	public String deleteCity(int id);
}
