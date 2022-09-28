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

}
