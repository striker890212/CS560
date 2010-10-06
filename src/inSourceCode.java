import java.io.File;

/**
 * 
 * @author damicoac
 *
 * Import the source code into an ArrayList<String>. Store this as a member variable.
 *
 */
public interface inSourceCode {
	
	/**
	 * 
	 * @param sourceCodeFileName
	 *
	 * Import the source code into an ArrayList<Sting>. This will be a member variable. This is where code can be before it is tokenized as an option. Each line of input will be associated with
	 * an index inteh ArrayList (ie line 1 will be at index [0] of the array).
	 */
	void importSourceCode (File sourceCodeFileName);

}
