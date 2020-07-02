package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sillyHello")
public class SillyController {

	@RequestMapping("/showform")
	public String displayTheForm() {
		return "silly";
	}
}
