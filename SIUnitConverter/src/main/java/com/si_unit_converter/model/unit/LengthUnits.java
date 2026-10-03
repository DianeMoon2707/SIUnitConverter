package com.si_unit_converter.model.unit;

import com.si_unit_converter.model.LinearUnit;

public enum LengthUnits implements LinearUnit
{
	MILLIMETRE("mm", 0.001),
	CENTIMETRE("cm", 0.01),
	DECIMETRE("dm", 0.1),
	METRE("m", 1),
	KILOMETRE("km", 1000);
	
	private String symbol;
	private double factor;
	
	LengthUnits(String symbol, double factor)
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
