package org.cg.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/qna")
public class QnaController {
	Logger logger= Logger.getLogger(QnaController.class);
	
	@GetMapping
	public void getQna(){
		
	}
	

}
