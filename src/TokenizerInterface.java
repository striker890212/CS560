import java.util.*;
/**
 * Uses the java string tokenizer to take lines of code and turn them
 * into parsable "tokens".
 * 
 * @author Austin
 *
 */
interface TokenizerInterface {
	
	/**
	 * The main method of the Tokenizer class. This method will take in a line
	 * from the parser and tokenize it by comments, spaces, then commas, and 
	 * return the created tokens via an ArrayList of Strings.
	 * 
	 * @return An array list containing all of the tokens in the line.
	 */
	ArrayList<String> tokenizeLine(String line);
	
	/**
	 * Method to tokenize by comments.
	 * 
	 * @param line The line of code to be tokenized.
	 */
	void tokenizeComment(String line);
	
	/**
	 * Method to tokenize by spaces.
	 * 
	 * @param line The line of code to be tokenized.
	 */
	void tokenizeSpace(String line);
	
	/**
	 * Method to tokenize by commas.
	 * 
	 * @param line The line of code to be tokenized.
	 */
	void tokenizeComma(String line);
}
