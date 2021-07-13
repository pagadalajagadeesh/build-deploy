package com.jagdi.aws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class JagdiController {

	@GetMapping(value = "jagdi")
	public String verify() {
		return "welcome Jagdi...!!!";
	}
	
	@GetMapping
	public String welcome() {
		return "welcome chief...!!!";
	}
	
	@GetMapping(value = "aws")
	public String aws() {
		return "welcome to aws Jagdi...!!!";
	}
	
}
