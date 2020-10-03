package com.fi.springboot.onlineparkingsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fi.springboot.onlineparkingsystem.entity.Manager;

@Repository
@EnableJpaRepositories
public interface ManagerRepository extends JpaRepository<Manager, Long> 
{
	@Query(nativeQuery=true,value="select * from manager where m_username=:m_username and m_password=:m_password")
	List<Manager> validation(@Param("m_username") String MUsername,@Param("m_password") String password);
}