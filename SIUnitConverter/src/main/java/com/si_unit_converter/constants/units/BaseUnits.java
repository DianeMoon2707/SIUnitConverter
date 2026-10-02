package com.si_unit_converter.constants.units;

public enum BaseUnits 
{
	LENGTH("Länge"),
	MASS("Masse"),
	Time("Zeit"),
	ELECTRIC_CURRENT("Elektrischer Strom"),
	THERMODYNAMIC_TEMPERATUR("Thermodynamische Temperatur"),
	AMOUNT_OF_SUBSTANCE("Stoffmenge"),
	LUMINOUS_INTENSITY("Lichtstärke");
	
	private String name;
	
	BaseUnits(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
}
