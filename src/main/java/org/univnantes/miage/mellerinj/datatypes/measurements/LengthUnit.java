package org.univnantes.miage.mellerinj.datatypes.measurements;

import org.univnantes.miage.mellerinj.datatypes.units.AbstractUnit;

/**
 * The LengthUnit class is used to represent a length unit to use with a LengthConversionTable
 * @author Julien Mellerin
 */
public class LengthUnit extends AbstractUnit {
	
	/**
	 * LengthUnit constructor
	 * @param symbol
	 * @throws Exception
	 */
	public LengthUnit(String symbol) throws Exception {
		super(symbol);
	}
}
