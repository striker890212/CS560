/**
 * The representation of the Symbols, represented by a String named label, <br />
 * an Int named location representing the location in memory, and boolean <br />
 * named usage representing whether it has been used or not.
 * 
 * NOTE: DO NOT CONFUSE THE SYMBOL'S NAME IN JAVA WITH ITS LABEL IN SAL560!!
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
	 * Sets whether or not the symbol has been used.
	 * 
	 * @param use True iff the symbol has been used, false otherwise..
	 */
	void setUsage (boolean use);
	
	/**
	 * Sets the length of the symbol.
	 * 
	 * @param length The length of the symbol, usually one word or 32 bits.
	 */
	void setLength(int length);
	
	/**
	 * Gets the name of the symbol in question.
	 * 
	 * @return The name of the symbol.
	 */
	String getLabel();
	
	/**
	 * Gets the location of the symbol.
	 * 
	 * @return The location in memory of the symbol.
	 */
	int getLocation();
	
	/**
	 * Gets the usage of the symbol.
	 * 
	 * @return True iff the symbol has been used, false otherwise.
	 */
	boolean getUsage();
	
	/**
	 * Gets the length of the symbol.
	 * 
	 * @return The length of the symbol.
	 */
	int getLength();
}
