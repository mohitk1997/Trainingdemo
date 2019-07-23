package com.mphasis.training.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bmstheatre" )
public class Theatre {
	@Id
	private int theatreid;
	private String theatreName;
	private int noofseats;
	public int getNoofseats() {
		return noofseats;
	}
	public void setNoofseats(int noofseats) {
		this.noofseats = noofseats;
	}
	@Override
	public String toString() {
		return "Theatre [theatreid=" + theatreid + ", theatreName=" + theatreName + ", noofseats=" + noofseats + "]";
	}
	public int getTheatreid() {
		return theatreid;
	}
	public void setTheatreid(int theatreid) {
		this.theatreid = theatreid;
	}
	public String getTheatreName() {
		return theatreName;
	}
	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}
}
