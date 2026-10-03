package com.si_unit_converter.controller;

import java.util.List;
import java.util.stream.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.si_unit_converter.model.BaseUnits;
import com.si_unit_converter.model.SIUnit;

@Controller
public class IndexController 
{
	private static final String PAGE_ROUTE = "index";
	private static final String UNITS_ROUTE = "index/units";
	
	@GetMapping("/")
	public String loadIndexPage(Model model)
	{
		BaseUnits[] units = BaseUnits.values();
		model.addAttribute("options", units[0].getUnits());
		
		return PAGE_ROUTE;
	}
	
	@ResponseBody
	@GetMapping(UNITS_ROUTE)
	public List<String> loadUnits(@RequestParam BaseUnits baseUnit, Model model)
	{
		BaseUnits[] units = BaseUnits.values();
		int index = this.searchSIUnit(units, baseUnit);

		return Stream.of(units[index].getUnits()).map(SIUnit::getSymbol).collect(Collectors.toList());
	}
	
	private int searchSIUnit(BaseUnits[] units, BaseUnits searchedBaseUnit)
	{		
		for(int i = 0; i < units.length; i++)
		{
			if(units[i] == searchedBaseUnit)
			{
				return i;
			}
		}
		
		return 0;
	}
}
