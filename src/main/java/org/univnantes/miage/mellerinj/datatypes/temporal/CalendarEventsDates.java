package org.univnantes.miage.mellerinj.datatypes.temporal;

/**
 * The CalendarEventsDates class stores a repreentation of the calendar situation of an event
 * 
 * @author Julien Mellerin
 */
public class CalendarEventsDates {
	private DateTime startDate;
	private DateTime dueDate;

	/**
	 * @return DateTime The date (or start date) of the CalendarEventsDates object
	 */
	public DateTime getStartDate() {
		return startDate;
	}

	/**
	 * Sets the date (or the start date) of the CalendarEventsDates object
	 * @param date 
	 */
	public void setStartDate(DateTime startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return DateTime The due date of the CalendarEventsDates object
	 */
	public DateTime getDueDate() {
		return dueDate;
	}

	/**
	 * Sets the due date of the CalendarEventsDates object
	 * @param date 
	 */
	public void setDueDate(DateTime dueDate) {
		// @todo Throw an exception if the duedate is prior to the start date
		this.dueDate = dueDate;
	}
	
	/**
	 * Constructs the CalendarEventsDates object
	 * @param startDate 
	 */
	public CalendarEventsDates(DateTime startDate) {
		this.startDate = startDate;
	}
	
	/**
	 * Returns the duration as a DateTime object between the start date and the due date of the event
	 * @return DateTime Returns null if the due date is undefined.
	 */
        @SuppressWarnings("PMD.LawOfDemeter")
	public DateTime getDuration() {
		DateTime result = null;
		
		if (this.getDueDate() != null) {
			result = this.getDueDate().copy();
			result.substract(this.getStartDate());
		}
		
		return result;
	}
}
