/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.univnantes.miage.mellerinj.datatypes.financial;

import static junit.framework.Assert.assertEquals;
import junit.framework.TestCase;
import org.univnantes.miage.mellerinj.datatypes.units.UnitValue;

/**
 *
 * @author Julien
 */
public class CurrencyConversionTableTest extends TestCase {
	
	public CurrencyConversionTableTest(String testName) {
		super(testName);
	}
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}
	
	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testConvert() throws Exception {
		Currency dollarCurrency = new Currency("$", "USD");
		Currency euroCurrency = new Currency("€", "EUR");
		Currency livreCurrency = new Currency("£", "GBP");
		
		CurrencyConversionTable conversionTable = new CurrencyConversionTable(dollarCurrency);
		
		// Adds a baseUnit based ratio
		conversionTable.addUnit(euroCurrency, new CurrencyValue(1.30506, dollarCurrency));
		
		// Simple conversion
		CurrencyValue euroValue = new CurrencyValue(2, euroCurrency);
		assertEquals(2.61012, conversionTable.convert(euroValue, dollarCurrency).getValue());
		
		// Adds a ratio whom its unit is not in the conversion table
		try {
			conversionTable.addUnit(new Currency("x", "xyz"), new UnitValue<Currency>(1, new Currency("a", "abc")));
			fail("The unknown unit exception have not occur");
		}
		catch (Exception e) {}
		
		// Adds a ratio not based on the conversion table baseUnit
		conversionTable.addUnit(livreCurrency, new CurrencyValue(1.16708, euroCurrency));
		assertTrue(Math.abs(conversionTable.convert(euroValue, livreCurrency).getValue() - 1.71369) < 0.001);
	}
}
