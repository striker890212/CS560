/**
 * Master list of all errors found in the given source code and all data <br />
 * relative to them, represented in an array.
 * 
 * @author Austin & Jeff
 * 
 */
public interface ErrorOut {

	/**
	 * Method to add errors-by-line to the master list of errors in the <br />
	 * source code.
	 * 
	 * @param erroneousEntry The error data to be added to the master list.
	 */
	void add(ErrorData erroneousEntry);
	
	/**
	 * Searches through the master list of errors and returns the error <br />
	 * at the specified line. NOTE: Given the current implementation, <br />
	 * the error MUST EXIST inside of the list, or it will simply return <br />
	 * the last error in the list. 
	 * 
	 * @param lineNumber The line where the error exists at.
	 */
	ErrorData search(int lineNumber);
	
	/**
	 * Returns whether or not the error exists in the master list.
	 * 
	 * @param err The error whose existence is in question.
	 * @return True iff the error exists in the master list, false otherwise.
	 */
	boolean errorExists(Error err);
	
	/**
	 * Returns a string with a formatted message including the Error Code <br />
	 * and error message, complete with line number.
	 * 
	 * @return A string with all data components from the requested ErrorData object.
	 */
	String output(ErrorData entry);
}
