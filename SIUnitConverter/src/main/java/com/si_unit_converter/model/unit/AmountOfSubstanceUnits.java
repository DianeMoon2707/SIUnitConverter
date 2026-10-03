package com.si_unit_converter.model.unit;

import com.si_unit_converter.model.LinearUnit;

public enum AmountOfSubstanceUnits implements LinearUnit
{
	MICROMOLE("µmol", 0.0000001),
	MILLIMOLE("mmol", 0.0001),
	MOLE("mol", 1),
	KILOMOLE("kmol", 1000);
	
	private String symbol;
	private double factor;
	
	AmountOfSubstanceUnits(String symbol, double factor) 
	{
		this.symbol = symbol;
		this.factor = factor;
	}

	public String getSymbol() 
	{
		return symbol;
	}

	public double getFactor() 
	{
		return factor;
	}
}
