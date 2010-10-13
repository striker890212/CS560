import java.io.File;
import java.util.Properties;

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
	 * member variables. The table is modeled on three properties objects. Properties objects have a key and a value. The key in both will be the instruction name. The value in the first one
	 * will be the instruction type. In the second it will be the opcode and in the third it will be the fuction code
	 */
	Properties errorValue = new Properties();
	Properties errorMessage = new Properties();
	
	
	/*
	 * import the MOT text file into a data structure.
	 */
	public void importTable (File tableFileName)
	{
		
	}
	
	/*
	 * When given an instruction it returns a boolean if the error code exists in the data structure. Return is true if instruction 
	 * exists. False otherwise.
	 */
	public Boolean hasInstruction (String instructionName)
	{
		return null;
		
	}
	
	/*
 
	 * Get the instruction type based on the instruction name. This returns a string. It returns the string "instruction type not present" if the instruction name doesnt exist in the object.
	 */
	public String getInstructionType (String instructionName)
	{
		return null;
		
	}
	
	/*
	 * Get the opcode based on the instruction name. This returns a string. It returns the string "opcode not present" if the instruction name doesnt exist in the object.
	 */
	public String getInstructionOpcode (String instructionName)
	{
		return null;
		
	}
	
	/* 
	 * Get the function code based on the instruction name. This returns a string. It returns the string "function code not present" if the function code doesnt exist in the object. It 
	 * returns the string "NA" is the function code is not applicable. It returns "instruction not present" if the instruction is not in the table.
	 */
	public	String getFunctionCode (String functionCode)
	{
		return null;
		
	}

}
