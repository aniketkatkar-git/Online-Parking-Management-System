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
@RequestMapping("area")
@CrossOrigin("http://localhost:4200")
public class AreaController 
{
	@Autowired
	AreaService areaService;
	
	@GetMapping("getAllArea")
	public List<Area>getAllAreas()
	{
		return areaService.getAllAreas();
	}
	
	@GetMapping("getAreaById")
	public Area getAreaById(@RequestParam(name="id") int id)
	{
		return areaService.getAreaById(id);
	}
	
	@GetMapping("getAreaByCityId")
	public List<Area> getAreaByCityId(@RequestParam(name="cid") int cid)
	{
		return areaService.getAreaByCId(cid);
	}
	
	@PostMapping("registerArea")
	public Area registerArea(@RequestBody Area area)
	{
		return areaService.registerArea(area);
	}
	
	@PutMapping("updateArea/{id}")
	public ResponseEntity<Area> updateArea(@PathVariable(value="id") int id,@RequestBody Area areaDetails)
	{
		return areaService.updateArea(id, areaDetails);
	}
	
	@DeleteMapping("deleteArea/{id}")
	public String deleteArea(@PathVariable int id)
	{
		return areaService.deleteArea(id);
	}
}
