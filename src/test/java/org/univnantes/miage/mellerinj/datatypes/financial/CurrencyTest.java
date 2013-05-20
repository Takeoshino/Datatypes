package org.univnantes.miage.mellerinj.datatypes.financial;

import static junit.framework.Assert.assertEquals;
import junit.framework.TestCase;

/**
 * @author Julien Mellerin
 */
public class CurrencyTest extends TestCase {
	private Currency currency;
	
	public CurrencyTest(String testName) {
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
	 * Test of getFormat method, of class Currency.
	 */
	public void testGetFormat() throws Exception {
		this.currency = new Currency("€", "EUR");
		assertEquals(Currency.DEFAULT_FORMAT, this.currency.getFormat());
		
		this.currency.setFormat("%2$s %1$d");
		assertEquals("%2$s %1$d", this.currency.getFormat());
		
		this.currency.setFormat(null);
		assertEquals(Currency.DEFAULT_FORMAT, this.currency.getFormat());
	}
}
