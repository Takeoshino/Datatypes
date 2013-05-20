package org.univnantes.miage.mellerinj.datatypes.temporal;

/**
 * The DateTime extends extends the Date class by adding time properties
 *
 * @author Julien Mellerin
 */
public class DateTime extends Date {

	protected int hours;
	protected int minutes;
	protected int seconds;

	/**
	 * @return The hours of the DateTime object
	 */
	public int getHours() {
		return hours;
	}

	/**
	 * Set the hours of the DateTime object
	 *
	 * @param hours
	 */
	public void setHours(int hours) {
		this.hours = hours;
		this.normalize();
	}

	/**
	 * @return The minutes of the DateTime object
	 */
	public int getMinutes() {
		return minutes;
	}

	/**
	 * Set the minutes of the DateTime object
	 *
	 * @param minutes
	 */
	public void setMinutes(int minutes) {
		this.minutes = minutes;
		this.normalize();
	}

	/**
	 * @return The seconds of the DateTime object
	 */
	public int getSeconds() {
		return seconds;
	}

	/**
	 * Set the seconds of the DateTime object
	 *
	 * @param seconds
	 */
	public void setSeconds(int seconds) {
		this.seconds = seconds;
		this.normalize();
	}

	/**
	 * Constructor
	 *
	 * @param year
	 * @param month
	 * @param day
	 * @param hours
	 * @param minutes
	 * @param seconds
	 */
	public DateTime(int year, int month, int day, int hours, int minutes, int seconds) {
		super(year, month, day);
		
		this.hours = hours;
		this.minutes = minutes;
		this.seconds = seconds;
		
		this.normalize();
	}

	/**
	 * Normalize the DateTime (eg. 2013/01/01 24:00:00 will become 2013/01/02
	 * 0:00:00)
	 */
	@Override
	protected void normalize() {
		super.normalize();

		// Normalizes hours
		if (this.hours < 0) {
			this.day = this.getDay() + this.hours / 24 - 1;
			this.hours = this.hours % 24 + 24;
			this.normalize();
		} else if (this.hours > 23) {
			this.day = this.getDay() + this.hours / 24;
			this.hours %= 24;
			this.normalize();
		}

		// Normalizes minutes
		if (this.minutes < 0) {
			this.hours += this.minutes / 60 - 1;
			this.minutes = this.minutes % 60 + 60;
			this.normalize();
		} else if (this.minutes > 59) {
			this.hours += this.minutes / 60;
			this.minutes %= 60;
			this.normalize();
		}

		// Normalizes seconds
		if (this.seconds < 0) {
			this.minutes += this.seconds / 60 - 1;
			this.seconds = this.seconds % 60 + 60;
			this.normalize();
		} else if (this.seconds > 59) {
			this.minutes += this.seconds / 60;
			this.seconds %= 60;
			this.normalize();
		}
	}

	/**
	 * Adds the specified time to the DateTime
	 *
	 * @param years
	 * @param months
	 * @param days
	 * @param hours
	 * @param minutes
	 * @param seconds
	 */
	public void add(int years, int months, int days, int hours, int minutes, int seconds) {
		super.add(years, months, days);

		this.hours += hours;
		this.minutes += minutes;
		this.seconds += seconds;

		this.normalize();
	}

	/**
	 * Adds the specified DateTime to the DateTime object
	 *
	 * @param datetime
	 */
	public void add(DateTime datetime) {
		this.add(datetime.getYear(), datetime.getMonth(), datetime.getDay(), datetime.getHours(), datetime.getMinutes(), datetime.getSeconds());
	}

	/**
	 * Gets a copy of the DateTime object
	 */
	public DateTime copy() {
		return new DateTime(this.getYear(), this.getMonth(), this.getDay(), this.getHours(), this.getMinutes(), this.getSeconds());
	}

	/**
	 * Substracts the specified time from the DateTime object
	 *
	 * @param years
	 * @param months
	 * @param days
	 * @param hours
	 * @param minutes
	 * @param seconds
	 */
	public void substract(int years, int months, int days, int hours, int minutes, int seconds) {
		this.add(-years, -months, -days, -hours, -minutes, -seconds);
	}

	/**
	 * Substracts the specified DateTime from the DateTime object
	 *
	 * @param datetime
	 */
	public void substract(DateTime datetime) {
		this.substract(datetime.getYear(), datetime.getMonth(), datetime.getDay(), datetime.getHours(), datetime.getMinutes(), datetime.getSeconds());
	}
}
