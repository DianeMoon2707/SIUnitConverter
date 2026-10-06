package com.si_unit_converter.convert_units_test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.si_unit_converter.model.BaseUnits;
import com.si_unit_converter.model.unit.TimeUnits;
import com.si_unit_converter.service.UnitConverterService;

public class TimeConvertingTest 
{
	private UnitConverterService unitConverterService = new UnitConverterService();
	
	private BaseUnits baseUnit = BaseUnits.TIME;
	
	@Test
	public void testConvertSecondInMinute_120sEquals2min_Equals()
	{
		TimeUnits sourceUnit = TimeUnits.SECOND;
		TimeUnits targetUnit = TimeUnits.MINUTE;
		
		double result = unitConverterService.convertUnits(baseUnit, 120, sourceUnit.getSymbol(), targetUnit.getSymbol());
		double expectedResult = 2;
		
		Assertions.assertEquals(expectedResult, result);
	}
	
	@Test
	public void testConvertDayInHour_1dEquals24h_Equals()
	{
		TimeUnits sourceUnit = TimeUnits.DAY;
		TimeUnits targetUnit = TimeUnits.HOUR;
		
		double result = unitConverterService.convertUnits(baseUnit, 1, sourceUnit.getSymbol(), targetUnit.getSymbol());
		double expectedResult = 24;
		
		Assertions.assertEquals(expectedResult, result);
	}
	
	@Test
	public void testConvertEqualUnits_1dEquals1d_Equals()
	{
		TimeUnits sourceUnit = TimeUnits.DAY;
		TimeUnits targetUnit = TimeUnits.DAY;
		
		double result = unitConverterService.convertUnits(baseUnit, 1, sourceUnit.getSymbol(), targetUnit.getSymbol());
		double expectedResult = 1;
		
		Assertions.assertEquals(expectedResult, result);
	}
}
