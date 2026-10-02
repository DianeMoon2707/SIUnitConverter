package com.si_unit_converter.constants.units;

public enum LengthUnits implements SIUnit
{
	MILLIMETRE("mm", 1, null),
	CENTIMETRE("cm", 10, MILLIMETRE),
	DECIMETRE("dm", 10, CENTIMETRE),
	METRE("m", 10, DECIMETRE),
	KILOMETRE("km", 1000, METRE);
	
	private String symbol;
	private int factor;
	private LengthUnits nexSmallerUnit;
	
	LengthUnits(String symbol, int factor, LengthUnits nexSmallerUnit)
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

	public LengthUnits getNexSmallerUnit() 
	{
		return nexSmallerUnit;
	}
}
