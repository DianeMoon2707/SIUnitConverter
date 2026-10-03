package com.si_unit_converter.model.unit;

import com.si_unit_converter.model.LinearUnit;

public enum MassUnits implements LinearUnit
{
	GRAM("g", 0.001),
	KILOGRAM("kg", 1),
	TONNE("t", 1000);
	
	private String symbol;
	private double factor;
	
	MassUnits(String symbol, double factor) 
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
