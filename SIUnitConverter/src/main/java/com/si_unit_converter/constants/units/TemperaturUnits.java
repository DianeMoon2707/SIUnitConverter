package com.si_unit_converter.constants.units;

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
}
