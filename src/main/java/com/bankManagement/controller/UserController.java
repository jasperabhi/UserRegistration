package com.bankManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bankManagement.service.UserService;

@RestController
@RequestMapping("/userRegistration")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping(value="/userRegister")
	public String userRgiser() {
		return userService.userRegistration();
		
	}
}
