package com.si_unit_converter.model.unit;

import com.si_unit_converter.model.LinearUnit;

public enum ElectricCurrentUnits implements LinearUnit
{
	MICROAMPERE("µA", 0.000001),
	MILLIAMPERE("mA", 0.001),
	AMPERE("A", 1),
	KILOAMPERE("kA", 1000);
	
	private String symbol;
	private double factor;
	
	ElectricCurrentUnits(String symbol, double factor) 
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
