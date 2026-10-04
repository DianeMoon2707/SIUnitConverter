package com.si_unit_converter.convert_units_test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.si_unit_converter.model.BaseUnits;
import com.si_unit_converter.model.unit.TemperaturUnits;
import com.si_unit_converter.service.UnitConverterService;

public class TemperaturConvertingTest 
{
	private UnitConverterService unitConverterService = new UnitConverterService();
	
	private BaseUnits baseUnit = BaseUnits.TEMPERATUR;
	
	@Test
	public void testConvertKelvinInCelsius_1000KEquals726_85C_Equals()
	{
		TemperaturUnits sourceUnit = TemperaturUnits.KELVIN;
		TemperaturUnits targetUnit = TemperaturUnits.CELSIUS;
		
		double result = unitConverterService.convertUnits(baseUnit, 1000, sourceUnit.getSymbol(), targetUnit.getSymbol());
		double expectedResult = 726.85;
		
		Assertions.assertEquals(expectedResult, result);
	}
	
	@Test
	public void testConvertCelsiusInKelvin_1CEquals274_15K_Equals()
	{
		TemperaturUnits sourceUnit = TemperaturUnits.CELSIUS;
		TemperaturUnits targetUnit = TemperaturUnits.KELVIN;
		
		double result = unitConverterService.convertUnits(baseUnit, 1, sourceUnit.getSymbol(), targetUnit.getSymbol());
		double expectedResult = 274.15;
		
		Assertions.assertEquals(expectedResult, result);
	}
	
	@Test
	public void testConvertEqualUnits_1KEquals1K_Equals()
	{
		TemperaturUnits sourceUnit = TemperaturUnits.KELVIN;
		TemperaturUnits targetUnit = TemperaturUnits.KELVIN;
		
		double result = unitConverterService.convertUnits(baseUnit, 1, sourceUnit.getSymbol(), targetUnit.getSymbol());
		double expectedResult = 1;
		
		Assertions.assertEquals(expectedResult, result);
	}
}
