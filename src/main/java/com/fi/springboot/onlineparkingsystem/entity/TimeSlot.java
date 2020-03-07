package com.fi.springboot.onlineparkingsystem.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="timeslot")
public class TimeSlot implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ts_id")
	int Tid;
	
	@Column(name="pl_id")
	int pid;
	
	@Column(name="ts_slots")
	String Tsslots;

	public int getTid() {
		return Tid;
	}

	public void setTid(int tid) {
		Tid = tid;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getTsslots() {
		return Tsslots;
	}

	public void setTsslots(String tsslots) {
		Tsslots = tsslots;
	}
}
