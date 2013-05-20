package org.univnantes.miage.mellerinj.datatypes.addresses;

import org.univnantes.miage.mellerinj.datatypes.resources.Person;

/**
 * The PhoneNumber class provides features to manage inhabitants
 * @author Julien Mellerin
 */
public class PhoneNumber {
	private Address address;
	private Country country;
	private String number;
	private PhoneNumberTypeEnum phoneNumberType;
	private Person owner;

	/**
	 * @return Address The PhoneNumber object address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * Sets the PhoneNumber object address
	 * @param address
	 */
        @SuppressWarnings("PMD.LawOfDemeter")
	public void setAddress(Address address) {
		// The PhoneNumber object address country equals the country
		if (address != null) {
			this.country = address.getStreet().getCity().getCountry();
		}
		
		this.address = address;
	}

	/**
	 * @return Country The PhoneNumber object country 
	 */
	public Country getCountry() {
		return country;
	}

	/**
	 * Sets the PhoneNumber object country
	 * @param country
	 * @throws Exception 
	 */
	public void setCountry(Country country) throws Exception {
		if (country == null) {
			throw new Exception("The PhoneNumber object country can not be null");
		}
		
		this.country = country;
	}

	/**
	 * @return String The PhoneNumber object number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * Sets the PhoneNumber object number
	 * @param number 
	 * @throws Exception 
	 */
	public void setNumber(String number) throws Exception {
		if (number == null || number.isEmpty()) {
			throw new Exception("The PhoneNumber number can not be null or empty.");
		}
		this.number = number;
	}

	/**
	 * @return PhoneNumberTypeEnum  The PhoneNumber object type
	 */
	public PhoneNumberTypeEnum getPhoneNumberType() {
		return phoneNumberType;
	}

	/**
	 * Sets the PhoneNumber object type
	 * @param phoneNumberType 
	 */
	public void setPhoneNumberType(PhoneNumberTypeEnum phoneNumberType) {
		this.phoneNumberType = phoneNumberType;
	}

	/**
	 * @return Person The PhoneNumber object owner
	 */
	public Person getOwner() {
		return owner;
	}

	/**
	 * Sets the PhoneNumber object owner
	 * @param owner 
	 * @throws Exception
	 */
	public void setOwner(Person owner) throws Exception {
		// The owner is an inhabitant of the address
		if (this.address != null && owner != null && !this.address.hasInhabitant(owner)) {
			throw new Exception("The PhoneNumber object owner must be an inhabitant of the address.");
		}
		
		this.owner = owner;
	}
	
	/**
	 * PhoneNumber constructor
	 * @param number
	 * @param country
	 * @throws Exception
	 */
	public PhoneNumber(String number, Country country) throws Exception {
		this.setNumber(number);
		this.setCountry(country);
	}
}
