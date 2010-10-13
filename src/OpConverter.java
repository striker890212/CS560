/**
 * OpConverter takes a line of source code in a number format, and converts <br />
 * it into the requested format, that is, binary, hexadecimal, or decimal.
 * 
 * @author Jeff Wolfe
 *
 */
public class OpConverter implements Converter {

	public OpConverter() {
		//No fields, it's a utility class.
	}
	
	@Override
	public String binaryToHex(String binary) {
		//Convert the binary string into a decimal value.
		int decimal = this.binToDec(binary);
		//Convert the decimal value into a hex value.
		String hexOut = Integer.toHexString(decimal);
		
		return hexOut;
	}

	@Override
	public String hexToBinary(String hex) {
		int counter = 0;
		int decimal = 0;
		char digit;
		
		//Convert the entire string to uppercase for conversion purposes.
		hex = hex.toUpperCase();
		
		//Convert each hex digit to decimal one by one and add them up.
		while (hex.length() > counter)
		{
			//Get least significant digit.
			digit = hex.charAt(hex.length()-1-counter);
			//If the digit is 0 we need to do nothing.
			if (digit == '0')
			{
			}
			//Otherwise, we add it to our decimal variable.
			else if (digit == '1')
			{
				decimal = decimal + (1 * (16^counter));
			}
			else if (digit == '2')
			{
				decimal = decimal + (2 * (16^counter));
			}
			else if (digit == '3')
			{
				decimal = decimal + (3 * (16^counter));
			}
			else if (digit == '4')
			{
				decimal = decimal + (4 * (16^counter));
			}
			else if (digit == '5')
			{
				decimal = decimal + (5 * (16^counter));
			}
			else if (digit == '6')
			{
				decimal = decimal + (6 * (16^counter));
			}
			else if (digit == '7')
			{
				decimal = decimal + (7 * (16^counter));
			}
			else if (digit == '8')
			{
				decimal = decimal + (8 * (16^counter));
			}
			else if (digit == '9')
			{
				decimal = decimal + (9 * (16^counter));
			}
			else if (digit == 'A')
			{
				decimal = decimal + (10 * (16^counter));
			}
			else if (digit == 'B')
			{
				decimal = decimal + (11 * (16^counter));
			}
			else if (digit == 'C')
			{
				decimal = decimal + (12 * (16^counter));
			}
			else if (digit == 'D')
			{
				decimal = decimal + (13 * (16^counter));
			}
			else if (digit == 'E')
			{
				decimal = decimal + (14 * (16^counter));
			}
			else
			{
				decimal = decimal + (15 * (16^counter));
			}
			counter++;
		}
		
		//Return the binary string.
		return Integer.toBinaryString(decimal);
	}

	@Override
	public String decimalToHex(int decimal) {
		//Return the hex string.
		return Integer.toHexString(decimal);
	}

	@Override
	public int binaryToDecimal(String binary) {
		// Call the private helper method to convert.
		return this.binToDec(binary);
	}

	@Override
	public String decimalToBinary(int decimal) {
		//Return the binary string.
		return Integer.toBinaryString(decimal);
	}
	
	public String asciiToBinary(String ascii) {
		//TODO: code this plx
		return null;
	}

	/**
	 * This private method is called for the intermediate step in some <br />
	 * conversions of converting binary to decimal.
	 * 
	 * @param binary The binary number to be converted into decimal.
	 * @return The converted decimal integer.
	 */
	private int binToDec(String binary) {
		int decimal = 0;
		int counter = 0;
		int conversion = 0;
		
		//Convert each binary digit until you reach the end of the binary number.
		while (binary.length() > counter) 
		{
			//Turn one digit, starting with the least significant one, of the binary string into an integer.
			conversion = Integer.parseInt(binary.substring(binary.length()-counter, binary.length()-counter+1));
			//Multiply that by 2 to the power of whatever position in the string
			//we are in, starting at 0 and ending at binary.length - 1.
			conversion = conversion * 2^counter;
			//Add the newly converted binary digit to the total decimal number.
			decimal = decimal + conversion;
			//Increment the counter.
			counter++;
		}
		
		return decimal;
	}
}
