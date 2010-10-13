import java.io.File;


/**
 * 
 * @author Aaron D'Amico
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
	 * @param directiveName
	 * @return
	 * 
	 * Returns true if the directive name impacts memory. ie it is one word or longer. otherwise it returns false.
	 */
	Boolean impactsMemory (String directiveName);
	
	
}
