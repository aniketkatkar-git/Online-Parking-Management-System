package com.fi.springboot.onlineparkingsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.fi.springboot.onlineparkingsystem.entity.Area;

@Repository
@EnableJpaRepositories
public interface AreaRepository extends JpaRepository<Area, Long> 
{
	List<Area> findByCityId(long city_id);
}