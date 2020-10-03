package com.fi.springboot.onlineparkingsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fi.springboot.onlineparkingsystem.entity.Admin;

@Repository
@EnableJpaRepositories
public interface AdminRepository extends JpaRepository<Admin, Long>
{
	@Query(nativeQuery=true,value="select * from admin where a_username=:a_username and a_password=:a_password")
	List<Admin> validation(@Param("a_username") String Username,@Param("a_password") String Password);
}