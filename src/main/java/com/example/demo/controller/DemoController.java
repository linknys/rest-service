package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.ServicePerson;

@RestController
public class DemoController {
	
	@Autowired
	private ServicePerson servicePerson;
	
	@RequestMapping(value="/getPersonData",method=RequestMethod.GET)
	public ServicePerson getPersonData() {
		
		servicePerson.setId("1");
		servicePerson.setName("TESTE");
		servicePerson.setAge("33");
		servicePerson.setHeight("1,52");
		
		return servicePerson;
		
	}

}
