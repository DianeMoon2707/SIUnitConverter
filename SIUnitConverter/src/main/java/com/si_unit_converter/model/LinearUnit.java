package com.si_unit_converter.model;

public interface LinearUnit extends SIUnit
{
	double getFactor();
	
	@Override
	default	double toBase(double value)
	{
		return value * getFactor();
	}
	
	@Override
	default	double fromBase(double value)
	{
		return value / getFactor();
	}
}
