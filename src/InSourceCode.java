import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
 * 
 * @author Aaron D'Amico
 *
 * Import the source code into an ArrayList<String>. Store this as a member variable.
 *
 */
public class InSourceCode implements InSourceCodeInterface {

	//member variable
	ArrayList<String> source = new ArrayList<String>();
	
	//constructor
	public InSourceCode ()
	{
		
		//Because so many different source code objects need to be made there will be no auto import construtor
	}
	
	/*
	 * Import the source code into an ArrayList<Sting>. This will be a member variable. This is where code can be before it is tokenized as an option. Each line of input will be associated with
	 * an index inteh ArrayList (ie line 1 will be at index [0] of the array).
	 */
	public void importSourceCode (File sourceCodeFileName) throws IOException
	{
		//get input from file, 
		BufferedReader input = new BufferedReader(new FileReader(sourceCodeFileName));
		String newLine;
		
		//keep getting lines of from the file and add them to the properties objects until the file and been completely traversed
		while ((newLine = input.readLine()) != null)
		{
			source.add(newLine);
		}
		
		//close the input
		input.close();
	}
	
	/*
	 * Return the imported source code as an ArrayList<String> ie the member variable
	 */
	public ArrayList<String> getSourceCodeArray ()
	{
		return source;
	}

}
