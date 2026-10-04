package com.si_unit_converter.model;

import java.util.List;
import java.util.stream.*;

import com.si_unit_converter.model.unit.*;

public enum BaseUnits 
{
	LENGTH("Länge", LengthUnits.values()),
	MASS("Masse", MassUnits.values()),
	TIME("Zeit", TimeUnits.values()),
	ELECTRIC_CURRENT("Elektrischer Strom", ElectricCurrentUnits.values()),
	TEMPERATUR("Temperatur", TemperaturUnits.values()),
	AMOUNT_OF_SUBSTANCE("Stoffmenge", AmountOfSubstanceUnits.values()),
	LUMINOUS_INTENSITY("Lichtstärke", LuminousIntensityUnits.values());
	
	private String name;
	private SIUnit[] units;
	
	BaseUnits(String name, SIUnit[] units)
	{
		this.name = name;
		this.units = units;
	}
	
	public String getName()
	{
		return name;
	}
	
	public SIUnit[] getUnits()
	{
		return units;
	}
	
	public static int searchSIUnit(BaseUnits[] units, BaseUnits searchedBaseUnit)
	{		
		for(int i = 0; i < units.length; i++)
		{
			if(units[i] == searchedBaseUnit)
			{
				return i;
			}
		}
		
		return 0;
	}
	
	public static List<String> getSymbolList(BaseUnits baseUnit)
	{
		return Stream.of(baseUnit.getUnits())
				.map(SIUnit::getSymbol)
				.collect(Collectors.toList());
	}
}
