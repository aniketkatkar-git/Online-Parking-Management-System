package com.fi.springboot.onlineparkingsystem.entity;

import java.sql.Date;

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
public class Booking
{	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long id;

	@Column
	private long user_id;

	@Column
	private Date date;

	@Column
	private String timeslot_slots;

	@Column
	private String parkinglocation_name;

	@Column
	private String area_name;

	@Column
	private String city_name;

	@Column
	private float charges;

	@Column
	private String payment_mode;

	@Column
	private String payment_status;

	@Column
	private String status;

}