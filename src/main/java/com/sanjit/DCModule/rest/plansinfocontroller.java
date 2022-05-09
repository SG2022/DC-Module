package com.sanjit.DCModule.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sanjit.DCModule.binding.DCPlansForm;
import com.sanjit.DCModule.service.DCService;

@RestController
public class plansinfocontroller {
	
	@Autowired
	DCService service;
	
	@PostMapping("/plans")
	public ResponseEntity<String> saveplans(@RequestBody DCPlansForm plansform  )
	{
		
		String status = service.addPlanInfo(plansform);
		return new ResponseEntity(status, HttpStatus.OK);
	}

}
