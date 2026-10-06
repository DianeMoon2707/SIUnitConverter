package com.si_unit_converter.convert_units_test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.si_unit_converter.model.BaseUnits;
import com.si_unit_converter.model.unit.MassUnits;
import com.si_unit_converter.service.UnitConverterService;

public class MassConvertingTest 
{
	private UnitConverterService unitConverterService = new UnitConverterService();
	
	private BaseUnits baseUnit = BaseUnits.MASS;
	
	@Test
	public void testConvertGramInKilogram_1000gEquals1kg_Equals()
	{
		MassUnits sourceUnit = MassUnits.GRAM;
		MassUnits targetUnit = MassUnits.KILOGRAM;
		
		double result = unitConverterService.convertUnits(baseUnit, 1000, sourceUnit.getSymbol(), targetUnit.getSymbol());
		double expectedResult = 1;
		
		Assertions.assertEquals(expectedResult, result);
	}
	
	@Test
	public void testConvertGramInTonne_1000gEquals0_001t_Equals()
	{
		MassUnits sourceUnit = MassUnits.GRAM;
		MassUnits targetUnit = MassUnits.TONNE;
		
		double result = unitConverterService.convertUnits(baseUnit, 1000, sourceUnit.getSymbol(), targetUnit.getSymbol());
		double expectedResult = 0.001;
		
		Assertions.assertEquals(expectedResult, result);
	}
	
	@Test
	public void testConvertTonneInGram_1tEquals1000000g_Equals()
	{
		MassUnits sourceUnit = MassUnits.TONNE;
		MassUnits targetUnit = MassUnits.GRAM;
		
		double result = unitConverterService.convertUnits(baseUnit, 1, sourceUnit.getSymbol(), targetUnit.getSymbol());
		double expectedResult = 1000000;
		
		Assertions.assertEquals(expectedResult, result);
	}
	
	@Test
	public void testConvertEqualUnits_1kgEquals1kg_Equals()
	{
		MassUnits sourceUnit = MassUnits.KILOGRAM;
		MassUnits targetUnit = MassUnits.KILOGRAM;
		
		double result = unitConverterService.convertUnits(baseUnit, 1, sourceUnit.getSymbol(), targetUnit.getSymbol());
		double expectedResult = 1;
		
		Assertions.assertEquals(expectedResult, result);
	}
}
