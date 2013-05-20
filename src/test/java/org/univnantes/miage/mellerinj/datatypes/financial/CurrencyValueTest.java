/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.univnantes.miage.mellerinj.datatypes.financial;

import static junit.framework.Assert.assertEquals;
import junit.framework.TestCase;

/**
 *
 * @author Julien
 */
public class CurrencyValueTest extends TestCase {	
	public CurrencyValueTest(String testName) {
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

	/**
	 * Test of toIsoString method, of class CurrencyValue.
	 */
	public void testToIsoString() throws Exception {
		Currency currency = new Currency("€", "EUR");
		CurrencyValue value = new CurrencyValue(5.12, currency);
		
		assertEquals("EUR 5,120", value.toIsoString());
	}

	/**
	 * Test of toString method, of class CurrencyValue.
	 */
	public void testToString() throws Exception {
		Currency currency = new Currency("€", "EUR");
		currency.setFormat("%2$s %1$.2f");
		CurrencyValue value = new CurrencyValue(5.12, currency);
		
		assertEquals("€ 5,12", value.toString());
	}
}
