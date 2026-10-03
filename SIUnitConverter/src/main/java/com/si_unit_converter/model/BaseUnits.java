package com.si_unit_converter.model;

import com.si_unit_converter.model.unit.AmountOfSubstanceUnits;
import com.si_unit_converter.model.unit.ElectricCurrentUnits;
import com.si_unit_converter.model.unit.LengthUnits;
import com.si_unit_converter.model.unit.LuminousIntensityUnits;
import com.si_unit_converter.model.unit.MassUnits;
import com.si_unit_converter.model.unit.TemperaturUnits;
import com.si_unit_converter.model.unit.TimeUnits;

public enum BaseUnits 
{
	LENGTH("Länge", LengthUnits.values()),
	MASS("Masse", MassUnits.values()),
	Time("Zeit", TimeUnits.values()),
	ELECTRIC_CURRENT("Elektrischer Strom", ElectricCurrentUnits.values()),
	THERMODYNAMIC_TEMPERATUR("Thermodynamische Temperatur", TemperaturUnits.values()),
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
}
