package org.univnantes.miage.mellerinj.datatypes.units;

import java.util.HashMap;
import java.util.Map;

/**
 * The ConversionTable class is used to store conversion ratios and to apply them for a specific Unit type
 * @author Julien Mellerin
 */
public abstract class AbstractConversionTable<T extends AbstractUnit> {
	private T baseUnit;
	private Map<T, UnitValue<T>> ratios;

	/**
	 * ConversionTable constructor
	 * @param baseUnit
	 */
	public AbstractConversionTable(T baseUnit) throws Exception {
		if (baseUnit == null) {
			throw new Exception("The ConversionTable object baseUnit can not be null");
		}
		
		this.baseUnit = baseUnit;
		this.ratios = new HashMap<T, UnitValue<T>>();
		
		// Adds the base unit to the ratios map
		this.ratios.put(baseUnit, new UnitValue(1, baseUnit));
	}
	
	/**
	 * Adds a unit to the ConversionTable object
	 * @param unit Unit to add
	 * @param ratio Conversion ratio of the added Unit (the Unit of the ratio must be already in the table)
	 * @throws Exception
	 */
	public void addUnit(T unit, UnitValue<T> ratio) throws Exception {
		// The unit to add is not the base unit
		if (unit == this.baseUnit) {
			throw new Exception("ConversionTable object baseUnit replacement is forbidden");
		}
		
		// The ratio unit is not in the ratios map
		if (!this.ratios.containsKey(ratio.getUnit())) {
			throw new Exception("The ratio unit must be already in the ConversionTable object");
		}
		
		// Calculates the baseUnit based ratio and add it to the ratio map
		double baseRatioValue = ratio.getValue() * this.ratios.get(ratio.getUnit()).getValue();
		this.ratios.put(unit, new UnitValue<T>(baseRatioValue, this.baseUnit));
	}
	
	/**
	 * Based on Units in the conversion table, convert a UnitValue to another
	 * @param from The UnitValue object to convert
	 * @param target The target Unit
	 * @return UnitValue<TUnit> The converted UnitValue<TUnit>
	 * @throws Exception
	 */
	public UnitValue<T> convert(UnitValue<T> from, T target) throws Exception {		
		if (!this.ratios.containsKey(from.getUnit())) {
			throw new Exception("The 'from' unit must be in the ratios map");
		}
		
		if (!this.ratios.containsKey(from.getUnit())) {
			throw new Exception("The target unit 'to' must be in the ratio map");
		}
		
		double resultValue = from.getValue() * this.ratios.get(from.getUnit()).getValue() / this.ratios.get(target).getValue();
		
		return new UnitValue(resultValue, target);
	}
}
