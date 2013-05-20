package org.univnantes.miage.mellerinj.datatypes.addresses;

import java.util.List;
import org.univnantes.miage.mellerinj.datatypes.Culture;

/**
 * The Country class provides features to manage countries
 * @author Julien Mellerin
 */
public class Country {
	private List<City> cities;
	private List<Culture> cultures;
	private String name;
	
	private String phoneFormat;
	private String zipCodeFormat;
	private String streetFormat;

	/**
	 * @return List<Culture> The cultures of the country
	 */
	public List<Culture> getCultures() {
		// @todo Verify Coutry/Cities relations
		return cultures;
	}

	/**
	 * Sets the cultures of the country
	 * @param cultures 
	 */
	public void setCultures(List<Culture> cultures) {
		// @todo Remove the country from the previous cultures
		
		this.cultures = cultures;
		
		// @todo Add the country to the cultures
	}

	/**
	 * @return String The country name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the country name
	 * @param name 
	 */
	public void setName(String name) throws Exception {
		// The name can not be empty
		
		if (name == null || name.isEmpty()) {
			throw new Exception("The name can not be empty or null.");
		}
		this.name = name;
	}

	/**
	 * @return List<City> The cities in the country
	 */
	public List<City> getCities() {
		return cities;
	}

	/**
	 * Sets the cities in the country
	 * @param cities 
	 */
	public void setCities(List<City> cities) {
		// @todo Verify Coutry/Cities relations
		this.cities = cities;
	}

	/**
	 * @return String The regular expression used to verify phone numbers in the country
	 */
	public String getPhoneFormat() {
		return phoneFormat;
	}

	/**
	 * Sets the regular expression used to verify phone numbers in the country
	 * @param phoneFormat 
	 */
	public void setPhoneFormat(String phoneFormat) {
		this.phoneFormat = phoneFormat;
	}

	/**
	 * @return String The regular expression used to verify zip codes (or similar)s in the country
	 */
	public String getZipCodeFormat() {
		return zipCodeFormat;
	}

	/**
	 * Sets the regular expression used to verify zip codes (or similar) in the country
	 * @param phoneFormat 
	 */
	public void setZipCodeFormat(String zipCodeFormat) {
		this.zipCodeFormat = zipCodeFormat;
	}

	/**
	 * @return String The regular expression used to verify streets in the country
	 */
	public String getStreetFormat() {
		return streetFormat;
	}

	/**
	 * Sets the regular expression used to verify streets in the country
	 * @param phoneFormat 
	 */
	public void setStreetFormat(String streetFormat) {
		this.streetFormat = streetFormat;
	}
	
	/**
	 * Country constructor
	 * @param name
	 * @param cultures 
	 */
	public Country(String name, List<Culture> cultures) throws Exception {
		this.setName(name);
		this.setCultures(cultures);
	}
}
