package com.si_unit_converter.convert_units_test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.si_unit_converter.model.BaseUnits;
import com.si_unit_converter.model.unit.AmountOfSubstanceUnits;
import com.si_unit_converter.service.UnitConverterService;

public class AmountOfSubstanceConvertingTest 
{
	private UnitConverterService unitConverterService = new UnitConverterService();
	
	private BaseUnits baseUnit = BaseUnits.AMOUNT_OF_SUBSTANCE;
	
	@Test
	public void testConvertMoleInKilomole_1000molEquals1kmol_Equals()
	{
		AmountOfSubstanceUnits sourceUnit = AmountOfSubstanceUnits.MOLE;
		AmountOfSubstanceUnits targetUnit = AmountOfSubstanceUnits.KILOMOLE;
		
		double result = unitConverterService.convertUnits(baseUnit, 1000, sourceUnit.getSymbol(), targetUnit.getSymbol());
		double expectedResult = 1;
		
		Assertions.assertEquals(expectedResult, result);
	}
	
	@Test
	public void testConvertKilomoleInMole_1000kmolEquals1mol_Equals()
	{
		AmountOfSubstanceUnits sourceUnit = AmountOfSubstanceUnits.KILOMOLE;
		AmountOfSubstanceUnits targetUnit = AmountOfSubstanceUnits.MOLE;
		
		double result = unitConverterService.convertUnits(baseUnit, 1, sourceUnit.getSymbol(), targetUnit.getSymbol());
		double expectedResult = 1000;
		
		Assertions.assertEquals(expectedResult, result);
	}
	
	@Test
	public void testConvertEqualUnits_1molEquals1mol_Equals()
	{
		AmountOfSubstanceUnits sourceUnit = AmountOfSubstanceUnits.MOLE;
		AmountOfSubstanceUnits targetUnit = AmountOfSubstanceUnits.MOLE;
		
		double result = unitConverterService.convertUnits(baseUnit, 1, sourceUnit.getSymbol(), targetUnit.getSymbol());
		double expectedResult = 1;
		
		Assertions.assertEquals(expectedResult, result);
	}
}
