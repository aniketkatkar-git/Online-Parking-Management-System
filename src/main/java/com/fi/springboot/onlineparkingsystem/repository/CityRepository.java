package com.fi.springboot.onlineparkingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.fi.springboot.onlineparkingsystem.entity.City;

@Repository
@EnableJpaRepositories
public interface CityRepository extends JpaRepository<City, Long> 
{
}