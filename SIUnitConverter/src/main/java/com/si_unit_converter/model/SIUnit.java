package com.si_unit_converter.model;

public interface SIUnit 
{
	String getSymbol();
	double toBase(double value);
	double fromBase(double value);
}
