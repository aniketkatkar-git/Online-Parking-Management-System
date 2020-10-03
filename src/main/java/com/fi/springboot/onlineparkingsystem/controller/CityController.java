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
@RequestMapping
@CrossOrigin("http://localhost:4200")
public class CityController
{
	@Autowired
	CityService cityService;

	@GetMapping("api/city")
	public List<City>getAllCities()
	{
		return cityService.getAllCities();
	}

	@GetMapping("api/city/{id}")
	public City getCityById(@RequestParam(name="id") long id)
	{
		return cityService.getCityById(id);
	}


	@PostMapping("api/city")
	public City registerCity(@RequestBody City city)
	{
		return cityService.registerCity(city);
	}

	@PutMapping("api/city/{id}")
	public ResponseEntity<City> updateCity(@PathVariable(value="id") long id,@RequestBody City cityDetails)
	{
		return cityService.updateCity(id, cityDetails);
	}

	@DeleteMapping("api/city/{id}")
	public String deleteCity(@PathVariable long id)
	{
		return cityService.deleteCity(id);
	}
}