package org.univnantes.miage.mellerinj.datatypes.measurements;

import org.univnantes.miage.mellerinj.datatypes.units.AbstractUnit;

/**
 * The WeightUnit class is used to represent a weight unit to use with a WeightConversionTable
 * @author Julien Mellerin
 */
public class WeightUnit extends AbstractUnit {
	
	/**
	 * WeightUnit constructor
	 * @param symbol
	 * @throws Exception
	 */
	public WeightUnit(String symbol) throws Exception {
		super(symbol);
	}
}
