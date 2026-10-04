package com.si_unit_converter.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.si_unit_converter.constants.*;
import com.si_unit_converter.model.BaseUnits;
import com.si_unit_converter.service.UnitConverterService;

@Controller
public class IndexController 
{	
	private UnitConverterService unitConverterService;

	public IndexController(UnitConverterService unitConverterService)
	{
		this.unitConverterService = unitConverterService;
	}

	@GetMapping("/")
	public String loadIndexPage(Model model)
	{
		BaseUnits baseUnit = BaseUnits.LENGTH;
		model.addAttribute(AttributeConstants.OPTIONS, BaseUnits.getSymbolList(baseUnit));
		
		model.addAttribute(AttributeConstants.SELECTED_BASE_UNIT, baseUnit);
		
		return RouteConstants.PAGE;
	}
	
	@ResponseBody
	@GetMapping(RouteConstants.UNITS)
	public List<String> loadUnits(@RequestParam BaseUnits baseUnit, Model model)
	{
		BaseUnits[] units = BaseUnits.values();
		int index = BaseUnits.searchSIUnit(units, baseUnit);

		return BaseUnits.getSymbolList(units[index]);
	}
	
	@GetMapping("/convert")
	public String convertUnits(Model model,
			@RequestParam(RequestParamConstants.BASE_UNIT) BaseUnits baseUnit, 
			@RequestParam(RequestParamConstants.SOURCE_UNIT_INPUT) double input, 
			@RequestParam(RequestParamConstants.SOURCE_UNIT_SELECT) String sourceUnit, 
			@RequestParam(RequestParamConstants.TARGET_UNIT_SELECT) String targetUnit)
	{
		double result = unitConverterService.convertUnits(baseUnit, input, sourceUnit, targetUnit);
		
		this.reloadPage(model, baseUnit, input, result, sourceUnit, targetUnit);
		
		return RouteConstants.PAGE;
	}
	
	private void reloadPage(Model model, BaseUnits baseUnit, double input, double result,
			String sourceUnit, String targetUnit)
	{		
		model.addAttribute(AttributeConstants.OPTIONS, BaseUnits.getSymbolList(baseUnit));
		model.addAttribute(AttributeConstants.SELECTED_BASE_UNIT, baseUnit);
		
		model.addAttribute(AttributeConstants.SOURCE_UNIT_INPUT, input);
		model.addAttribute(AttributeConstants.TARGET_UNIT_INPUT, result);
		
		model.addAttribute(AttributeConstants.SELECTED_SOURCE_UNIT, sourceUnit);
		model.addAttribute(AttributeConstants.SELECTED_TARGET_UNIT, targetUnit);
	}
}
