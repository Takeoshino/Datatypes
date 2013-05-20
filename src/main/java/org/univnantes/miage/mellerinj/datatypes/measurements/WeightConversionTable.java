package org.univnantes.miage.mellerinj.datatypes.measurements;

import org.univnantes.miage.mellerinj.datatypes.units.AbstractConversionTable;

/**
 * The WeightConversionTable class is used to store weight conversion ratios and to apply them
 * @author Julien Mellerin
 */
public class WeightConversionTable extends AbstractConversionTable<WeightUnit> {
	
	/**
	 * WeightConversionTable constructor
	 * @param baseUnit
	 * @throws Exception 
	 */
	public WeightConversionTable(WeightUnit baseUnit) throws Exception {
		super(baseUnit);
	}
}