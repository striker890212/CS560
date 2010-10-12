/**
 * The representation of the Symbols, represented by a String named label, <br />
 * an Int named location representing the location in source, and boolean <br />
 * named usage representing how it is used.
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
	 * Sets how the symbol is used.
	 * 
	 * @param use Set as "Label" if the symbol is a label, start.exec if it <br />
	 * lists the location of the start of the program, etc.
	 */
	void setUsage (String use);
	
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
	 * @return The location in the source code of the symbol.
	 */
	int getLocation();
	
	/**
	 * Gets the usage of the symbol.
	 * 
	 * @return The type of the symbol, e.g. label, start.exec, etc.
	 */
	String getUsage();
	
	/**
	 * Gets the length of the symbol.
	 * 
	 * @return The length of the symbol.
	 */
	int getLength();
}
