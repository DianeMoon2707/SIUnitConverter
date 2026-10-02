package com.si_unit_converter.constants.units;

public enum TimeUnits implements SIUnit
{
	SECOND("s", 1, null),
	MINUTE("min", 60, SECOND),
	HOUR("h", 60, MINUTE),
	DAY("d", 24, HOUR);
	
	private String symbol;
	private int factor;
	private TimeUnits nexSmallerUnit;
	
	TimeUnits(String symbol, int factor, TimeUnits nexSmallerUnit) 
	{
		this.symbol = symbol;
		this.factor = factor;
		this.nexSmallerUnit = nexSmallerUnit;
	}

	public String getSymbol()
	{
		return symbol;
	}

	public int getFactor() 
	{
		return factor;
	}

	public TimeUnits getNexSmallerUnit() 
	{
		return nexSmallerUnit;
	}
}
