package org.cg.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	Logger logger= Logger.getLogger(CustomerController.class);
	
	@GetMapping
	public void getCustomer(){
		
	}
	

}
