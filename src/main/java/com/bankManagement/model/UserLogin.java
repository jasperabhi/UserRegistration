package com.bankManagement.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserLogin {
	int userId;
	String password;
	
	@Override
	public String toString() {
		return "UserLogin [userId=" + userId + ", password=" + password + "]";
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
}
