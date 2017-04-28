/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.domain;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;


public class Login {
	@NotEmpty(message = "Please enter your userid")
	@Size(min=4,max=15 , message = "Invalid Credentials.")
    private String userName;
	
	@NotEmpty(message = "Please enter your password.")
	@Size(min=8,max=15 , message = "Invalid Credentials.")
    
	private String password;   

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
}
