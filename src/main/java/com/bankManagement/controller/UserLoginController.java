package com.bankManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bankManagement.model.UserLogin;
import com.bankManagement.service.UserLoginService;

@RestController
@RequestMapping("/userLogin")
public class UserLoginController {
	
	@Autowired
	UserLoginService userLoginService;
	
	@GetMapping(value="/login")
	public ResponseEntity<String> login(@RequestBody UserLogin userLogin) {
		return new ResponseEntity<String>(userLoginService.login(userLogin.getUserId(), userLogin.getPassword()),HttpStatus.OK);
	}

}
