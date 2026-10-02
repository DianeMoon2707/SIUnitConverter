package com.si_unit_converter.controller;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class IndexController 
{
	private static final String PAGE_ROUTE = "index";
	private static final String UNITS_ROUTE = "index/units";
	
	@GetMapping("/")
	public String loadIndexPage()
	{
		return PAGE_ROUTE;
	}
	
	@ResponseBody
	@GetMapping(UNITS_ROUTE)
	public List<String> loadUnits(@RequestParam String baseUnit)
	{
		System.out.println("Ja");
		
		List<String> units = new ArrayList<String>();
		if(baseUnit.equals("Masse"))
		{
			units.add("1");
		}
		else
		{
			units.add("2");
		}
		
		System.out.println("Ja");
		
		return units;
	}
}
