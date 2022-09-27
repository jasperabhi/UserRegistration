package com.bankManagement.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankManagement.model.User;
import com.bankManagement.repository.UserLoginRepo;

@Service
public class UserLoginService {
	@Autowired
	UserLoginRepo userLoginRepo;

	public String login(int userId, String password) {
		Optional<User> userOptional = userLoginRepo.findById(userId);
		if (userOptional.isPresent()) {
			User user = userOptional.get();
			if (user.getPassword().equals(password)) {
				return "Loging success";
			} 
			else{
				return "password error";
			}
		}
		else{
			return "User not present";
		}
	}

}
