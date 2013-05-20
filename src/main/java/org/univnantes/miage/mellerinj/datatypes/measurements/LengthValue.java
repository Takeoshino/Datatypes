package org.univnantes.miage.mellerinj.datatypes.measurements;

import org.univnantes.miage.mellerinj.datatypes.units.UnitValue;

/**
 * The LengthValue represent a length value/unit pair
 * @author Julien Mellerin
 */
public class LengthValue extends UnitValue<LengthUnit> {
	
	/**
	 * LengthValue constructor
	 * @param value
	 * @param unit
	 * @throws Exception 
	 */
	public LengthValue(double value, LengthUnit unit) throws Exception {
		super(value, unit);
	}
}
