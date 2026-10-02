package com.si_unit_converter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController 
{
	private static final String PAGE_ROUTE = "index.html";
	
	@GetMapping("/")
	public String loadIndexPage()
	{
		return PAGE_ROUTE;
	}
}
