package com.si_unit_converter.service;

import org.springframework.stereotype.Service;

import com.si_unit_converter.model.BaseUnits;
import com.si_unit_converter.model.SIUnit;

@Service
public class UnitConverterService 
{
	public double convertUnits(BaseUnits baseUnit, double input, String unitSourceStr, String unitTargetStr)
	{
		SIUnit[] units = baseUnit.getUnits();
		
		int unitSourceIndex = SIUnit.getIndexOfSIUnitArray(units, unitSourceStr);
		int unitTargetIndex = SIUnit.getIndexOfSIUnitArray(units, unitTargetStr);
		
		SIUnit unitSource = units[unitSourceIndex];
		SIUnit unitTarget = units[unitTargetIndex];
		
		if(unitSourceIndex != unitTargetIndex)
		{
			double midResult = unitSource.toBase(input);
			return unitTarget.fromBase(midResult);
		}
		else
		{
			return input;
		}
	}
}
