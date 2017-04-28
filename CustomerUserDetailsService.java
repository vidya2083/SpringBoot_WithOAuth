package com.example.controller;

import java.util.Arrays;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.domain.Customer;
import com.example.repository.CustomerRepository;


@Service
public class CustomerUserDetailsService implements UserDetailsService {
private final CustomerRepository customerRepository;
@Autowired
public CustomerUserDetailsService(CustomerRepository customerRepository){
	this.customerRepository=customerRepository;
	
}
@Override
public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	// TODO Auto-generated method stub
	Customer customer = customerRepository.findOne(username);
	List<String> userRoles=Arrays.asList("USER");//userrolesrepository.findRoleByUserName() is not used and defaulted to only one role as USER
	
	return new CustomerUserDetails(customer,userRoles);
}
}
