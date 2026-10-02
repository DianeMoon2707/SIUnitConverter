package com.si_unit_converter.constants.units;

public enum ElectricCurrentUnits implements SIUnit
{
	MICROAMPERE("µA", 1, null),
	MILLIAMPERE("mA", 1000, MICROAMPERE),
	AMPERE("A", 1000, MILLIAMPERE),
	KILOAMPERE("kA", 1000, AMPERE);
	
	private String symbol;
	private int factor;
	private ElectricCurrentUnits nexSmallerUnit;
	
	ElectricCurrentUnits(String symbol, int factor, ElectricCurrentUnits nexSmallerUnit) 
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

	public ElectricCurrentUnits getNexSmallerUnit()
	{
		return nexSmallerUnit;
	}
}
