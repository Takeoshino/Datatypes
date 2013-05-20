package org.univnantes.miage.mellerinj.datatypes.temporal;

import java.util.List;
import org.univnantes.miage.mellerinj.datatypes.addresses.Address;
import org.univnantes.miage.mellerinj.datatypes.resources.Person;

/**
 * The CalendarEventDescriptor class represents a calendar event description attached to a CalendarEventDates object mainly.
 * @author Julien Mellerin
 */
public class CalendarEventDescriptor {
	private String title;
	private String comment;
	private int priority;
	private CalendarEventsDates eventDates;
	private CalendarEventRecursivity recursivity;
	private Address location;
	
	private List<Person> participants;

	/**
	 * @return String The CalendarEventDescriptor object title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the CalendarEventDescriptor object title
	 * @param title 
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return String The CalendarEventDescriptor object comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * Sets the CalendarEventDescriptor object comment
	 * @param comment 
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
	 * @return String The CalendarEventDescriptor object priority
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * Sets the CalendarEventDescriptor object priority
	 * @param priority 
	 */
	public void setPriority(int priority) {
		this.priority = priority;
	}

	/**
	 * @return CalendarEventsDates The CalendarEventDescriptor object event dates
	 */
	public CalendarEventsDates getEventDates() {
		return eventDates;
	}

	/**
	 * Sets the CalendarEventDescriptor object event dates
	 * @param eventDates 
	 */
	public void setEventDates(CalendarEventsDates eventDates) {
		this.eventDates = eventDates;
	}

	/**
	 * @return List<Person> The CalendarEventDescriptor object participants
	 */
	public List<Person> getParticipants() {
		return participants;
	}

	/**
	 * Sets the CalendarEventDescriptor object participants
	 * @param participants 
	 */
	public void setParticipants(List<Person> participants) {
		this.participants = participants;
	}

	/**
	 * @return CalendarEventRecursivity The CalendarEventDescriptor object recursivity
	 */
	public CalendarEventRecursivity getRecursivity() {
		return recursivity;
	}

	/**
	 * Sets the CalendarEventDescriptor object recursivity
	 * @param recursivity 
	 */
	public void setRecursivity(CalendarEventRecursivity recursivity) {
		this.recursivity = recursivity;
	}

	/**
	 * @return Address The CalendarEventDescriptor object location
	 */
	public Address getLocation() {
		return location;
	}

	/**
	 * Sets the CalendarEventDescriptor object location
	 * @param location 
	 */
	public void setLocation(Address location) {
		// @todo If the location change, remove the event from the previous location and add it to the new one
		this.location = location;
	}
	
	/**
	 * CalendarEventDescriptor constructor
	 */
	public CalendarEventDescriptor() {
	}
}
