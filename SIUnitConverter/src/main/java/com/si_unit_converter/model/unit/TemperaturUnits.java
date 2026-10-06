package com.si_unit_converter.model.unit;

import com.si_unit_converter.model.SIUnit;

//Temperature units with individual conversion methods
public enum TemperaturUnits implements SIUnit
{
	KELVIN("K"),
	CELSIUS("°C");
	
	private String symbol;
	private static final double FACTOR = 273.15;

	TemperaturUnits(String symbol)
	{
		this.symbol = symbol;
	}

	public String getSymbol() 
	{
		return symbol;
	}

	@Override
	public double toBase(double value) 
	{
		return switch(this)
		{
			case CELSIUS -> value;
			case KELVIN -> value - FACTOR;
		};
	}

	@Override
	public double fromBase(double value) 
	{
		return switch(this)
		{
			case CELSIUS -> value;
			case KELVIN -> value + FACTOR;
		};
	}
}
