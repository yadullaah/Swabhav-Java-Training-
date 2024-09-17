package com.entity;

public class Admin {
	private int adminId;
	private String adminFirstName;
	private String adminLastName;
	private String adminEmailId;
	private String adminPassword;
	
	
	public Admin(int adminId, String adminFirstName, String adminLastName, String adminEmailId, String adminPassword) {
		super();
		this.adminId = adminId;
		this.adminFirstName = adminFirstName;
		this.adminLastName = adminLastName;
		this.adminEmailId = adminEmailId;
		this.adminPassword = adminPassword;
	}


	public int getAdminId() {
		return adminId;
	}


	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}


	public String getAdminFirstName() {
		return adminFirstName;
	}


	public void setAdminFirstName(String adminFirstName) {
		this.adminFirstName = adminFirstName;
	}


	public String getAdminLastName() {
		return adminLastName;
	}


	public void setAdminLastName(String adminLastName) {
		this.adminLastName = adminLastName;
	}


	public String getAdminEmailId() {
		return adminEmailId;
	}


	public void setAdminEmailId(String adminEmailId) {
		this.adminEmailId = adminEmailId;
	}


	public String getAdminPassword() {
		return adminPassword;
	}


	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}


	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminFirstName=" + adminFirstName + ", adminLastName=" + adminLastName
				+ ", adminEmailId=" + adminEmailId + ", adminPassword=" + adminPassword + "]";
	}
	
	
	
}
