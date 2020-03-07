package com.fi.springboot.onlineparkingsystem.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class Admin implements Serializable 
{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name ="a_username")
	String Ausername;
	
	@Column(name="a_password")
	String Apassword;
	
	@Column(name="a_fname")
	String Afname;
	
	@Column(name="a_lname")
	String Alname;

	public String getAusername() {
		return Ausername;
	}

	public void setAusername(String ausername) {
		Ausername = ausername;
	}

	public String getApassword() {
		return Apassword;
	}

	public void setApassword(String apassword) {
		Apassword = apassword;
	}

	public String getAfname() {
		return Afname;
	}

	public void setAfname(String afname) {
		Afname = afname;
	}

	public String getAlname() {
		return Alname;
	}

	public void setAlname(String alname) {
		Alname = alname;
	}
}
