/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes("userName")
public class LoginController {
	

	//@Autowired
	//private RestTemplate restTemplate;

	/*@RequestMapping(value = "/login.htm", method = RequestMethod.POST)
	public ModelAndView getLoginDetails(ModelMap model,@RequestParam String userName) {
	
		return new ModelAndView("home");
	}*/
	@PreAuthorize("#oauth2.hasScope('read')")
	@RequestMapping(value = "/searchFlightsService.htm", method = RequestMethod.POST)
	public void processLoginDetails(ModelMap model,@SessionAttribute("userName")String userName) {
		
				model.addAttribute("userName",userName );
				System.out.println("working");
				//return new ModelAndView("searchFlights", "command", new SearchFlights());
			
		}

	

}
