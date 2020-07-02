package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	// need a controller method to show the initial HTML form

	@RequestMapping("/showform")
	private String showForm() {
		return "helloworld-form";
	}

	// need a controller method to process the HTML form
	@RequestMapping("/processForm")
	private String processForm() {
		return "helloworld";

	}

	// new a controller method to read from data and a add data to the model
	@RequestMapping("/processFormVersionTwo")
	private String letsShoutDude(HttpServletRequest requsest, Model model) {

		// read the request parameter from the HTML form
		String theName = requsest.getParameter("StudentName");

		// convert the data to all caps
		theName = theName.toUpperCase();

		// create the message
		String result = "Yo! " + theName;

		// add message to the model
		model.addAttribute("message", result);

		return "helloworld";

	}

	@RequestMapping("/processFormVersionThree")
	private String processFormVersionThree(@RequestParam("StudentName") String theName, Model model) {

		// convert the data to all caps
		theName = theName.toUpperCase();

		// create the message
		String result = "hey My Friend from v3! " + theName;

		// add message to the model
		model.addAttribute("message", result);

		return "helloworld";

	}
}
