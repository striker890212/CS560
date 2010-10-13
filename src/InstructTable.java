import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.StringTokenizer;

/*
 * 
 * @author Aaron D'Amico
 * 
 * Instruction table is a flat text file. The name of this file is stored on the root directory of the code (As it is with all
 * tables or files that need to be imported). This class has the methods to import this file into a data structure.
 *
 */
public class InstructTable implements InstructTableInterface {

	/*
	 * member variables. The table is modeled on three properties objects. Properties objects have a key and a value. The key in all three will be the instruction name. The value in the first one
	 * will be the instruction type. In the second it will be the opcode and in the third it will be the function code.
	 */
	private Properties instructionType = new Properties();
	private Properties instructionOpcode = new Properties();
	private Properties instructionFunctionCode = new Properties();
	
	//constructor
	public InstructTable()
	{
		
		//this is an empty constructor for ease of coding.
	}
	
	//This constructor will immediately call the import code on the object. It is the equivalent of calling the constructor and the importTable method in the same line
	public InstructTable(File tableFileName) throws IOException
	{
		//get input from file, normally that file will be instructions.tbl and be located in the src directory of the code, here it will be hard coded
		BufferedReader input = new BufferedReader(new FileReader(tableFileName));
		String newLine;
		
		//keep getting lines of from the file and add them to the properties objects until the file and been completely traversed
		while ((newLine = input.readLine()) != null)
		{
			//if the char at [0] is NOT '#' then it is not a comment. parse the line and populate the properties objects. otherwise it is assumed to be a comment. 
			//The only reason this works is because we control the content of the tables
			if (newLine.charAt(0) != '#')
			{
				
				//variables for the instruction type, opcode, function code and the instruction
				String instructType, opcode,functionCode, instruction;
				
				//tokenize the string to get the first 4 tokens (ie instruction type, opcode, function code and instruction)
				StringTokenizer lineTokens = new StringTokenizer (newLine);
				
				instructType = lineTokens.nextToken();
				opcode = lineTokens.nextToken();
				functionCode = lineTokens.nextToken();
				instruction = lineTokens.nextToken();
				
				//populate the properties objects with the instruction type, opcode, function code and instruction
				instructionType.setProperty(instruction, instructType);
				instructionOpcode.setProperty(instruction,opcode);
				instructionFunctionCode.setProperty(instruction,functionCode);
			}
		}
		
		//close the input
		input.close();
	}
	
	
	/*
	 * import the MOT text file into a data structure.
	 */
	public void importTable (File tableFileName) throws IOException
	{
		//get input from file, normally that file will be instructions.tbl and be located in the src directory of the code, here it will be hard coded
		BufferedReader input = new BufferedReader(new FileReader(tableFileName));
		String newLine;
		
		//keep getting lines of from the file and add them to the properties objects until the file and been completely traversed
		while ((newLine = input.readLine()) != null)
		{
			//if the char at [0] is NOT '#' then it is not a comment. parse the line and populate the properties objects. otherwise it is assumed to be a comment. 
			//The only reason this works is because we control the content of the tables
			if (newLine.charAt(0) != '#')
			{
				
				//variables for the instruction type, opcode, function code and the instruction
				String instructType, opcode,functionCode, instruction;
				
				//tokenize the string to get the first 4 tokens (ie instruction type, opcode, function code and instruction)
				StringTokenizer lineTokens = new StringTokenizer (newLine);
				
				instructType = lineTokens.nextToken();
				opcode = lineTokens.nextToken();
				functionCode = lineTokens.nextToken();
				instruction = lineTokens.nextToken();
				
				//populate the properties objects with the instruction type, opcode, function code and instruction
				instructionType.setProperty(instruction, instructType);
				instructionOpcode.setProperty(instruction,opcode);
				instructionFunctionCode.setProperty(instruction,functionCode);
			}
		}
		
		//close the input
		input.close();
	}
	
	/*
	 * When given an instruction it returns a boolean if the error code exists in the data structure. Return is true if instruction 
	 * exists. False otherwise.
	 */
	public Boolean hasInstruction (String instructionName)
	{
		return (instructionOpcode.containsKey(instructionName));
		
	}
	
	/*
 
	 * Get the instruction type based on the instruction name. This returns a string. It returns the string "instruction type not present" if the instruction name doesnt exist in the object.
	 */
	public String getInstructionType (String instructionName)
	{
		if (instructionType.getProperty(instructionName).equals("I"))
		{
			return "I-Type";
		}
		else if (instructionType.getProperty(instructionName).equals("R"))
		{
			return "Reg2Reg2Reg";
		}
		else if (instructionType.getProperty(instructionName).equals("S"))
		{
			return "S-Type";
		}
		else if (instructionType.getProperty(instructionName).equals("J"))
		{
			return "Jump";
		}
		else if (instructionType.getProperty(instructionName).equals("IO"))
		{
			return "IO-Type";
		}
		return "instruction type not present";
		
//		or this code could be the following if the above is too detailed
//		
//		if(instructionType.containsKey(instructionName) == true)
//		{
//			return instructionType.getProperty(instructionName);
//		}
//		
//		return "instruction type not present";
		
	}
	
	/*
	 * Get the opcode based on the instruction name. This returns a string. It returns the string "opcode not present" if the instruction name doesnt exist in the object.
	 */
	public String getInstructionOpcode (String instructionName)
	{
		
		if(instructionOpcode.containsKey(instructionName) == true)
		{
			return instructionOpcode.getProperty(instructionName);
		}
		
		return "opcode not present";
		
	}
	
	/* 
	 * Get the function code based on the instruction name. This returns a string. It returns the string "function code not present" if the function code doesnt exist in the object. It 
	 * returns the string "NA" is the function code is not applicable. It returns "instruction not present" if the instruction is not in the table.
	 */
	public	String getFunctionCode (String instructionName)
	{
		if (instructionFunctionCode.getProperty(instructionName).equals("NA"))
		{
			return "NA";
		}
		else if (instructionFunctionCode.getProperty(instructionName).equals("-"))
		{
			return "function code not present";
		}
		else if (instructionFunctionCode.containsKey(instructionName) == true)
		{
			return instructionFunctionCode.getProperty(instructionName);
		}
		return "instruction not present";
		
	}

}
