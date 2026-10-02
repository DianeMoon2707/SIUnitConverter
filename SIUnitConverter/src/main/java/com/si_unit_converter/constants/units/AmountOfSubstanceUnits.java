package com.si_unit_converter.constants.units;

public enum AmountOfSubstanceUnits implements SIUnit
{
	MICROMOLE("µmol", 1, null),
	MILLIMOLE("mmol", 1000, MICROMOLE),
	MOLE("mol", 1000, MILLIMOLE),
	KILOMOLE("kmol", 1000, MOLE);
	
	private String symbol;
	private int factor;
	private AmountOfSubstanceUnits nexSmallerUnit;
	
	AmountOfSubstanceUnits(String symbol, int factor, AmountOfSubstanceUnits nexSmallerUnit) 
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

	public AmountOfSubstanceUnits getNexSmallerUnit() 
	{
		return nexSmallerUnit;
	}
}
