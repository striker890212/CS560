import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.StringTokenizer;

/*
 * @author Aaron D'Amico
 * 
 * Directives table is a flat text file. The name of this file is stored on the root directory of the code (As it is with all
 * tables or files that need to be imported). This class has the methods to import this file into a data structure.
 */
public class DirectiveTable implements DirectiveTableInterface {

	/*
	 * member variables. The table is modeled on one properties objects. Properties objects have a key and a value. The key is the directive string and the value is the impact memory boolean
	 */
	private Properties directiveNameTable = new Properties();

	
	//constructors
	public DirectiveTable()
	{
		
		//this is an empty constructor for ease of coding.
	}

	//This constructor will immediately call the import code on the object. It is the equivalent of calling the constructor and the importTable method in the same line
	public DirectiveTable(File tableFileName) throws IOException
	{
		
		//get input from file, normally that file will be directives.tbl and be located in the src directory of the code
		BufferedReader input = new BufferedReader(new FileReader(tableFileName));
		String newLine;
		
		//keep getting lines of from the file and add them to the properties objects until the file and been completely traversed
		while ((newLine = input.readLine()) != null)
		{
			//if the char at [0] is NOT '#' then it is not a comment. parse the line and populate the properties objects. otherwise it is assumed to be a comment. 
			//The only reason this works is because we control the content of the tables
			if (newLine.charAt(0) != '#')
			{
				
				//variables for the error code and the error type
				String directive, memoryUse;
				
				//tokenize the string to get the first 2 tokens (ie the error code and error type)
				StringTokenizer lineTokens = new StringTokenizer (newLine);
				
				directive = lineTokens.nextToken();
				memoryUse = lineTokens.nextToken();
				
				//populate the properties objects with the error code, error type and error message
				directiveNameTable.setProperty(directive, memoryUse);
			}
		}
		
		//close the input
		input.close();
	}
	
	
	
	/*
	 * import the directive text file into a data structure.
	 */
	public void importTable (File tableFileName) throws IOException
	{
		
		//get input from file, normally that file will be directives.tbl and be located in the src directory of the code
		BufferedReader input = new BufferedReader(new FileReader(tableFileName));
		String newLine;
		
		//keep getting lines of from the file and add them to the properties objects until the file and been completely traversed
		while ((newLine = input.readLine()) != null)
		{
			//if the char at [0] is NOT '#' then it is not a comment. parse the line and populate the properties objects. otherwise it is assumed to be a comment. 
			//The only reason this works is because we control the content of the tables
			if (newLine.charAt(0) != '#')
			{
				
				//variables for the error code and the error type
				String directive, memoryUse;
				
				//tokenize the string to get the first 2 tokens (ie the error code and error type)
				StringTokenizer lineTokens = new StringTokenizer (newLine);
				
				directive = lineTokens.nextToken();
				memoryUse = lineTokens.nextToken();
				
				//populate the properties objects with the error code, error type and error message
				directiveNameTable.setProperty(directive, memoryUse);
			}
		}
		
		//close the input
		input.close();
	}
	
	/*
	 * When given an directive it returns a boolean if the error code exists in the data structure. Return is true if directive 
	 * exists. False otherwise.
	 */
	public Boolean hasDirective (String directiveName)
	{
		return (directiveNameTable.containsKey(directiveName));
		
	}
	
	/*
	 * Returns true if the directive name impacts memory. ie it is one word or longer. otherwise it returns false. Assumes that the directive is in the table.
	 */
	public Boolean impactsMemory (String directiveName)
	{
		if (directiveNameTable.getProperty(directiveName).equals("true"))
		{
			return true;
		}
		else 
		{
			return false;
		}
		
	}

}
