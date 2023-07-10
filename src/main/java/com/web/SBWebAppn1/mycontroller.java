package com.web.SBWebAppn1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class mycontroller {
	@RequestMapping("/req1")
	@ResponseBody
	public String home()
	{
		return "<h1>welcome to spring boot web application </h1>";
		
	}

}
