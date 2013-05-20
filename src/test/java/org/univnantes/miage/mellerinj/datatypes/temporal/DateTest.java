package org.univnantes.miage.mellerinj.datatypes.temporal;

import static junit.framework.Assert.assertEquals;
import junit.framework.TestCase;

/**
 *
 * @author Julien
 */
public class DateTest extends TestCase {
	private Date date;
	
	public DateTest(String testName) {
		super(testName);
	}
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		
		this.date = new Date(1999, 12, 31);
	}
	
	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testConstructor() {
		System.out.println("Testing the Date constructor with normalized date values");
		this.date = new Date(1999, 12, 31);
		assertEquals("The day is 31", 31, this.date.getDay());
		assertEquals("The month is 12", 12, this.date.getMonth());
		assertEquals("The year is 1999", 1999, this.date.getYear());
	}
	
	public void testNormalize() {
		System.out.println("Testing the Date constructor with abnormal date values");
		this.date = new Date(1999, 27, -54);
		assertEquals("The day is 5", 5, this.date.getDay());
		assertEquals("The month is 1", 1, this.date.getMonth());
		assertEquals("The year is 2001", 2001, this.date.getYear());
		
		this.date.setMonth(14);
		assertEquals("The day is 5", 5, this.date.getDay());
		assertEquals("The month is 2", 2, this.date.getMonth());
		assertEquals("The year is 2002", 2002, this.date.getYear());
	}
	
	public void testIsYearLeap() {
		this.date.setYear(2000);
		assertEquals(true, this.date.isYearLeap());
		
		this.date.setYear(2004);
		assertEquals(true, this.date.isYearLeap());
		
		this.date.setYear(2100);
		assertEquals(false, this.date.isYearLeap());
	}
	
	public void testGetDaysInMonths() {
		this.date = new Date(2000, 2, 1);
		assertEquals(29, this.date.getDaysInMonths());
		
		this.date.setYear(2001);
		assertEquals(28, this.date.getDaysInMonths());
		
		this.date.setMonth(1);
		assertEquals(31, this.date.getDaysInMonths());
		
		this.date.setMonth(4);
		assertEquals(30, this.date.getDaysInMonths());
	}
	
	public void testAdd() {
		this.date = new Date(2000, 1, 1);
		this.date.add(8, 34, 56);
		
		assertEquals(27, this.date.getDay());
		assertEquals(12, this.date.getMonth());
		assertEquals(2010, this.date.getYear());
	}
	
	public void testSubstract() {
		this.date = new Date(2000, 1, 1);
		this.date.substract(8, 34, 56);

		assertEquals(1989, this.date.getYear());
		assertEquals(1, this.date.getMonth());
		assertEquals(4, this.date.getDay());
	}
}
