package com.fi.springboot.onlineparkingsystem.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="manager")
public class Manager implements Serializable 
{
    private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="m_id")
	int mId;
	
	@Column(name="m_username")
	String mUsername;
	
	@Column(name="m_password")
	String mPassword;
	
	@Column(name="m_email")
	String mEmail;
	
	@Column(name="m_contactno")
	int mContactNo;

	public int getmId() {
		return mId;
	}

	public void setmId(int mId) {
		this.mId = mId;
	}

	public String getmUsername() {
		return mUsername;
	}

	public void setmUsername(String mUsername) {
		this.mUsername = mUsername;
	}

	public String getmPassword() {
		return mPassword;
	}

	public void setmPassword(String mPassword) {
		this.mPassword = mPassword;
	}

	public String getmEmail() {
		return mEmail;
	}

	public void setmEmail(String mEmail) {
		this.mEmail = mEmail;
	}

	public int getmContactNo() {
		return mContactNo;
	}

	public void setmContactNo(int mContactNo) {
		this.mContactNo = mContactNo;
	}

}
