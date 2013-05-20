package org.univnantes.miage.mellerinj.datatypes.temporal;

/**
 * The Date class represents a calendar date
 *
 * @author Julien Mellerin
 */
@SuppressWarnings("PMD.ShortClassName")
public class Date {

	/* Properties */
	protected int day;
	protected int month;
	protected int year;

	/**
	 * @return int The day of the Date object
	 */
	public int getDay() {
		return day;
	}

	/**
	 * Sets the day of the Date object
	 *
	 * @param day
	 */
	public void setDay(int day) {
		this.day = day;
		this.normalize();
	}

	/**
	 * @return int The month of the Date object
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * Sets the month of the Date object
	 *
	 * @param month
	 */
	public void setMonth(int month) {
		this.month = month;
		this.normalize();
	}

	/**
	 * @return int The year of the Date object
	 */
	public int getYear() {
		return year;
	}

	/**
	 * Sets the year of the Date object
	 *
	 * @param year
	 */
	public void setYear(int year) {
		this.year = year;
		this.normalize();
	}

	/**
	 * Constructs a Date
	 */
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;

		this.normalize();
	}

	/**
	 * Normalizes the date (eg. 2012/12/33 is converted to 2013/01/02)
	 */
	protected void normalize() {		
		// Normalizes the date month
		if (this.month < 1)  {
			this.year = this.year + this.month / 12 - 1;
			this.month = 12 + this.month % 12;
		}
		else if (this.month > 12) {
			this.year += this.month / 12;
			this.month %= 12;
		}
		
		// Normalizes the date day
		if (this.day < 1) {
			this.month--;
			this.day += this.getDaysInMonths();
			this.normalize();
		}
		else if (this.day > this.getDaysInMonths()) {
			this.day -= this.getDaysInMonths();
			this.month++;
			this.normalize();
		}
	}

	/**
	 * @return integer The number of days in the date month
	 */
	public int getDaysInMonths() {
		int result = 31;

		if (this.month == 2) {
			result = this.isYearLeap() ? 29 : 28;
		} else if (this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11) {
			result = 30;
		}

		return result;
	}

	/**
	 * @return boolean True if the year is leap
	 */
	public boolean isYearLeap() {
                boolean rule1 = this.year % 4 == 0 && this.year % 100 != 0;
		return rule1 || this.year % 400 == 0;
	}

	/**
	 * Adds some time to the date
	 *
	 * @param years
	 * @param months
	 * @param days
	 */
	public void add(int years, int months, int days) {
		this.year += years;
		this.month += months;
		this.day += days;

		this.normalize();
	}

	/**
	 * Adds the specified Date to the Date
	 */
	public void add(Date date) {
		this.add(date.getYear(), date.getMonth(), date.getDay());
	}

	/**
	 * Substracts some time to the date
	 *
	 * @param years
	 * @param months
	 * @param days
	 */
	public void substract(int years, int months, int days) {
		this.add(-years, -months, -days);
	}

	/**
	 * Substract the specified Date to the Date
	 */
	public void substract(Date date) {
		this.substract(date.getYear(), this.getMonth(), this.getDay());
	}
}
