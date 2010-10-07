/**
 * Converter for converting Binary to Hex, Hex to Binary, and Decimal to Hex.
 * 
 * @author Jeff & Austin
 *
 */
public interface Converter {
	
	/**
	 * Converts a binary input to hex.
	 * 
	 * @param binary The binary input to be turned into hex.
	 * @return hexOut The hex equivalent of the input.
	 */
	public String binaryToHex(String binary);
	
	/**
	 * Converts a hex input to binary.
	 * 
	 * @param hex The hex input to be converted to binary.
	 * @return binaryOut The binary equivalent of the hex input.
	 */
	public String hexToBinary(String hex);
	
	/**
	 * Converts a decimal integer into hex.
	 * 
	 * @param decimal The decimal integer to be converted to hex.
	 * @return hexOut The hex equivalent of the decimal integer input.
	 */
	public String decimalToHex(int decimal);
}
