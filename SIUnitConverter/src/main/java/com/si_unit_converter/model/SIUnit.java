package com.si_unit_converter.model;

public interface SIUnit 
{
	String getSymbol();
	double toBase(double value);
	double fromBase(double value);
	
	public static SIUnit valueOfSymbol(SIUnit[] units, String symbol)
	{	
		int index = SIUnit.getIndexOfSIUnitArray(units, symbol);
		return units[index];
	}
	
	public static int getIndexOfSIUnitArray(SIUnit[] units, String symbol)
	{	
		for(int i = 0; i < units.length; i++)
		{
			if(symbol.equals(units[i].getSymbol()))
			{
				return i;
			}
		}
		
		throw new NullPointerException("Einheit nicht gefunden!");
	}
}
