package com.si_unit_converter.controller;

import java.util.List;
import java.util.stream.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.si_unit_converter.model.BaseUnits;
import com.si_unit_converter.model.SIUnit;
import com.si_unit_converter.service.UnitConverterService;

@Controller
public class IndexController 
{
	private static final String PAGE_ROUTE = "index";
	private static final String UNITS_ROUTE = "index/units";
	
	private UnitConverterService unitConverterService;
	
	public IndexController(UnitConverterService unitConverterService)
	{
		this.unitConverterService = unitConverterService;
	}

	@GetMapping("/")
	public String loadIndexPage(Model model)
	{
		BaseUnits baseUnit = BaseUnits.LENGTH;
		model.addAttribute("options", 
			Stream.of(baseUnit.getUnits())
			.map(SIUnit::getSymbol)
			.collect(Collectors.toList()));
		
		model.addAttribute("selectedBaseUnit", baseUnit);
		
		return PAGE_ROUTE;
	}
	
	@ResponseBody
	@GetMapping(UNITS_ROUTE)
	public List<String> loadUnits(@RequestParam BaseUnits baseUnit, Model model)
	{
		BaseUnits[] units = BaseUnits.values();
		int index = this.searchSIUnit(units, baseUnit);

		return Stream.of(units[index].getUnits())
				.map(SIUnit::getSymbol)
				.collect(Collectors.toList());
	}
	
	@GetMapping("/convert")
	public String convertUnits(Model model,
			@RequestParam("base-units") BaseUnits baseUnit, @RequestParam("source-unit-input") double input, 
			@RequestParam("source-unit-select") String sourceUnit, @RequestParam("target-unit-select") String targetUnit)
	{
		double result = unitConverterService.convertUnits(baseUnit, input, sourceUnit, targetUnit);
		
		this.reloadPage(model, baseUnit, input, result, sourceUnit, targetUnit);
		
		return PAGE_ROUTE;
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
	
	private void reloadPage(Model model, BaseUnits baseUnit, double input, double result,
			String sourceUnit, String targetUnit)
	{		
		model.addAttribute("options", 
				Stream.of(baseUnit.getUnits())
				.map(SIUnit::getSymbol)
				.collect(Collectors.toList()));
		model.addAttribute("selectedBaseUnit", baseUnit);
		
		model.addAttribute("sourceUnitInputValue", input);
		model.addAttribute("targetUnitInputValue", result);
		
		model.addAttribute("selectedSourceUnit", sourceUnit);
		model.addAttribute("selectedTargetUnit", targetUnit);
	}
}
