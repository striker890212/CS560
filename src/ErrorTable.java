import java.io.*;
import java.util.*;

/* 
 * @author Aaron D'Amico
 * 
 * Error table is a flat text file. The name of this file is stored on the root directory of the code (As it is with all
 * tables or files that need to be imported). This class has the methods to import this file into a data structure. 
 */
public class ErrorTable implements ErrorTableInterface {

	/*
	 * member variables. The table is modeled on two properties objects. Properties objects have a key and a value. The key in both will be the error code. The value in the first one
	 * will be the error type. In the second it will be the Error Message
	 */
	Properties errorValue = new Properties();
	Properties errorMessage = new Properties();
	
	//constructor
	public ErrorTable() 
	{
		
		//this is an empty constructor for ease of coding.
	}
	
	//This constructor will immediately call the import code on the object. It is the equivalent of calling the constructor and the importTable method in the same line
	public ErrorTable(File tableFileName) throws IOException
	{
		
		//get input from file, normally that file will be error.tbl and be located in the src directory of the code
		BufferedReader input = new BufferedReader(new FileReader(tableFileName));
		String newLine;
		
		//keep getting lines of from the file and add them to the properties objects until the file and been completely traversed
		while ((newLine = input.readLine()) != null)
		{
			//if the char at [0] is NOT '#' then it is not a comment. parse the line and populate the properties objects. otherwise it is assumed to be a comment. 
			//The only reason this works is because we control the content of the tables
			if (newLine.charAt(0) != '#')
			{
				
				//remove the error message from the string. Do this by getting the index of the first '"'
				int messageIndex = newLine.indexOf("\"");
				String message = newLine.substring(messageIndex, newLine.length()-1 );
				
				//variables for the error code and the error type
				String errorCode, errorType;
				
				//tokenize the string to get the first 2 tokens (ie the error code and error type)
				StringTokenizer lineTokens = new StringTokenizer (newLine);
				
				errorCode = lineTokens.nextToken();
				errorType = lineTokens.nextToken();
				
				//populate the properties objects with the error code, error type and error message
				errorValue.setProperty(errorCode, errorType);
				errorMessage.setProperty(errorCode, message);
			}
		}
		
		//close the input
		input.close();
	}
	
	
	/*
	 * import the flat error table file. There will be 3 tokens in this file based on the ' ' delimiter. The final token is in "" but has ' ' in it. The table will be modeled with 
	 * two properties objects.
	 */
	@Override
	public void importTable(File tableFileName) throws IOException {

		//get input from file, normally that file will be error.tbl and be located in the src directory of the code
		BufferedReader input = new BufferedReader(new FileReader(tableFileName));
		String newLine;
		
		//keep getting lines of from the file and add them to the properties objects until the file and been completely traversed
		while ((newLine = input.readLine()) != null)
		{
			//if the char at [0] is NOT '#' then it is not a comment. parse the line and populate the properties objects. otherwise it is assumed to be a comment. 
			//The only reason this works is because we control the content of the tables
			if (newLine.charAt(0) != '#')
			{
				
				//remove the error message from the string. Do this by getting the index of the first '"'
				int messageIndex = newLine.indexOf("\"");
				String message = newLine.substring(messageIndex, newLine.length()-1 );
				
				//variables for the error code and the error type
				String errorCode, errorType;
				
				//tokenize the string to get the first 2 tokens (ie the error code and error type)
				StringTokenizer lineTokens = new StringTokenizer (newLine);
				
				errorCode = lineTokens.nextToken();
				errorType = lineTokens.nextToken();
				
				//populate the properties objects with the error code, error type and error message
				errorValue.setProperty(errorCode, errorType);
				errorMessage.setProperty(errorCode, message);
			}
		}
		
		//close the input
		input.close();
	}

	/* 
	 * check the errorValue member variable to see if it has a error type based on the error code
	 */
	@Override
	public Boolean hasErrorType(String errorCode) 
	{
		return (errorValue.containsKey(errorCode));
	}

	/*
	 * check the errorMessage member variable to see if it has a error message based on the error code. If it does return a string of that message.
	 * Return String "no error message for that code" if that error code doesnt exist
	 */
	@Override
	public String getErrorMessage(String errorCode) 
	{
		if(errorMessage.containsKey(errorCode) == true)
		{
			return errorMessage.getProperty(errorCode);
		}
		
		return "no error message for that code";
	}

	/* 
	 * check the errorValue member variable to see if it has a error typpe based on the error code. If it does, return a string of that error type.
	 * Return String "no error type for that code" if that error code doesnt exist
	 */
	@Override
	public String getErrorType (String errorCode) 
	{
		if(errorValue.containsKey(errorCode) == true)
		{
			return errorValue.getProperty(errorCode);
		}
		
		return "no error type for that code";
	}

}
