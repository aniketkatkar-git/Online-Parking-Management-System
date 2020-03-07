package com.fi.springboot.onlineparkingsystem.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="plocation")
public class ParkingLocation implements Serializable 
{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="pl_id")
	int Plid;
	
	@Column(name="a_id")
	int aid;
	
	@Column(name="pl_name")
	String Plname;
	
	@Column(name="pl_contactno")
	int Plcontactno;
	
	@Column(name="pl_chargesperslot")
	float Plchargesperslot;

	public int getPlid() {
		return Plid;
	}

	public void setPlid(int plid) {
		Plid = plid;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getPlname() {
		return Plname;
	}

	public void setPlname(String plname) {
		Plname = plname;
	}

	public int getPlcontactno() {
		return Plcontactno;
	}

	public void setPlcontactno(int plcontactno) {
		Plcontactno = plcontactno;
	}

	public float getPlchargesperslot() {
		return Plchargesperslot;
	}

	public void setPlchargesperslot(float plchargesperslot) {
		Plchargesperslot = plchargesperslot;
	}

}
