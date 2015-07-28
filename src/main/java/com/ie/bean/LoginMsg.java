package com.ie.bean;

import java.io.Serializable;

@SuppressWarnings("serial")
public class LoginMsg implements Serializable {

	private long id;
	private String ip;
	private String date;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
}
