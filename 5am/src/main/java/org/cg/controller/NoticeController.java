package org.cg.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/notice")
public class NoticeController {
	Logger logger= Logger.getLogger(NoticeController.class);
	
	@GetMapping("/list")
	public void getNotice(){
		
	}
	

}
