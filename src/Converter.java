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
	 * @return The hex equivalent of the input.
	 */
	String binaryToHex(String binary);
	
	/**
	 * Converts a hex input to binary.
	 * 
	 * @param hex The hex input to be converted to binary.
	 * @return The binary equivalent of the hex input.
	 */
	String hexToBinary(String hex);
	
	/**
	 * Converts a decimal integer into hex.
	 * 
	 * @param decimal The decimal integer to be converted to hex.
	 * @return The hex equivalent of the decimal integer input.
	 */
	String decimalToHex(int decimal);
}
