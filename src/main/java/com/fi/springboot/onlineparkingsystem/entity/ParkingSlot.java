package com.fi.springboot.onlineparkingsystem.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pslot")
public class ParkingSlot implements Serializable 
{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ps_id")
	int Psid;
	
	@Column(name="ts_id")
	int tid;
	
	@Column(name="ps_name")
	String PSname;

	public int getPsid() {
		return Psid;
	}

	public void setPsid(int psid) {
		Psid = psid;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getPSname() {
		return PSname;
	}

	public void setPSname(String pSname) {
		PSname = pSname;
	}
}