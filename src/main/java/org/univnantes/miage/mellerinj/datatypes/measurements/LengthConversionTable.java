package org.univnantes.miage.mellerinj.datatypes.measurements;

import org.univnantes.miage.mellerinj.datatypes.units.AbstractConversionTable;

/**
 * The LengthConversionTable class is used to store length conversion ratios and to apply them
 * @author Julien Mellerin
 */
public class LengthConversionTable extends AbstractConversionTable<LengthUnit> {
	
	/**
	 * LengthConversionTable constructor
	 * @param baseUnit
	 * @throws Exception 
	 */
	public LengthConversionTable(LengthUnit baseUnit) throws Exception {
		super(baseUnit);
	}
}
