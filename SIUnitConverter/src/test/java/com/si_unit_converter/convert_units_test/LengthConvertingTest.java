package com.si_unit_converter.convert_units_test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.si_unit_converter.model.BaseUnits;
import com.si_unit_converter.model.unit.LengthUnits;
import com.si_unit_converter.service.UnitConverterService;

public class LengthConvertingTest 
{
	private UnitConverterService unitConverterService = new UnitConverterService();
	
	private BaseUnits baseUnit = BaseUnits.LENGTH;
	
	@Test
	public void testConvertMillimetreInCentimetre_1000mmEquals100cm_Equals()
	{
		LengthUnits sourceUnit = LengthUnits.MILLIMETRE;
		LengthUnits targetUnit = LengthUnits.CENTIMETRE;
		
		double result = unitConverterService.convertUnits(baseUnit, 1000, sourceUnit.getSymbol(), targetUnit.getSymbol());
		double expectedResult = 100;
		
		Assertions.assertEquals(expectedResult, result);
	}
	
	@Test
	public void testConvertMillimetreInMetre_1000mmEquals1m_Equals()
	{
		LengthUnits sourceUnit = LengthUnits.MILLIMETRE;
		LengthUnits targetUnit = LengthUnits.METRE;
		
		double result = unitConverterService.convertUnits(baseUnit, 1000, sourceUnit.getSymbol(), targetUnit.getSymbol());
		double expectedResult = 1;
		
		Assertions.assertEquals(expectedResult, result);
	}
	
	@Test
	public void testConvertKilometreInCentimetre_1kmEquals100000cm_Equals()
	{
		LengthUnits sourceUnit = LengthUnits.KILOMETRE;
		LengthUnits targetUnit = LengthUnits.CENTIMETRE;
		
		double result = unitConverterService.convertUnits(baseUnit, 1, sourceUnit.getSymbol(), targetUnit.getSymbol());
		double expectedResult = 100000;
		
		Assertions.assertEquals(expectedResult, result);
	}
	
	@Test
	public void testConvertEqualUnits_1kmEquals1km_Equals()
	{
		LengthUnits sourceUnit = LengthUnits.KILOMETRE;
		LengthUnits targetUnit = LengthUnits.KILOMETRE;
		
		double result = unitConverterService.convertUnits(baseUnit, 1, sourceUnit.getSymbol(), targetUnit.getSymbol());
		double expectedResult = 1;
		
		Assertions.assertEquals(expectedResult, result);
	}
}
