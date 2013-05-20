package org.univnantes.miage.mellerinj.datatypes.measurements;

import org.univnantes.miage.mellerinj.datatypes.units.UnitValue;

/**
 * The WeightValue represent a weight value/unit pair
 * @author Julien Mellerin
 */
public class WeightValue extends UnitValue<WeightUnit> {
	
	/**
	 * WeightValue constructor
	 * @param value
	 * @param unit
	 * @throws Exception 
	 */
	public WeightValue(double value, WeightUnit unit) throws Exception {
		super(value, unit);
	}
}
