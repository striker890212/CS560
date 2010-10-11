import java.util.ArrayList;
import java.util.StringTokenizer;
/**
 * Class that implements the TokenizerInterface. The returned tokens are
 * represented by an ArrayList of Strings, where each String is one token
 * tokenized by comments, spaces, and commas.
 * 
 * @author Austin
 *
 */
public class Tokenizer implements TokenizerInterface {
	// The array list that will be passed back to the method caller.
	private ArrayList<String> tokenArray = new ArrayList<String>();
	// A temporary array list for storage of comment tokens.
	private ArrayList<String> commentArray;
	// A temporary array list for storage of space tokens.
	private ArrayList<String> spaceArray;
	// A temporary array list for storage of comma tokens.
	private ArrayList<String> commaArray;
	
	/* The main method of the Tokenizer class. This method will take in a line
	 * from the parser and tokenize it by comments, spaces, then commas, and 
	 * return the created tokens via an array list of Strings. 
	 */
	@Override
	public ArrayList<String> tokenizeLine(String line) {
		// Seperate the line into tokens based on a comment
		tokenizeComment(line);
		//Create the temp variables which will store position in the arrays.
		int i = 0, j = 0, k = 0;
		// Temporary String object to store tokens.
		String temp;
		
		// Loop that will tokenize each token created by tokenizeComment.
		while(commentArray.size() > i)
		{
			// Grab the token from the array.
			temp = commentArray.get(i);
			// Tokenize the selected token by spaces.
			tokenizeSpace(temp);
			j = 0;
			
			// Loop that will tokenize each token created by tokenizeSpace.
			while(spaceArray.size() > j)
			{
				// Grab the token from the array.
				temp = spaceArray.get(j);
				// Tokenize the token by commas.
				tokenizeComma(temp);
				k = 0;
				
				// Loop that takes each token from the commaArray and adds it
				// to the tokenArray to be output to the caller.
				while(commaArray.size() > k)
				{
					// Grab the token from the array.
					temp = commaArray.get(k);
					// Add the token to the return array.
					tokenArray.add(temp);
					k++;
				}
				j++;
			}
			i++;
		}
		// Return the array containing all of the tokens retrieved from the
		// line in order of occurrence in the line.
		return tokenArray;
	}

	// Takes in a string and tokenizes the string by commas.
	@Override
	public void tokenizeComma(String line) {
		// The delimiter to be used with the tokenizer.
		String delim = ",";
		// Create a new tokenizer using <line> and <delim> for params.
		StringTokenizer comma = new StringTokenizer(line, delim);
		// Set <i> to be the number of tokens formed from <line>.
		int i = comma.countTokens();
		// Create a new temporary array to store the tokens.
		commaArray = new ArrayList<String>(i);
		
		// Adds each token from the tokenizer into the temporary array.
		while (comma.countTokens() > 0)
		{
			// Adds a token to the array in the order they appear in the input.
			commaArray.add((i - comma.countTokens()), comma.nextToken());
		}

	}

	// Takes in a string and tokenizes the string by comment tags "//".
	@Override
	public void tokenizeComment(String line) {
		// The delimiter to be used with the tokenizer.
		String delim = "//";
		// Create a new tokenizer using <line> and <delim> for params.
		StringTokenizer comment = new StringTokenizer(line, delim);
		// Set <i> to be the number of tokens formed from <line>.
		int i = comment.countTokens();
		// Create a new temporary array to store the tokens.
		commentArray = new ArrayList<String>(i);
		
		// Adds each token from the tokenizer into the temporary array.
		while (comment.countTokens() > 0)
		{
			// Adds a token to the array in the order they appear in the input.
			commentArray.add((i - comment.countTokens()), comment.nextToken());
		}
	}

	// Takes in a string and tokenizes the string by spaces.
	@Override
	public void tokenizeSpace(String line) {
		// The delimiter to be used with the tokenizer.
		String delim = " ";
		// Create a new tokenizer using <line> and <delim> for params.
		StringTokenizer space = new StringTokenizer(line, delim);
		// Set <i> to be the number of tokens formed from <line>.
		int i = space.countTokens();
		// Create a new temporary array to store the tokens.
		spaceArray = new ArrayList<String>(i);
		
		// Adds each token from the tokenizer into the temporary array.
		while (space.countTokens() > 0)
		{
			// Adds a token to the array in the order they appear in the input.
			spaceArray.add((i - space.countTokens()), space.nextToken());
		}
	}
	
}
