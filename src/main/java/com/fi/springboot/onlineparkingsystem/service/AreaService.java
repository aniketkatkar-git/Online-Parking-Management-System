package com.fi.springboot.onlineparkingsystem.service;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fi.springboot.onlineparkingsystem.entity.Area;

@Service
public interface AreaService 
{
	List<Area> getAllAreas();
	Area getAreaById(long id);
	List<Area> getAreaByCityId(long city_id);
	public Area registerArea(Area area);
	public ResponseEntity<Area> updateArea(long id,Area areaDetails);
	public String deleteArea(long id);
}