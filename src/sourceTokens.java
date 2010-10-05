import java.io.*;
import java.util.StringTokenizer;


/*
 * This class will import a source code file. It will import the whole file and create the tokens for it. This will allow for 
 * easier use of tokens instead of using the tokenizer outright. Essentially it extends tokenizer with more functionality. 
 * This class might be over kill. But it adds the ability to do a 3 pass compiler. 
 */
public interface sourceTokens {
	
	/*
	 * Imports all the source code from a file into a data structure for easier tokenizing. This works to solve the base problems
	 * of multiple delimiters (';',' ', '{', '}' etc)
	 */
	void importSourceFile (File sourceCodeFileName);
	
	/*
	 * Checks to see the the data section exists. Returns true if so otherwise returns false. This is a method 
	 * stub that would be used for all sections. This might be a quick way to find early errors.
	 */
	Boolean hasDataSection ();
	
	/*
	 * Get the tokens for the data sections only.
	 */
	StringTokenizer getDataSection ();
	

}
