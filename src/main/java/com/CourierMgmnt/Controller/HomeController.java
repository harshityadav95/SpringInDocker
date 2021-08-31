package com.CourierMgmnt.Controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
		@RequestMapping("/")
	public String helloworld()
	{
		return "It Works";
	}

}
