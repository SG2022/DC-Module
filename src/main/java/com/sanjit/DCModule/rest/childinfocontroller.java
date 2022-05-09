package com.sanjit.DCModule.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sanjit.DCModule.binding.DCChildDetails;
import com.sanjit.DCModule.service.DCService;
@RestController
public class childinfocontroller {
	
	@Autowired
	DCService service;
	
	@PostMapping("/child")
	public ResponseEntity<String> childInfo(@RequestBody DCChildDetails details)
	{
	String status = service.addChildInfo(details);
	return new ResponseEntity<>(status, HttpStatus.OK);
	}

}
