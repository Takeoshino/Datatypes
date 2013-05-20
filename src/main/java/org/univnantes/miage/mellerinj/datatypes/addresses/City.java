package org.univnantes.miage.mellerinj.datatypes.addresses;

import java.util.List;

/**
 * The City class provides features to manage cities
 * @author Julien Mellerin
 */
@SuppressWarnings("PMD.ShortClassName")
public class City {
	private Country country;
	private String name;
	private List<Street> streets;

	/**
	 * @return Country The Country of the City object
	 */
	public Country getCountry() {
		return country;
	}

	/**
	 * Sets the Country of the City object
	 * @param country 
	 */
	public void setCountry(Country country) {
		// @todo If the country change, remove the city from the country city list and add it to the new one
		
		this.country = country;
	}

	/**
	 * @return String The City name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the City name
	 * @param name 
	 */
	public void setName(String name) throws Exception {
		
		if (name == null || name.isEmpty()) {
			throw new Exception("The name can not be empty or null.");
		}
		
		this.name = name;
	}

	/**
	 * @return List<Street> The City streets
	 */
	public List<Street> getStreets() {
		return streets;
	}

	/**
	 * Sets the City streets
	 * @param streets 
	 */
	public void setStreets(List<Street> streets) {
		// @todo Check that all street are linked back to the city
		this.streets = streets;
	}
	
	/**
	 * City contructor
	 * @param name
	 * @param country 
	 */
	public City(String name, Country country) throws Exception {
		this.setName(name);
		this.country = country;
		
		// @todo Add the object to the country cities if not in it
	}
}
