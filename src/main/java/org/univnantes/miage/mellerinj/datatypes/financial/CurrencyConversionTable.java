package org.univnantes.miage.mellerinj.datatypes.financial;

import org.univnantes.miage.mellerinj.datatypes.units.AbstractConversionTable;

/**
 * The CurrencyConversionTable class is used to store currencies conversion ratios and to apply them
 * @author Julien Mellerin
 */
public class CurrencyConversionTable extends AbstractConversionTable<Currency> {
	
	/**
	 * CurrencyConversionTable constructor
	 * @param baseUnit
	 * @throws Exception 
	 */
	public CurrencyConversionTable(Currency baseUnit) throws Exception {
		super(baseUnit);
	}
}