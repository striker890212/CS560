import java.io.File;

/**
 * 
 * @author damicoac
 *
 * The class requires two parameters in its constructor, the source code object (ie created by InSourceCode class) and the user error table object (ie created by ErrorsOut).
 * It takes these and creates an object with the errors added to the source code under the line they are associated with (ie where the error is found).
 * 
 */
public interface UserReportInterface 
{
	
	/**
	 * 
	 * @param SourceCodeArray
	 * @param foundErrorsTable
	 * 
	 * This method creates an ArrayList of strings. Each index is associated with a line of output. That output will eventually be to a file in the second pass. It creates
	 * this Array by merging the source code with the errors found in the source code. This maintains the source code in full but just adds the associated errors.
	 * The method doesnt return a value. Instead it stores the ArrayList<String>  as a member variable.
	 */
	void createUserReport (InSourceCode SourceCodeArray, ErrorOut foundErrorsTable);
	
	/**
	 * 
	 * @param outputFileName
	 * 
	 * This outputs the ArrayList<String> member variable to a file with the name as given in the parameter. Each index of the Array becomes its own line of output in the file. 
	 * 
	 */
	void outputUserReport (File outputFileName);
	
}
