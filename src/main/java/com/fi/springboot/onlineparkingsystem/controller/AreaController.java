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

import com.fi.springboot.onlineparkingsystem.entity.Area;
import com.fi.springboot.onlineparkingsystem.service.AreaService;

@RestController
@RequestMapping
@CrossOrigin("http://localhost:4200")
public class AreaController 
{
	@Autowired
	AreaService areaService;

	@GetMapping("api/area")
	public List<Area>getAllAreas()
	{
		return areaService.getAllAreas();
	}

	@GetMapping("api/area/{id}")
	public Area getAreaById(@RequestParam(name="id") long id)
	{
		return areaService.getAreaById(id);
	}

	@GetMapping("api/area/city/{city_id}")
	public List<Area> getAreaByCityId(@RequestParam(name="city_id") long city_id)
	{
		return areaService.getAreaByCityId(city_id);
	}

	@PostMapping("api/area")
	public Area registerArea(@RequestBody Area area)
	{
		return areaService.registerArea(area);
	}

	@PutMapping("api/area/{id}")
	public ResponseEntity<Area> updateArea(@PathVariable(value="id") long id,@RequestBody Area areaDetails)
	{
		return areaService.updateArea(id, areaDetails);
	}

	@DeleteMapping("api/area/{id}")
	public String deleteArea(@PathVariable long id)
	{
		return areaService.deleteArea(id);
	}
}