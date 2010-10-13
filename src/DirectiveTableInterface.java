import java.io.File;


/**
 * 
 * @author damicoac
 * 
 * Directives table is a flat text file. The name of this file is stored on the root directory of the code (As it is with all
 * tables or files that need to be imported). This class has the methods to import this file into a data structure.
 *
 */
public interface DirectiveTableInterface 
{

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
	Boolean hasDirective (String directiveName);
	
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
