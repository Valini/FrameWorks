package com.jac.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name="student2")

public class Student {
	
	//Primary key of the table
	@Id
	private int StudentID;
	
	
	//@Column(name="username2")
	private String userName;
	@Override
	public String toString() {
		return "Student [StudentID=" + StudentID + ", userName=" + userName + ", password=" + password + ", city="
				+ city + ", getStudentID()=" + getStudentID() + ", getUserName()=" + getUserName() + ", getPassword()="
				+ getPassword() + ", getCity()=" + getCity() + "]";
	}
	private String password;
	private String city;
	
	
	public int getStudentID() {
		return StudentID;
	}
	public void setStudentID(int studentID) {
		StudentID = studentID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	

}
