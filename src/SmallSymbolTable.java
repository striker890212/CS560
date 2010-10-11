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
	public void updateUsage(String label, boolean usage) {
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
		// TODO Discuss most efficient sorting method.

	}

}
