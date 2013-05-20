/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.univnantes.miage.mellerinj.datatypes.addresses;

import java.util.ArrayList;
import static junit.framework.Assert.fail;
import junit.framework.TestCase;
import org.univnantes.miage.mellerinj.datatypes.Culture;

/**
 *
 * @author Julien
 */
public class CountryTest extends TestCase {
	
	public CountryTest(String testName) {
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
	
	public void testSetName() {
		Country country = null;
		
		try {
			country = new Country("test", new ArrayList<Culture>());
		}
		catch (Exception e) {
			fail(e.getMessage());
		}
		
		assertEquals("test", country.getName());
		
		try {
			country.setName(null);
			fail("The exception didn't occur.");
		}
		catch (Exception e) { }
		
		try {
			country.setName("");
			fail("The exception didn't occur.");
		}
		catch (Exception e) { }
	}
}
