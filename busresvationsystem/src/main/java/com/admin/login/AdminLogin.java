package com.admin.login;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin_details")
public class AdminLogin {
	@Id
	private String adminId;
	private String password;
	
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String userName) {
		this.adminId = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

}
