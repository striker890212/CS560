import java.io.File;


/**
 * 
 * @author damicoac
 *
 * Creates an ArrayList<String[2]> member variable. This is a 3D array. At each index it has a Line number at [0] and an Error Code at [1]. This variable will keep track of the errors
 * found in the source code and what line they are associated with.
 */
public interface foundErrorsClass {
	
	/**
	 * When given an error code it returns a boolean if the error code exists in the data structure. Return is true if error code 
	 * exists. False otherwise.
	 */
	Boolean hasErrorType (String errorCode);
	
	/**
	 * Adds an error to the array with the Line number of the error at [0] and an the Error Code at [1]
	 */
	void addErrorMessage (String errorCode, String errorLine);

}
