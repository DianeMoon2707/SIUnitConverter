package com.si_unit_converter.model;

//Interface for a categorie of SI base units with conversion functionality
public interface SIUnit 
{
	String getSymbol();
	double toBase(double value);
	double fromBase(double value);
	
	//Searches for the index of a unit with the given symbol
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
