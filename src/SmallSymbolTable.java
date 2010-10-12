import java.util.ArrayList;

/**
 * A sortable symbol table as represented by an arraylist of symbols.
 * NOTE: DO NOT CONFUSE THE SYMBOL'S NAME IN *JAVA* WITH ITS LABEL IN SAL560!!
 * 
 * @author Jeff W
 *
 */
public class SmallSymbolTable implements SymbolTable {
	private ArrayList<Symbol> symTable;
	
	//Default constructor initializes the representation record.
	public SmallSymbolTable() {
		this.symTable = new ArrayList<Symbol>();
	}
	
	@Override
	public void defineSymbol(Symbol symb) {
		String label = symb.getLabel();
		int counter = 0;
		boolean exists = false;
		
		//Check the label of each symbol in the symbol table to see if it already
		//exists in the symbol table.
		while (this.symTable.size() > counter)
		{
			//Checks the label of symb vs the label of the symbol in the symbol table.
			if (this.symTable.get(counter).getLabel().equals(label))
			{
				exists = true;
			}
			counter++;
		}
		//Adds the symbol to the symbol table if it is not already there,
		//otherwise does nothing.
		if (!exists)
		{
			this.symTable.add(symb);
		}
	}

	@Override
	public boolean symbolIsDefined(String label) {
		int counter = 0;
		boolean exists = false;
		
		//Check the label of each symbol in the symbol table to see if it already
		//exists in the symbol table.
		while (this.symTable.size() > counter)
		{
			//Checks the label vs the label of the symbol in the symbol table.
			if (this.symTable.get(counter).getLabel().equals(label))
			{
				exists = true;
			}
			counter++;
		}
		
		//Return true if the symbol is defined, false otherwise.
		return exists;
	}

	@Override
	public void updateLocation(String label, int location) {
		int counter = 0;
		
		//Iterate through the symbol table to find the symbol with name label.
		while (this.symTable.size() > counter)
		{
			//When found, update its location.
			if (this.symTable.get(counter).getLabel().equals(label))
			{
				this.symTable.get(counter).setLocation(location);
			}
			counter++;
		}
	}

	@Override
	public void updateUsage(String label, String usage) {
		int counter = 0;
		
		//Iterate through the symbol table to find the symbol with name label.
		while (this.symTable.size() > counter)
		{
			//When found, update its usage.
			if (this.symTable.get(counter).getLabel().equals(label))
			{
				this.symTable.get(counter).setUsage(usage);
			}
			counter++;
		}

	}

	@Override
	public int GetLocation(String label) {
		int counter = 0;
		int returnValue = 0;
		
		//Iterate through the symbol table to find the symbol with name label.
		while (this.symTable.size() > counter)
		{
			//When found, break from the loop and return its location.
			if (this.symTable.get(counter).getLabel().equals(label))
			{
				returnValue = this.symTable.get(counter).getLocation();
				break;
			}
			counter++;
		}
		return returnValue;
	}

	@Override
	public int GetLength(String label) {
		int counter = 0;
		int returnValue = 0;
		
		//Iterate through the symbol table to find the symbol with name label.
		while (this.symTable.size() > counter)
		{
			//When found, break from the loop and return its location.
			if (this.symTable.get(counter).getLabel().equals(label))
			{
				returnValue = this.symTable.get(counter).getLength();
				break;
			}
			counter++;
		}
		return returnValue;
	}

	@Override
	public void sort() {
		ArrayList<Symbol> sorter = new ArrayList<Symbol>();
		//Set the loop counter to 1 since we're skipping the first element.
		int counter = 1;
		//Set an inner loop counter for a nested loop to go through the arrays.
		int innerCounter = 0;
		
		//Copy the very first element into a sorting arrayList.
		sorter.add(this.symTable.get(0));
		
		//Copy each element from the original array into the sorting array, in
		//sorted order.
		while (counter < this.symTable.size())
		{
			innerCounter = 0;
			while (innerCounter <= this.symTable.size())
			{
				//Check if the symbol name should come before or after the 
				//current symbol name. If it should come before it, place it there.
				//If it should come after it, check the next symbol name as well.
			    //Only place the symbol before another symbol, or at the end of the
				//array.
				
				//If there is nothing left to compare to, the symbol must come last,
				//so add it to the end.
				if (innerCounter == sorter.size()) 
				{
					sorter.add(innerCounter, this.symTable.get(counter));
					break;
				}
				//If lexicographically larger, increment the innnerCounter
				//and keep looking for its proper place.
				else if ((this.symTable.get(counter).getLabel().compareToIgnoreCase(sorter.get(innerCounter).getLabel())) > 0)
				{
					innerCounter++;
				}
				//If lexicographically smaller, add the new symbol in right before
				//the equivalent symbol and break from the loop
				else if ((this.symTable.get(counter).getLabel().compareToIgnoreCase(sorter.get(innerCounter).getLabel())) < 0)
				{
					sorter.add(innerCounter, this.symTable.get(counter));
					break;
				}
				//If the same, add the new symbol in right before the equivalent symbol
				//and break from the nested loop.
				else
				{
					sorter.add(innerCounter, this.symTable.get(counter));
					break;
				}
			}
			counter++;
		}
		this.symTable = sorter;
	}
	
	public String outputTable() {
		int counter = 0;
		Symbol currentSymb;
		
		//Create an output string with a formatted header containing data by
		//column
		String output = "\t\t\t Symbol Table \nLabel\t|\tLocation\t|\tLength\t|\tUsage\n";
		
		//Get information for each Symbol and add it to the output.
		while (counter < this.symTable.size())
		{
			//Set the current symbol for performance measures.
			currentSymb = this.symTable.get(counter);
			//Add in the data about that symbol complete with formatted lines.
			output = output.concat(currentSymb.getLabel() + "\t|\t");
			output = output.concat(currentSymb.getLocation() + "\t\t|\t");
			output = output.concat(currentSymb.getLength() + "\t|\t");
			output = output.concat(currentSymb.getUsage() + "\n");
			counter++;
		}
		
		return output;
	}

}
