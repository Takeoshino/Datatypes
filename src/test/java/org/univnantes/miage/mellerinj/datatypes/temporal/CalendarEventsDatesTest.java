/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.univnantes.miage.mellerinj.datatypes.temporal;

import junit.framework.TestCase;

/**
 *
 * @author Julien
 */
public class CalendarEventsDatesTest extends TestCase {
	
	public CalendarEventsDatesTest(String testName) {
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
	
	public void testGetDuration() {
		CalendarEventsDates eventDates = new CalendarEventsDates(
			new DateTime(2000, 03, 14, 5, 0, 0)
		);

		// No due date, duration = 0
		assertNull(eventDates.getDuration());
		
		// Due date specified
		// @tofix Do not use the DateTime class to calculate a duration as months and days can't be 0
		/*
		eventDates.setDueDate(
			new DateTime(2000, 03, 15, 6, 30, 0)
		);
		assertEquals(0, eventDates.getDuration().getYear());
		assertEquals(0, eventDates.getDuration().getMonth());
		assertEquals(1, eventDates.getDuration().getDay());
		assertEquals(1, eventDates.getDuration().getHours());
		assertEquals(30, eventDates.getDuration().getMinutes());
		assertEquals(0, eventDates.getDuration().getSeconds());
		*/
	}
	
	public void testSetDueDate() {
		// @todo An exception occurs if the duedate is prior to start date
	}
}
