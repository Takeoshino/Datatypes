package org.univnantes.miage.mellerinj.datatypes.resources;

import java.util.List;
import org.univnantes.miage.mellerinj.datatypes.addresses.Inhabitant;
import org.univnantes.miage.mellerinj.datatypes.addresses.PhoneNumber;
import org.univnantes.miage.mellerinj.datatypes.temporal.Date;

/**
 * The Person class provides features to manage inhabitants
 * @author julien
 */
public class Person {
	private String firstName;
	private String lastName;
	private Date birthDate;
	
	private List<PhoneNumber> phoneNumbers;
	private List<Inhabitant> addresses;

	/**
	 * @return String The Person object firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Sets the Person object firstName
	 * @param firstName 
	 */
	public void setFirstName(String firstName) throws Exception {
		if (firstName == null || firstName.isEmpty()) {
			throw new Exception("The Person object firstName can not be empty or null");
		}
		
		this.firstName = firstName;
	}

	/**
	 * @return String The Person object lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Sets the Person object lastName
	 * @param firstName 
	 */
	public void setLastName(String lastName) throws Exception {
		if (lastName == null || lastName.isEmpty()) {
			throw new Exception("The Person object lastName can not be empty or null");
		}
		
		this.lastName = lastName;
	}

	/**
	 * @return String The Person object birthDate
	 */
	public Date getBirthDate() {
		return birthDate;
	}

	/**
	 * Sets the Person object birthDate
	 * @param firstName 
	 */
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	/**
	 * @return List<PhoneNumber> The Person object phoneNumbers
	 */
	public List<PhoneNumber> getPhoneNumbers() {
		return phoneNumbers;
	}

	/**
	 * Sets the Person objects phoneNumbers
	 * @param phoneNumbers 
	 * @throws Exception
	 */
	public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) throws Exception {
		this.phoneNumbers = phoneNumbers;
		
		// Sets the phone numbers owner
		if (this.phoneNumbers != null) {
			for (PhoneNumber phoneNumber : this.phoneNumbers) {
				phoneNumber.setOwner(this);
			}
		}
	}

	/**
	 * @return List<PhoneNumber> The Person object addresses
	 */
	public List<Inhabitant> getAddresses() {
		return addresses;
	}

	/**
	 * Sets the Person objects addresses
	 * @param phoneNumbers 
	 */
        @SuppressWarnings("PMD.LawOfDemeter")
	public void setAddresses(List<Inhabitant> addresses) throws Exception {
		// Checks that relations link the person
		if (addresses != null) {
			for (Inhabitant inhabitant : addresses) {
				if (inhabitant.getPerson() != this) {
					throw new Exception("The Person object addresses must link the Person object itself.");
				}
			}
		}
		this.addresses = addresses;
	}
	
	/**
	 * Person constructor
	 * 
	 * @param firstName
	 * @param lastName
	 * @throws Exception 
	 */
	public Person(String firstName, String lastName) throws Exception {
		this.setFirstName(firstName);
		this.setLastName(lastName);
	}
}
