package com.si_unit_converter.convert_units_test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.si_unit_converter.model.BaseUnits;
import com.si_unit_converter.model.unit.ElectricCurrentUnits;
import com.si_unit_converter.service.UnitConverterService;

public class ElectricCurrentTest
{
	private UnitConverterService unitConverterService = new UnitConverterService();
	
	private BaseUnits baseUnit = BaseUnits.ELECTRIC_CURRENT;
	
	@Test
	public void testConvertMilliampereInKiloampere_1000mAEquals0_001kA_Equals()
	{
		ElectricCurrentUnits sourceUnit = ElectricCurrentUnits.MILLIAMPERE;
		ElectricCurrentUnits targetUnit = ElectricCurrentUnits.KILOAMPERE;
		
		double result = unitConverterService.convertUnits(baseUnit, 1000, sourceUnit.getSymbol(), targetUnit.getSymbol());
		double expectedResult = 0.001;
		
		Assertions.assertEquals(expectedResult, result);
	}
	
	@Test
	public void testConvertAmpereInMilliampere_1AEquals1000mA_Equals()
	{
		ElectricCurrentUnits sourceUnit = ElectricCurrentUnits.AMPERE;
		ElectricCurrentUnits targetUnit = ElectricCurrentUnits.MILLIAMPERE;
		
		double result = unitConverterService.convertUnits(baseUnit, 1, sourceUnit.getSymbol(), targetUnit.getSymbol());
		double expectedResult = 1000;
		
		Assertions.assertEquals(expectedResult, result);
	}
	
	@Test
	public void testConvertEqualUnits_1mAEquals1mA_Equals()
	{
		ElectricCurrentUnits sourceUnit = ElectricCurrentUnits.MILLIAMPERE;
		ElectricCurrentUnits targetUnit = ElectricCurrentUnits.MILLIAMPERE;
		
		double result = unitConverterService.convertUnits(baseUnit, 1, sourceUnit.getSymbol(), targetUnit.getSymbol());
		double expectedResult = 1;
		
		Assertions.assertEquals(expectedResult, result);
	}
}
