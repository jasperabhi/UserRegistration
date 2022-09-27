package com.bankManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bankManagement.service.UserLoginService;

@RestController
@RequestMapping("/userLogin")
public class UserLoginController {
	
	@Autowired
	UserLoginService userLoginService;
	
	@GetMapping(value="/{id}/{password}")
	public ResponseEntity<String> login(@PathVariable("id") int id, @PathVariable("password") String password) {
		return new ResponseEntity<String>(userLoginService.login(id, password),HttpStatus.OK);
	}

}
