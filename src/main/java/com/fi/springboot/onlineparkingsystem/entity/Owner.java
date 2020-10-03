package com.fi.springboot.onlineparkingsystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table
public class Owner 
{	
	@Id
	@GeneratedValue
	@Column
	private long id;

	@Column
	private String username;

	@Column
	private String password;

	@Column
	private String first_name;

	@Column
	private String last_name;

	@Column
	private String email;

	@Column
	private long contact_no;

	@Column
	private String address;

}