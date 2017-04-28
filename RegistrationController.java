package com.example.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.example.domain.Customer;

@Controller
public class RegistrationController {
	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(value = "/register.htm", method = RequestMethod.GET)
	public ModelAndView register(Model model) {

		return new ModelAndView("register", "command", new Customer());
	}

	@RequestMapping(value = "/Success.htm", method = RequestMethod.POST)
	public ModelAndView addCustomer(@Valid @ModelAttribute("command") Customer customer, BindingResult result,
			ModelMap model) {
		if (result.hasErrors()) {

			return new ModelAndView("register", "command", customer);
		} else {
			System.out.println("success");
			Boolean validUser = restTemplate.postForObject("http://localhost:8989/customers/", customer,
					Boolean.class);
			if (validUser == true) {
				System.out.println("success");
				return new ModelAndView("success");
			} else
				return new ModelAndView("failure", "command", "User with the same username already exists!");

		}
	}
}
