import java.io.File;


/**
 * 
 * @author damicoac
 * Directives table is a flat text file. The name of this file is stored on the root directory of the code (As it is with all
 * tables or files that need to be imported). This class has the methods to import this file into a data structure.
 *
 */
public interface directiveTableClass {

	/**
	 * 
	 * import the directive text file into a data structure.
	 */
	void importTable (File tableFileName);
	
	/**
	 * 
	 * When given an directive it returns a boolean if the error code exists in the data structure. Return is true if directive 
	 * exists. False otherwise.
	 */
	Boolean hasDirective (String directive);
	
	
}
