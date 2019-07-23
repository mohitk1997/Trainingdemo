package com.mphasis.training.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bmsusers" )
public class Users {

	private String emailid;
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	private String username;
	@Id
	private long phno;
	private String password;
	@Override
	public String toString() {
		return "Users [emailid=" + emailid + ", username=" + username + ", phno=" + phno + ", password=" + password
				+ "]";
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(int phno) {
		this.phno = phno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
