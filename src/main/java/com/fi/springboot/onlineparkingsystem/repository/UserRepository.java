package com.fi.springboot.onlineparkingsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fi.springboot.onlineparkingsystem.entity.User;

@Repository
@EnableJpaRepositories
public interface UserRepository extends JpaRepository<User, Long> 
{
	@Query(nativeQuery=true,value="select * from user where u_username=:u_username and u_password=:u_password")
	List<User> validation(@Param("u_username") String Username,@Param("u_password") String Password);
}