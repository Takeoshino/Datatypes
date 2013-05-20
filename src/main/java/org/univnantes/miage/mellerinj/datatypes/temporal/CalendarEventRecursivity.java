package org.univnantes.miage.mellerinj.datatypes.temporal;

import java.util.List;

/**
 * The CalendarEventRecursivity represents the recursivity configuration of a CalendarEventDescriptor
 * @author Julien Mellerin
 */
public class CalendarEventRecursivity {
	private DateTime end;
	
	// @todo To replace with the Duration class once created
	private DateTime interval;
	private CalendarEventDescriptor descriptor;
	
	private List<CalendarEventsDates> eventDates;

	/**
	 * @return DateTime The CalendarEventRecursivity object date of recursivity end
	 */
	public DateTime getEnd() {
		return end;
	}

	/**
	 * Sets the CalendarEventRecursivity object date of recursivity end
	 * @param end 
	 */
	public void setEnd(DateTime end) {
		this.end = end;
	}

	/**
	 * @return DateTime The CalendarEventRecursivity object interval between event occurences
	 */
	public DateTime getInterval() {
		return interval;
	}

	/**
	 * Sets the CalendarEventRecursivity object interval between event occurences
	 * @param interval 
	 */
	public void setInterval(DateTime interval) {
		this.interval = interval;
	}

	/**
	 * @return CalendarEventDescriptor The CalendarEventRecursivity object event descriptor
	 */
	public CalendarEventDescriptor getDescriptor() {
		return descriptor;
	}

	/**
	 * @return List<CalendarEventsDates> Event dates calculated from the event descriptor and recursivity interval
	 */
	public List<CalendarEventsDates> getEventDates() {
		// @todo
		
		return eventDates;
	}

	/**
	 * Sets the CalendarEventRecursivity object event descriptor
	 * @return 
	 */
	public void setEventDates(List<CalendarEventsDates> eventDates) {
		this.eventDates = eventDates;
	}
	
	/**
	 * CalendarEventRecursivity constructor
	 * @param descriptor The CalendarEventDescriptor attached to the CalendarEventRecursivity object
	 */
	public CalendarEventRecursivity(CalendarEventDescriptor descriptor) throws Exception {
		this.descriptor = descriptor;
		
		if (descriptor.getEventDates() == null) {
			throw new Exception("The given CalendarEventDescriptor must have event dates to initialize a recursivity.");
		}
	}
}
