package com.si_unit_converter.model.unit;

import com.si_unit_converter.model.LinearUnit;

public enum TimeUnits implements LinearUnit
{
	SECOND("s", 1),
	MINUTE("min", 60),
	HOUR("h", 60*60),
	DAY("d", 24*60*60);
	
	private String symbol;
	private double factor;
	
	TimeUnits(String symbol, double factor) 
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
