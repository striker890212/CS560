

/**
 * An interface for the parser class. The constructor takes the objects errorData,
 * instructTable, symbol, and errorOut objects.
 * 
 * 
 * @author Mike Fencyk
 *
 * 
 */
public interface ParserInterface {

	/**
	 * This method will check the line for syntax and errors. If it contains
	 * an error it will be added to the error table.
	 * 
	 * @param line is the line of code after it has been tokenized. It should be an array of strings with each string being one token.
	 */
	void parse(String[] line);
	
	
}
