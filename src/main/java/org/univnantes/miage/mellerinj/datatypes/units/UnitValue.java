package org.univnantes.miage.mellerinj.datatypes.units;

/**
 * The UnitValue represent a value/unit pair
 * @author Julien Mellerin
 */
public class UnitValue<T extends AbstractUnit> {
	private T unit;
	private double value;

	/**
	 * @return TUnit The UnitValue object unit
	 */
	public T getUnit() {
		return unit;
	}

	/**
	 * @return TUnit The UnitValue object value
	 */
	public double getValue() {
		return value;
	}
	
	/**
	 * UnitValue constructor
	 * @param value
	 * @param unit 
	 * @throws Exception
	 */
	public UnitValue(double value, T unit) throws Exception {
		this.value = value;
		
		if (unit == null) {
			throw new Exception("The UnitValue object value can not be null");
		}
		
		this.unit = unit;
	}
	
	/**
	 * @return String Based on the Unit format, returns a string representation of the UnitValue
	 */
        @SuppressWarnings("PMD.LawOfDemeter")
	public String toString() {
                return String.format(this.unit.getFormat(), this.getValue(), this.unit.getSymbol());
	}
}
