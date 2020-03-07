package com.fi.springboot.onlineparkingsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fi.springboot.onlineparkingsystem.entity.Area;

@Repository
public interface AreaRepository extends JpaRepository<Area, Integer> 
{
	List<Area> findByCid(int cid);
}
