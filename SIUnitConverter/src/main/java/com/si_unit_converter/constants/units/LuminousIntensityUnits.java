package com.si_unit_converter.constants.units;

public enum LuminousIntensityUnits implements SIUnit
{
	MILLICANDELA("mcd", 1, null),
	CANDELA("cd", 1000, MILLICANDELA),
	KILOCANDELA("kcd", 1000, CANDELA);
	
	private String symbol;
	private int factor;
	private LuminousIntensityUnits nexSmallerUnit;
	
	LuminousIntensityUnits(String symbol, int factor, LuminousIntensityUnits nexSmallerUnit)
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

	public LuminousIntensityUnits getNexSmallerUnit() 
	{
		return nexSmallerUnit;
	}
}
