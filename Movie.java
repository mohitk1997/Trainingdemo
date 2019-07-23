package com.mphasis.training.beans;

import java.time.LocalDate;
import java.time.LocalTime;

public class Movie {
private int mid;
private String mname;
LocalTime time;
@Override
public String toString() {
	return "Movie [mid=" + mid + ", mname=" + mname + ", time=" + time + ", date=" + date + ", theatreid=" + theatreid
			+ ", cost=" + cost + "]";
}
public int getMid() {
	return mid;
}
public void setMid(int mid) {
	this.mid = mid;
}
public String getMname() {
	return mname;
}
public void setMname(String mname) {
	this.mname = mname;
}
public LocalTime getTime() {
	return time;
}
public void setTime(LocalTime time) {
	this.time = time;
}
public LocalDate getDate() {
	return date;
}
public void setDate(LocalDate date) {
	this.date = date;
}
public int getTheatreid() {
	return theatreid;
}
public void setTheatreid(int theatreid) {
	this.theatreid = theatreid;
}
public int getCost() {
	return cost;
}
public void setCost(int cost) {
	this.cost = cost;
}
LocalDate date;
private int theatreid;
private int cost;
}
