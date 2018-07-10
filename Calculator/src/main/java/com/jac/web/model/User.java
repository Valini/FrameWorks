package com.jac.web.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class User {
	
	@Id
	private int id;
	private String username;

	private String password;
	private int aptno;

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAptno() {
		return aptno;
	}
	public void setAptno(int aptno) {
		this.aptno = aptno;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", aptno=" + aptno + ", getUsername()="
				+ getUsername() + ", getPassword()=" + getPassword() + ", getAptno()=" + getAptno() + "]";
	}
}
