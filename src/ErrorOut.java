import java.util.*;
/**
 * Interface for searching for errors in the input and adds it to an object to
 * be later output to SP2.
 * 
 * @author Austin & Jeff
 * 
 */
public interface ErrorOut {

	/**
	 * Method to add errors to the object file.
	 * 
	 * @param errorCode Int representing the error code.
	 * @param lineNumber Int representing the line with an error.
	 */
	public void add(int errorCode, int lineNumber);
	
	/**
	 * Searches through the input 
	 */
	public boolean search();
	
	/**
	 * Outputs the error list to SP2
	 * 
	 * @return errorList Return the error list to SP2
	 */
	public Map<Integer, Integer> output();
}
