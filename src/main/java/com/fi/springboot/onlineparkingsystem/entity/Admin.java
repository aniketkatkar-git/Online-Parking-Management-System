package com.fi.springboot.onlineparkingsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table
public class Admin 
{	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private String username;

	@Column
	private String password;

	@Column
	private String first_name;

	@Column
	private String last_name;

}