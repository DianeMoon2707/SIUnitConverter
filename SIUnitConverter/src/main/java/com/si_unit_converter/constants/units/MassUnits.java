package com.si_unit_converter.constants.units;

public enum MassUnits implements SIUnit
{
	MILLIGRAM("mg", 1, null),
	GRAM("g", 1000, MILLIGRAM),
	KILOGRAM("kg", 1000, GRAM),
	TONNE("t", 1000, KILOGRAM);
	
	private String symbol;
	private int factor;
	private MassUnits nexSmallerUnit;
	
	MassUnits(String symbol, int factor, MassUnits nexSmallerUnit) 
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

	public MassUnits getNexSmallerUnit() 
	{
		return nexSmallerUnit;
	}
}
