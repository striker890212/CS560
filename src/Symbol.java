/**
 * The representation of the Symbols, represented by a String named label, <br />
 * an Int named location representing the location in memory, and an Int <br />
 * named usage representing the value.
 * 
 * @author Austin and Jeff
 *
 */
public interface Symbol {
	
	/**
	 * Sets the label of the symbol.
	 * 
	 * @param name The name given to the symbol.
	 */
	void setLabel (String name);
	
	/**
	 * Sets the location of the symbol.
	 * 
	 * @param loc The location given to the symbol.
	 */
	void setLocation (int loc);
	
	/**
	 * Sets the value of the symbol.
	 * 
	 * @param use The value given to the symbol.
	 */
	void setUsage (int use);
	
	/**
	 * Sets the length of the symbol.
	 */
	void setLength();
	
	/**
	 * Use to be determined, currently listed as a placeholder
	 * 
	 * @param name
	 * @param loc
	 * @param use
	 */
	void getSymbolFields (String name, int loc, int use);
	
	/**
	 * Gets the name of the symbol in question.
	 * 
	 * @return labelOut The name of the symbol.
	 */
	String getLabel();
	
	/**
	 * Gets the location of the symbol.
	 * 
	 * @return locationOut The location in memory of the symbol.
	 */
	int getLocation();
	
	/**
	 * Gets the value of the symbol.
	 * 
	 * @return useOut The value of the symbol.
	 */
	int getUsage();
	
	/**
	 * Gets the length of the symbol.
	 * 
	 * @return lengthOut The length of the symbol.
	 */
	int getLength();
}
