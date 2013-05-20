package org.univnantes.miage.mellerinj.datatypes.financial;

import org.univnantes.miage.mellerinj.datatypes.units.UnitValue;

/**
 * The CurrencyValue represent a weight value/unit pair
 * @author Julien Mellerin
 */
public class CurrencyValue extends UnitValue<Currency> {
	
	/**
	 * CurrencyValue constructor
	 * @param value
	 * @param unit
	 * @throws Exception 
	 */
	public CurrencyValue(double value, Currency unit) throws Exception {
		super(value, unit);
	}
	
	/**
	 * @return A string representation of the value using Currency isoCode
	 */
        @SuppressWarnings("PMD.LawOfDemeter")
	public String toIsoString() {
		return String.format("%s %.3f", this.getUnit().getIsoCode(), this.getValue());
	}
}
