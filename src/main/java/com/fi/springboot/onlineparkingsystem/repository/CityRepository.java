package com.fi.springboot.onlineparkingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fi.springboot.onlineparkingsystem.entity.City;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> 
{

}
