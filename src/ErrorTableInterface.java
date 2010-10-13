import java.io.*;

/**
 * 
 * @author Aaron D'Amico
 * 
 * Error table is a flat text file. The name of this file is stored on the root directory of the code (As it is with all
 * tables or files that need to be imported). This class has the methods to import this file into a data structure. 
 */
public interface ErrorTableInterface 
{

	/**
	 * import the error table text file into a data structure.
	 * @throws IOException 
	 */
	void importTable (File tableFileName) throws IOException;
	
	/**
	 * 
	 * @param errorCode
	 * @return True or False if the error code exists
	 * 
	 * When given an error code it returns a boolean if the error code exists in the data structure. Return is true if error code 
	 * exists. False otherwise.
	 */
	Boolean hasErrorType (String errorCode);
	
	/**
	 * 
	 * @param errorCode
	 * @return 
	 * 
	 * When given an error code this returns its associated error message. Return String "no error message for that code" if that error code doesnt exist
	 */
	String getErrorMessage (String errorCode);
	
	/**
	 * 
	 * @param errorCode
	 * @return
	 * 
	 * Get the Error type based on an error code. This returns a string. It returns the string "no error type for that code" if the error code doesnt exist in the object.
	 */
	String getErrorType (String errorCode);
	
	/**
	 * 
	 * @param errorMessage
	 * @return
	 * 
	 * Get the Error code based on an error message. This returns a string. It returns the string "no error code for that message" if the error message doesnt exist in the object.
	 */
	String getErrorCode (String theErrorMessage);
	
	
}
