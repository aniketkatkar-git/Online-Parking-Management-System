package com.fi.springboot.onlineparkingsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fi.springboot.onlineparkingsystem.entity.Owner;

@Repository
@EnableJpaRepositories
public interface OwnerRepository extends JpaRepository<Owner, Long> 
{
	@Query(nativeQuery=true,value="select * from owner where o_username=:o_username and o_password=:o_password")
	List<Owner> validation(@Param("o_username") String ownerUsername,@Param("o_password") String password);
}