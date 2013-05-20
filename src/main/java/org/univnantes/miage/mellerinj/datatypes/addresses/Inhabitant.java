package org.univnantes.miage.mellerinj.datatypes.addresses;

import org.univnantes.miage.mellerinj.datatypes.resources.Person;

/**
 * The Country class provides features to manage inhabitants
 * @author Julien Mellerin
 */
public class Inhabitant {
	private InhabitantTypeEnum inhabitantType;
	private Person person;
	private Address address;

	/**
	 * @return InhabitantTypeEnum The Inhabitant object type (eg. worker, resident...)
	 */
	public InhabitantTypeEnum getInhabitantType() {
		return inhabitantType;
	}

	/**
	 * Sets the Inhabitant object type (eg. worker, resident...)
	 * @param inhabitantType 
	 */
	public void setInhabitantType(InhabitantTypeEnum inhabitantType) {
		this.inhabitantType = inhabitantType;
	}

	/**
	 * @return Person The Inhabitant object person
	 */
	public Person getPerson() {
		return person;
	}
        
        public Boolean hasPerson(Person person) {
            return this.person == person;
        }

	/**
	 * Sets the Inhabitant object person
	 * @param person 
	 */
	public void setPerson(Person person) throws Exception {
		// @todo The previous person is unlinked from the inhabitant
		
		// @todo The new person linked to the inhabitant
		
		// The person can not be null
		if (person == null) {
			throw new Exception("The person can not be null");
		}
		
		this.person = person;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) throws Exception {
		// @todo The previous address is unlinked from the inhabitant
		
		// @todo The new address linked to the inhabitant
		
		// The person can not be null
		if (address == null) {
			throw new Exception("The address can not be null");
		}
		
		this.address = address;
	}
	
	public Inhabitant(Person person, Address address) throws Exception {
		this.setPerson(person);
		this.setAddress(address);
	}
	
	
}
