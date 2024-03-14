package com.webApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/Web")
public class WebController {
	
	@GetMapping(value="/getStringWeb")
	public String getStringWeb() {
		return "My first WebApp Project";
	}

}
