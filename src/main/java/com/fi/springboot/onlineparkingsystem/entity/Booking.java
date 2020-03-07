package com.fi.springboot.onlineparkingsystem.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="booking")
public class Booking implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	@Id
	int Bid;
	
	@Column(name="u_id")
	int Uid;
	
	@Column(name="b_date")
	Date Bdate;
	
	@Column(name="ts_slots")
	String Tsslots;
	
	@Column(name="pl_name")
	String Plname;
	
	@Column(name="a_name")
	String Aname;
	
	@Column(name="c_name")
	String Cname;
	
	@Column(name="b_charges")
	float Bcharges;
	
	@Column(name="b_mode")
	String Bmode;
	
	@Column(name="b_paymentstatus")
	String Bpaymentstatus;
	
	@Column(name="b_status")
	String Status;

	public int getBid() {
		return Bid;
	}

	public void setBid(int bid) {
		Bid = bid;
	}

	public int getUid() {
		return Uid;
	}

	public void setUid(int uid) {
		Uid = uid;
	}

	public Date getBdate() {
		return Bdate;
	}

	public void setBdate(Date bdate) {
		Bdate = bdate;
	}

	public String getTsslots() {
		return Tsslots;
	}

	public void setTsslots(String tsslots) {
		Tsslots = tsslots;
	}

	public String getPlname() {
		return Plname;
	}

	public void setPlname(String plname) {
		Plname = plname;
	}

	public String getAname() {
		return Aname;
	}

	public void setAname(String aname) {
		Aname = aname;
	}

	public String getCname() {
		return Cname;
	}

	public void setCname(String cname) {
		Cname = cname;
	}

	public float getBcharges() {
		return Bcharges;
	}

	public void setBcharges(float bcharges) {
		Bcharges = bcharges;
	}

	public String getBmode() {
		return Bmode;
	}

	public void setBmode(String bmode) {
		Bmode = bmode;
	}

	public String getBpaymentstatus() {
		return Bpaymentstatus;
	}

	public void setBpaymentstatus(String bpaymentstatus) {
		Bpaymentstatus = bpaymentstatus;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}
}
