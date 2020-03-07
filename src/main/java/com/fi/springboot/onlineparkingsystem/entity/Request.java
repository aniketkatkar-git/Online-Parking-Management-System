package com.fi.springboot.onlineparkingsystem.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="request")
public class Request implements Serializable 
{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="r_id")
	int Rid;
	
	@Column(name="o_id")
	int Oid;
	
	@Column(name="r_psaddress")
	String Rpsaddress;
	
	@Column(name="r_pscount")
	String Rpscount;
	
	@Column(name="r_status")
	String Rstatus;

	public int getRid() {
		return Rid;
	}

	public void setRid(int rid) {
		Rid = rid;
	}

	public int getOid() {
		return Oid;
	}

	public void setOid(int oid) {
		Oid = oid;
	}

	public String getRpsaddress() {
		return Rpsaddress;
	}

	public void setRpsaddress(String rpsaddress) {
		Rpsaddress = rpsaddress;
	}

	public String getRpscount() {
		return Rpscount;
	}

	public void setRpscount(String rpscount) {
		Rpscount = rpscount;
	}

	public String getRstatus() {
		return Rstatus;
	}

	public void setRstatus(String rstatus) {
		Rstatus = rstatus;
	}
}
