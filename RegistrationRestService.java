package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Customer;
import com.example.repository.CustomerRepository;

@RestController
public class RegistrationRestService {
	@Autowired
	private CustomerRepository customerRepository;
	@RequestMapping(value = "/customers", method = RequestMethod.POST)
	public ResponseEntity<Boolean> insertCustomer(@RequestBody Customer customer){

		Boolean result=true;
		try{
			System.out.println("success1");
			customerRepository.saveAndFlush(customer);
			System.out.println("success2");
		}catch(Exception e){
			result=false;
		}

		return new ResponseEntity<Boolean>(result,HttpStatus.OK);

	}

}


