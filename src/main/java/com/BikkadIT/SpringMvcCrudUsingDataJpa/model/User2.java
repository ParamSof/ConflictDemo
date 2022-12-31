package com.BikkadIT.SpringMvcCrudUsingDataJpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER_DETAILS")
public class User2 {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="USER_USERID")
	private int newuserId;

	@Column(name="USER_USERNAME")
	private String newuserName;

	@Column(name="USER_USERADDRESS")
	private String newuseraddress;

	public int getNewuserId() {
		return newuserId;
	}

	public void setNewuserId(int newuserId) {
		this.newuserId = newuserId;
	}

	public String getNewuserName() {
		return newuserName;
	}

	public void setNewuserName(String newuserName) {
		this.newuserName = newuserName;
	}

	public String getNewuseraddress() {
		return newuseraddress;
	}

	public void setNewuseraddress(String newuseraddress) {
		this.newuseraddress = newuseraddress;
	}

	@Override
	public String toString() {
		return "User2 [newuserId=" + newuserId + ", newuserName=" + newuserName + ", newuseraddress=" + newuseraddress
				+ "]";
	}
	


	}

