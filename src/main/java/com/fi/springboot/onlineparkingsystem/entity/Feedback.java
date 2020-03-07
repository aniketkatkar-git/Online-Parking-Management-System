package com.fi.springboot.onlineparkingsystem.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="feedback")
public class Feedback implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="fb_id")
	int Fbid;
	
	@Column(name="fb_name")
	String Fbname;
	
	@Column(name="fb_email")
	String Fbemail;
	
	@Column(name="fb_message")
	String Fbmessage;

	public int getFbid() {
		return Fbid;
	}

	public void setFbid(int fbid) {
		Fbid = fbid;
	}
	
	public String getFbname() {
		return Fbname;
	}

	public void setFbname(String fbname) {
		Fbname = fbname;
	}

	public String getFbemail() {
		return Fbemail;
	}

	public void setFbemail(String fbemail) {
		Fbemail = fbemail;
	}

	public String getFbmessage() {
		return Fbmessage;
	}

	public void setFbmessage(String fbmessage) {
		Fbmessage = fbmessage;
	}

}
