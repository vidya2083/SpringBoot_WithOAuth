/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;



@Entity
@Table(name = "USER_DETAILS")
public class Customer {

	@Id
	@NotEmpty(message = "UserId must not be blank.")
	@Size(min = 4, max = 15, message = "UserId must be between 4 to 15 Characters.")
	private String userId;

	@NotEmpty(message = "Password must not be blank.")
	@Size(min = 8, max = 15, message = "Password must be between 8 to 15 Characters.")
	private String password;
	@NotEmpty(message = "Name must not be blank.")
	@Size(min = 4, max = 15, message = "Name must be between 4 to 15 Characters.")
	private String name;
	@NotEmpty(message = "City must not be blank.")
	private String city;
	@NotEmpty(message = "Email must not be blank.")
	@Email
	private String email;
	@NotEmpty(message = "PhoneNumber must not be blank.")
	@Size(min = 10, max = 10, message = "PhoneNumber must be 10 digits.")
	private String phone;
	public Customer(Customer user){
		this.userId=user.userId;
		this.name=user.name;
		this.city=user.city;
		this.email=user.email;
		this.password=user.password;
		this.phone=user.phone;
	}
	public Customer(){}
	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	public String getEmail() {
		return email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
}
