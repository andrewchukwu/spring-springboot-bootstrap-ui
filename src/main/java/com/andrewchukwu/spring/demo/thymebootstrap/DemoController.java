package com.andrewchukwu.spring.demo.thymebootstrap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	@GetMapping("/index")
	public String homepage(Model theModel) {
		theModel.addAttribute("title", "Simple steps to import bootstrap in Springboot Application!");
		return "index";
	}
}
