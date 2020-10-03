package com.fi.springboot.onlineparkingsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fi.springboot.onlineparkingsystem.entity.Area;
import com.fi.springboot.onlineparkingsystem.repository.AreaRepository;

@Service
public class AreaServiceImpl implements AreaService
{
	@Autowired
	AreaRepository areaRepository;

	@Override
	public List<Area> getAllAreas() 
	{
		return areaRepository.findAll();
	}

	@Override
	public Area getAreaById(long id) 
	{
		return areaRepository.findById(id).get();
	}

	@Override
	public List<Area> getAreaByCityId(long city_id) 
	{
		return areaRepository.findByCityId(city_id);
	}

	@Override
	public Area registerArea(Area area)
	{
		return areaRepository.save(area);
	}

	@Override
	public ResponseEntity<Area> updateArea(long id, Area areaDetails) 
	{
		Area area=areaRepository.findById(id).get();

		area.setArea_name(area.getArea_name());

		final Area updateArea=areaRepository.save(area);
		return ResponseEntity.ok(updateArea);
	}

	@Override
	public String deleteArea(long id)
	{
		Optional<Area> area=areaRepository.findById(id);
		if(area.isPresent())
		{
			areaRepository.delete(area.get());
			return " Area is deleted ";
		}
		else
		{
			throw new RuntimeException("Area not found for the id : "+ id);
		}
	}
}