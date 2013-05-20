package org.univnantes.miage.mellerinj.datatypes.units;

import java.util.List;
import org.univnantes.miage.mellerinj.datatypes.Culture;

/**
 * The Unit class is used to represent a unit (as currency, weight...)
 * @author Julien Mellerin
 */
public abstract class AbstractUnit {
	private String format;
	private String symbol;
	private List<Culture> cultures;
	
	public static final String DEFAULT_FORMAT = "%1$.2e %2$s";

	/**
	 * @return String The UnitValue format for the Unit
	 */
	public String getFormat() {
		return format != null ? format : DEFAULT_FORMAT;
	}

	/**
	 * Sets the UnitValue format for the Unit
	 * @param format 
	 * @throws Exception
	 */
	public void setFormat(String format) throws Exception {		
		this.format = format;
	}

	/**
	 * @return String The Unit object symbol
	 */
	public String getSymbol() {
		return symbol;
	}

	/**
	 * @return List<Culture> The list of culture attached to the Unit object
	 */
	public List<Culture> getCultures() {
		return cultures;
	}

	/**
	 * Sets the list of culture attached to the Unit object
	 * @param cultures 
	 */
	public void setCultures(List<Culture> cultures) {
		// @todo Remove the Unit object from the previous cultures
		
		// @todo Add the Unit object from the previous cultures
		
		this.cultures = cultures;
	}
	
	/**
	 * Unit constructor
	 * @param symbol 
	 * @throws Exception
	 */
	public AbstractUnit(String symbol) throws Exception {
		if (symbol == null || symbol.isEmpty()) {
			throw new Exception("A Unit object symbol can not be empty or null");
		}
		
		this.symbol = symbol;
	}
}
