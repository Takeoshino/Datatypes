package org.univnantes.miage.mellerinj.datatypes.financial;

import org.univnantes.miage.mellerinj.datatypes.units.AbstractUnit;

/**
 * The CurrencyUnit class is used to represent a currency to use with a CurrencyConversionTable
 * @author Julien Mellerin
 */
public class Currency extends AbstractUnit {
	private String isoCode;
	
	/**
	 * @return String The Currency object isoCode (ISO 4217)
	 */
	public String getIsoCode() {
		return this.isoCode;
	}
	
	/**
	 * CurrencyUnit constructor
	 * @param symbol
	 * @param isoCode (ISO 4217)
	 * @throws Exception
	 */
	public Currency(String symbol, String isoCode) throws Exception {
		super(symbol);
		
		this.isoCode = isoCode;
	}
}
