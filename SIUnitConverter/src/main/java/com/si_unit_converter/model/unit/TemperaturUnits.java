package com.si_unit_converter.model.unit;

import com.si_unit_converter.model.SIUnit;

public enum TemperaturUnits implements SIUnit
{
	KELVIN("K"),
	CELSIUS("°C");
	
	private String symbol;

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
			case KELVIN -> value - 273.15;
		};
	}

	@Override
	public double fromBase(double value) 
	{
		return switch(this)
		{
			case CELSIUS -> value;
			case KELVIN -> value + 273.15;
		};
	}
}
