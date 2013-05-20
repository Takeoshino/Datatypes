package org.univnantes.miage.mellerinj.datatypes.temporal;

import static junit.framework.Assert.assertEquals;
import junit.framework.TestCase;

/**
 *
 * @author Julien
 */
public class DateTimeTest extends TestCase {
	
	private DateTime datetime;
	
	public DateTimeTest(String testName) {
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
	
	public void testConstructor() {
		this.datetime = new DateTime(1999, 12, 31, 1, 2, 3);
		assertEquals(1, this.datetime.getHours());
		assertEquals(2, this.datetime.getMinutes());
		assertEquals(3, this.datetime.getSeconds());
	}
	
	public void testNormalize() {
		this.datetime = new DateTime(1999, 12, 31, -36, 67, -43);
		assertEquals(1999, this.datetime.getYear());
		assertEquals(12, this.datetime.getMonth());
		assertEquals(29, this.datetime.getDay());
		assertEquals(13, this.datetime.getHours());
		assertEquals(6, this.datetime.getMinutes());
		assertEquals(17, this.datetime.getSeconds());
	}
	
	public void testAdd() {
		this.datetime = new DateTime(1999, 12, 31, 0, 0, 0);
		this.datetime.add(0, 0, 0, 49, 18, 67);
		
		assertEquals(2000, this.datetime.getYear());
		assertEquals(1, this.datetime.getMonth());
		assertEquals(2, this.datetime.getDay());
		assertEquals(1, this.datetime.getHours());
		assertEquals(19, this.datetime.getMinutes());
		assertEquals(7, this.datetime.getSeconds());
	}
	
	public void testSubstract() {
		this.datetime = new DateTime(2000, 1, 1, 0, 0, 0);
		this.datetime.add(0, 0, 0, -49, -18, -67);
		
		assertEquals(1999, this.datetime.getYear());
		assertEquals(12, this.datetime.getMonth());
		assertEquals(29, this.datetime.getDay());
		assertEquals(22, this.datetime.getHours());
		assertEquals(40, this.datetime.getMinutes());
		assertEquals(53, this.datetime.getSeconds());
	}
}
