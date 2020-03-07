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

import com.fi.springboot.onlineparkingsystem.entity.City;
import com.fi.springboot.onlineparkingsystem.service.CityService;

@RestController
@RequestMapping("city")
@CrossOrigin("http://localhost:4200")
public class CityController
{
	@Autowired
	CityService cityService;

	@GetMapping("getAllCities")
	public List<City>getAllCities()
	{
		return cityService.getAllCities();
	}
	
	@GetMapping("getCityById")
	public City getCityById(@RequestParam(name="c_id") int id)
	{
		return cityService.getCityById(id);
	}
	
	
	@PostMapping("registerCity")
	public City registerCity(@RequestBody City city)
	{
		return cityService.registerCity(city);
	}
	
	@PutMapping("updateCity/{id}")
	public ResponseEntity<City> updateCity(@PathVariable(value="id") int id,@RequestBody City cityDetails)
	{
		return cityService.updateCity(id, cityDetails);
	}
	
	@DeleteMapping("deleteCity/{id}")
	public String deleteCity(@PathVariable int id)
	{
		return cityService.deleteCity(id);
	}
}