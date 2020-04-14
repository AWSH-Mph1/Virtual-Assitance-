package com.mphasis.virtual.pax.assitant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mphasis.virtual.pax.assitant.entity.FlightAvalibility;
import com.mphasis.virtual.pax.assitant.entity.FlightInfo;
import com.mphasis.virtual.pax.assitant.entity.PassportInfo;
import com.mphasis.virtual.pax.assitant.service.Dbservice;

@RestController
public class DBController {

	@Autowired
	Dbservice dbservice;
	
	@GetMapping("/getfightInfo/{source}/{dest}")
	public FlightInfo createDbTable(@PathVariable String source,@PathVariable String dest) {
		
		return dbservice.getFlightInfo(source,dest);
	}
	
	@GetMapping("/getavaliblefightInfo/{source}/{dest}")
	public FlightAvalibility getavaliblefightInfo(@PathVariable String source,@PathVariable String dest) {
		
		return dbservice.getAvaliblefightInfo(source,dest);
	}
	
	@GetMapping("/getbyId/{id}")
	public PassportInfo getByID(@PathVariable String id) {
		
		
		return dbservice.getImageDetails(id);
	}
	
}
