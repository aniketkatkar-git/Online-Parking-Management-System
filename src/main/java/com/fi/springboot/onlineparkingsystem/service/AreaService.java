package com.fi.springboot.onlineparkingsystem.service;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.fi.springboot.onlineparkingsystem.entity.Area;

@Service
public interface AreaService 
{
	List<Area> getAllAreas();
	Area getAreaById(int id);
	List<Area> getAreaByCId(int cid);
	public Area registerArea(Area area);
	public ResponseEntity<Area> updateArea(int id,Area areaDetails);
	public String deleteArea(int id);
}
