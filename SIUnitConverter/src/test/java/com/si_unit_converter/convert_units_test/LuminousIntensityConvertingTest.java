package com.si_unit_converter.convert_units_test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.si_unit_converter.model.BaseUnits;
import com.si_unit_converter.model.unit.LuminousIntensityUnits;
import com.si_unit_converter.service.UnitConverterService;

public class LuminousIntensityConvertingTest 
{
	private UnitConverterService unitConverterService = new UnitConverterService();
	
	private BaseUnits baseUnit = BaseUnits.LUMINOUS_INTENSITY;
	
	@Test
	public void testConvertMillicandelaInKilocandela_1000000mcdEquals1kcd_Equals()
	{
		LuminousIntensityUnits sourceUnit = LuminousIntensityUnits.MILLICANDELA;
		LuminousIntensityUnits targetUnit = LuminousIntensityUnits.KILOCANDELA;
		
		double result = unitConverterService.convertUnits(baseUnit, 1000000, sourceUnit.getSymbol(), targetUnit.getSymbol());
		double expectedResult = 1;
		
		Assertions.assertEquals(expectedResult, result);
	}
	
	@Test
	public void testConvertKilocandelaInMillicandela_1kcdEquals1000000mcd_Equals()
	{
		LuminousIntensityUnits sourceUnit = LuminousIntensityUnits.KILOCANDELA;
		LuminousIntensityUnits targetUnit = LuminousIntensityUnits.MILLICANDELA;
		
		double result = unitConverterService.convertUnits(baseUnit, 1, sourceUnit.getSymbol(), targetUnit.getSymbol());
		double expectedResult = 1000000;
		
		Assertions.assertEquals(expectedResult, result);
	}
	
	@Test
	public void testConvertEqualUnits_1mcdEquals1mcd_Equals()
	{
		LuminousIntensityUnits sourceUnit = LuminousIntensityUnits.MILLICANDELA;
		LuminousIntensityUnits targetUnit = LuminousIntensityUnits.MILLICANDELA;
		
		double result = unitConverterService.convertUnits(baseUnit, 1, sourceUnit.getSymbol(), targetUnit.getSymbol());
		double expectedResult = 1;
		
		Assertions.assertEquals(expectedResult, result);
	}
}
