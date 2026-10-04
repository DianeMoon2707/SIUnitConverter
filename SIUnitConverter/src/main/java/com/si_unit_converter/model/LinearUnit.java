package com.si_unit_converter.model;

public interface LinearUnit extends SIUnit
{
	double AMOUNT_OF_DECIMAL_PLACES = 100_000_000.0;
	double getFactor();
	
	@Override
	default	double toBase(double value)
	{
		return Math.round(value * getFactor() * AMOUNT_OF_DECIMAL_PLACES) / AMOUNT_OF_DECIMAL_PLACES;
	}
	
	@Override
	default	double fromBase(double value)
	{
		return Math.round(value / getFactor() * AMOUNT_OF_DECIMAL_PLACES) / AMOUNT_OF_DECIMAL_PLACES;
	}
}
