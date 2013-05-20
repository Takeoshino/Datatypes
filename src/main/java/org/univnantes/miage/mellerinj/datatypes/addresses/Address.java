package org.univnantes.miage.mellerinj.datatypes.addresses;

import java.util.List;
import org.univnantes.miage.mellerinj.datatypes.resources.Person;

/**
 * The Address class provides features to manage countries
 * @author Julien Mellerin
 */
public class Address {
	private String number;
	private String door;
	private String houseName;
	private String complement;
	private AddressTypeEnum addressType;
	private Street street;
	
	private List<Inhabitant> inhabitants;
	private List<PhoneNumber> phoneNumbers;

	/**
	 * @return String The Address number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * Sets the Address number
	 * @param number 
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * @return String The Address door
	 */
	public String getDoor() {
		return door;
	}

	/**
	 * @param door Sets the Address door
	 */
	public void setDoor(String door) {
		this.door = door;
	}

	/**
	 * @return String The Address house name
	 */
	public String getHouseName() {
		return houseName;
	}

	/**
	 * Sets Address the house name
	 * @param houseName 
	 */
	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}

	/**
	 * @return String The Address complement
	 */
	public String getComplement() {
		return complement;
	}

	/**
	 * Sets the Address complement
	 * @param complement
	 */
	public void setComplement(String complement) {
		this.complement = complement;
	}

	/**
	 * @return The Address type
	 */
	public AddressTypeEnum getAddressType() {
		return addressType;
	}

	/**
	 * Sets the Address type
	 * @param addressType 
	 */
	public void setAddressType(AddressTypeEnum addressType) {
		this.addressType = addressType;
	}

	/**
	 * @return List<PhoneNumber> The Address phone numbers
	 */
	public List<PhoneNumber> getPhoneNumbers() {
		return phoneNumbers;
	}

	/**
	 * Sets the address phone numbers
	 * @param phoneNumbers 
	 */
	public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
		// @todo Check that all the phone numbers are linked back to the address
		this.phoneNumbers = phoneNumbers;
	}

	/**
	 * @return Street The address street
	 */
	public Street getStreet() {
		return street;
	}

	/**
	 * Sets the address street
	 * @param street 
	 */
	public void setStreet(Street street) throws Exception {
		// @todo If the street changed, remove the address from the previous street and add it to the new one
		
		// The street is mandatory
		if (street == null) {
			throw new Exception("The street can not be null");
		}
		this.street = street;
	}

	/**
	 * @return List<Inhabitant> The address inhabitants
	 */
	public List<Inhabitant> getInhabitants() {
		return inhabitants;
	}

	/**
	 * Sets the address inhabitants
	 * @param inhabitants 
	 */
	public void setInhabitants(List<Inhabitant> inhabitants) {
		// @todo Check that all inhabitants are linked back to the address
		this.inhabitants = inhabitants;
	}
	
	/**
	 * Address object constructor
	 * @param street
	 * @throws Exception 
	 */
	public Address(Street street) throws Exception {
		this.setStreet(street);
	}
	
	/**
	 * @param person
	 * @return boolean True if the specified Person object is in the Address object inhabitant list
	 */
        @SuppressWarnings("PMD.LawOfDemeter")
	public boolean hasInhabitant(Person person) {
		boolean result = false;
		
		if (this.getInhabitants() != null) {
			for (Inhabitant inhabitant : this.getInhabitants()) {
				if (inhabitant.hasPerson(person)) {
					result = true;
					break;
				}
			}
		}
		
		return result;
	}
}
