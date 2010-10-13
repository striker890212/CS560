import java.io.File;

/**
 * 
 * @author Aaron D'Amico
 * 
 * Instruction table is a flat text file. The name of this file is stored on the root directory of the code (As it is with all
 * tables or files that need to be imported). This class has the methods to import this file into a data structure.
 *
 */
public interface InstructTableInterface 
{

	/**
	 * 
	 * import the MOT text file into a data structure.
	 */
	void importTable (File tableFileName);
	
	/**
	 * 
	 * When given an instruction it returns a boolean if the error code exists in the data structure. Return is true if instruction 
	 * exists. False otherwise.
	 */
	Boolean hasInstruction (String instructionName);
	
	/**
	 * 
	 * @param instructionName
	 * @return
	 * 
	 * Get the instruction type based on the instruction name. This returns a string. It returns the string "instruction type not present" if the instruction name doesnt exist in the object.
	 */
	String getInstructionType (String instructionName);
	
	/**
	 * 
	 * @param instructionName
	 * @return
	 * 
	 * Get the opcode based on the instruction name. This returns a string. It returns the string "opcode not present" if the instruction name doesnt exist in the object.
	 */
	String getInstructionOpcode (String instructionName);
	
	/**
	 * 
	 * @param functionCode
	 * @return
	 * 
	 * Get the function code based on the instruction name. This returns a string. It returns the string "function code not present" if the instruction name doesnt exist in the object. It 
	 * returns the string "NA" is the code is not applicable.
	 */
	String getFunctionCode (String functionCode);
	
}
