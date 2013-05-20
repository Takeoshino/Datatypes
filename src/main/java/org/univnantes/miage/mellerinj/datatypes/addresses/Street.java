package org.univnantes.miage.mellerinj.datatypes.addresses;

import java.util.List;

/**
 * The Street class provides features to manage cities
 * @author Julien Mellerin
 */
public class Street {
	private String zipCode;
	private String name;
	private City city;
	private List<Address> addresses;

	/**
	 * @return String The street zip code (or similar)
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * Sets the street zip code (or similar)
	 * @param zipCode
	 */
	public void setZipCode(String zipCode) throws Exception {
		// @todo Check the zip code format using this.city.getCountry().getZipCodeFormat() regexp
		
		if (zipCode == null) {
			throw new Exception("The zipCode can not be empty or null");
		}
		
		this.zipCode = zipCode;
	}

	/**
	 * @return String The street name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the street name
	 * @param name 
	 */
	public void setName(String name) throws Exception {
		// @todo Check the zip code format using this.city.getCountry().getStreetFormat() regexp
		
		if (name == null || name.isEmpty()) {
			throw new Exception("The name can not be empty or null");
		}
		
		this.name = name;
	}

	/**
	 * @return City The street city
	 */
	public City getCity() {
		return city;
	}

	/**
	 * Sets the street city
	 * @param city 
	 */
	public void setCity(City city) throws Exception {
		if (city == null) {
			throw new Exception("The city can not be empty or null");
		}
		
		// @todo If the city change, remove the street from the previous city and add it to the new one
		
		this.city = city;
	}

	/**
	 * @return List<Address> The street addresses
	 */
	public List<Address> getAddresses() {
		return addresses;
	}

	/**
	 * Sets the street addresses
	 * @param addresses 
	 */
	public void setAddresses(List<Address> addresses) {
		// @todo Previous adresses are no longer linked to the city and new ones are
		this.addresses = addresses;
	}
	
	/**
	 * Constructs a Street object
	 * @param name
	 * @param zipCode
	 * @param city 
	 */
	public Street(String name, String zipCode, City city) throws Exception {
		this.setName(name);
		this.setZipCode(zipCode);
		this.setCity(city);
	}
}
