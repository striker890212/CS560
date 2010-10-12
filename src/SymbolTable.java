/**
 * The representation of our symbol table, represented by an array of Symbols.
 * 
 * @author Austin & Jeff
 *
 */
public interface SymbolTable {
	
	/**
	 * Define and add a symbol into our representation of the Symbol table.
	 * 
	 * @param symb the symbol to be added to the symbol table.
	 */
	void defineSymbol(Symbol symb);
	
	/**
	 * Checks whether or not a symbol is defined currently in the <br />
	 * representation of the symbol table.
	 * 
	 * @param label The name of the symbol whose presence is being determined.
	 * @return Whether or not the symbol is currently defined in <br />
	 * the symbol table.
	 */
	boolean symbolIsDefined (String label);
	
	/**
	 * Updates the symbol's data in the symbol table with the new location/ <br />
	 * location counter.
	 * 
	 * @param label The name of the symbol to be updated.
	 * @param location The new location counter.
	 */
	void updateLocation (String label, int location);
	
	/**
	 * Updates what value the symbol contains in the symbol table.
	 * 
	 * @param label The name of the symbol whose usage is being updated.
	 * @param usage How the symbol is being used, label, start.exec, etc.
	 */
	void updateUsage (String label, String usage);
	
	/**
	 * Returns the location of a given Symbol.
	 * 
	 * @param label The name of the symbol whose location is in question.
	 * @return The location of said symbol.
	 */
	int GetLocation (String label);
	
	/**
	 * Returns the length of a given Symbol (will always be one word).
	 * 
	 * @param label The name of the symbol whose length is in question.
	 * @return The length of said symbol.
	 */
	int GetLength (String label);
	
	/**
	 * Sorts the symbol table's representation by label. 
	 */
	void sort();
	
	/**
	 * Outputs the Symbol table with all of its parameters into a string,
	 * with lines terminated by the newline character '\n'. The newline character
	 * may be changed based on which type of OS we decide to test on.
	 * 
	 * @return A string containing the symbol table and data.
	 */
	String outputTable();
}
