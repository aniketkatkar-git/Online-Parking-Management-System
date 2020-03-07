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
	public Area getAreaById(int id) 
	{
		return areaRepository.findById(id).get();
	}
	
	@Override
	public List<Area> getAreaByCId(int cid) 
	{
		return areaRepository.findByCid(cid);
	}

	@Override
	public Area registerArea(Area area)
	{
		return areaRepository.save(area);
	}

	@Override
	public ResponseEntity<Area> updateArea(int id, Area areaDetails) 
	{
		Area area=areaRepository.findById(id).get();
		
		area.setAname(areaDetails.getAname());
		
		final Area updateArea=areaRepository.save(area);
		return ResponseEntity.ok(updateArea);
	}

	@Override
	public String deleteArea(int id)
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
