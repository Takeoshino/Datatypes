package org.univnantes.miage.mellerinj.datatypes;

import java.util.List;
import org.univnantes.miage.mellerinj.datatypes.addresses.Country;
import org.univnantes.miage.mellerinj.datatypes.units.AbstractUnit;

/**
 * The Culture class provides informations on cultures. They are based on ISO format culture codes
 * @author Julien Mellerin
 */
public class Culture {
	private String name;
	private String displayName;
	private String isoCode;
	private List<Country> countries;
	private List<AbstractUnit> units;

	/**
	 * @return String The Culture name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the Culture name
	 * @param name 
	 */
	public void setName(String name) throws Exception {
		if (name == null || name.isEmpty()) {
			throw new Exception("The name can not be null or empty.");
		}
		
		this.name = name;
	}

	/**
	 * @return String The Culture display name
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * Sets the Culture display name
	 * @param displayName 
	 */
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	/**
	 * @return String The Culture ISO code
	 */
	public String getIsoCode() {
		return isoCode;
	}

	/**
	 * Sets the Culture ISO code
	 * @param isoCode 
	 */
	public void setIsoCode(String isoCode) throws Exception  {
		if (isoCode == null || isoCode.isEmpty()) {
			throw new Exception("The isoCode can not be null or empty.");
		}
		
		this.isoCode = isoCode;
	}

	/**
	 * @return List<Country> The Culture countries
	 */
	public List<Country> getCountries() {
		return countries;
	}

	/**
	 * Sets the Culture countries
	 * @param countries 
	 */
	public void setCountries(List<Country> countries) {
		this.countries = countries;
	}

	/**
	 * @return List<Unit> The Culture units
	 */
	public List<AbstractUnit> getUnits() {
		return units;
	}

	/**
	 * Sets the Culture units
	 * @param units 
	 */
	public void setUnits(List<AbstractUnit> units) {
		this.units = units;
	}
	
	/**
	 * Culture constructor
	 * 
	 * @param name
	 * @param displayName
	 * @param isoCode 
	 */
	public Culture(String name, String displayName, String isoCode) throws Exception {
		this.setName(name);
		this.setDisplayName(displayName);
		this.setIsoCode(isoCode);
	}
}
