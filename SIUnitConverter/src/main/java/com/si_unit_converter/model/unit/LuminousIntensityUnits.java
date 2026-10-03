package com.si_unit_converter.model.unit;

import com.si_unit_converter.model.LinearUnit;

public enum LuminousIntensityUnits implements LinearUnit
{
	MILLICANDELA("mcd", 0.001),
	CANDELA("cd", 1),
	KILOCANDELA("kcd", 1000);
	
	private String symbol;
	private double factor;
	
	LuminousIntensityUnits(String symbol, double factor)
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
