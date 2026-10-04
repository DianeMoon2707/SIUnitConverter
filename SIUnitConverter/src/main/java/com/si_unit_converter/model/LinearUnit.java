package com.si_unit_converter.model;

public interface LinearUnit extends SIUnit
{
	double getFactor();
	
	@Override
	default	double toBase(double value)
	{
		return Math.round(value * getFactor()* 100_000_000.0) / 100_000_000.0;
	}
	
	@Override
	default	double fromBase(double value)
	{
		return Math.round(value / getFactor()* 100_000_000.0) / 100_000_000.0;
	}
}
