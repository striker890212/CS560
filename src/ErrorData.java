/**
 * A handler for the types of errors we find in the source code, and the data <br />
 * that it involves.
 * 
 * @author Jeff
 *
 */
public interface ErrorData {

	/**
	 * Adds the necessary describing data to the ErrorData object for use <br />
	 * in the ErrorOut class.
	 * 
	 * @param lineNumber The line the error was found on.
	 * @param errorCode The error code assigned to the error.
	 * @param errorMessage The error message corresponding to the error code.
	 */
	void add (int lineNumber, int errorCode, String errorMessage);
	
	/**
	 * Gets the line number of the error in question.
	 * 
	 * @return The line the error was found on.
	 */
	int getLineNumber();
	
	/**
	 * Gets the error code of the error in question.
	 * 
	 * @return The error code number of the error found.
	 */
	int getErrorCode();
	
	/**
	 * Gets the error message corresponding to the error code.
	 * 
	 * @return The error message corresponding to the error code.
	 */
	String errorMessage();
	
	
}
