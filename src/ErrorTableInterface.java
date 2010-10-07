import java.io.*;

/**
 * 
 * @author damicoac
 * 
 * Error table is a flat text file. The name of this file is stored on the root directory of the code (As it is with all
 * tables or files that need to be imported). This class has the methods to import this file into a data structure. 
 */
public interface ErrorTableInterface {

	/**
	 * import the error table text file into a data structure.
	 */
	void importTable (File tableFileName);
	
	/**
	 * When given an error code it returns a boolean if the error code exists in the data structure. Return is true if error code 
	 * exists. False otherwise.
	 */
	Boolean hasErrorType (String errorCode);
	
	/**
	 * When given an error code this returns its associated error message.
	 */
	String getErrorMessage (String errorCode);
	
	/**
	 * 
	 * @param parentItemName
	 * @return
	 * 
	 * This further information about an item. This method is a stub where $Item in get$Item is replaced with a specific name. This method is then repeated for
	 * each item to get.
	 */
	String get$Item (String parentItemName);
	
	
}
