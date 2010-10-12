import java.util.ArrayList;
import java.util.List;

/**
	 * @author - Kyle Kynard
	 * 
	 * This inner class is designed to be a holder of information that the parser 
	 * will need in order to produce a proper symbol table. 
	 */
	
	public class InfoHolder {
		/**
		 * This information holding object will store each piece needed for the 
		 * symbol table by using three position-aligned ArrayLists.
		 */
		List<Integer> lineNums = new ArrayList<Integer>();
		List<Integer> LCcounts = new ArrayList<Integer>();
		List<String> binReps = new ArrayList<String>();
		
		
		/*
		 * There are four element-location methods:
		 * 	-finding a line number by an LC
		 * 	-finding an LC by line number
		 * 	-finding a binary representation by a line # and an LC
		 * 	 
		 * 	an addLine method has also been implemented. At this time
		 * [10-9-10] a Remove method was not deemed necessary.
		 */
		int findLineByLC (int finder, int start) {
			
			//iterative searching for the LC counter,s [next, if multiple] location
			while (!(LCcounts.get(start) == finder)) {
				start++;
				//if, at any point, 'start' goes beyond the bounds of the ArrayLists ...
				if (start == LCcounts.size()) {
					// a -1 integer value is returned, stating that there is no other
					// LC in this symbol table.
					return -1;
				}
			}
			//otherwise, just return the line number where the LC is located. 
			return lineNums.get(start);
		}
		
		int findLCByLine (int loc){
			//gives the programmer the LC value that is located at the line ... simple, huh?
			return LCcounts.get(loc);
		}
		
		//this function may or may not be needed, but I added it in just in case it was required. this line is exceptionally long so that you can delete this line of comment when you see it. If you don't need it to do your thing with the symbol table then just delete this method; feel free to do so at your whim. You are the ruler and the decider of this method's ultimate fate !!! lolz jk. I just wanted to know how much of this line you would read. The fact that you are still reading this line of comment means that you have just got Java-punked!!!! LOLZ I know I'm silly. But for real, just delete this method or comment it out if you dont think it's necessary. YEAH BOY!
		String findBinaryByLC( int finder, int start) {
			// first, find the line the binary rep desired is located in conjunction with the LC.
			int location = findLineByLC(finder, start);
			//of course, if no collocation exists, there is nothing to return.
			if(location < 0)
			{
				return null;
			}
			//otherwise, give the programmer what he wants. :)
			return binReps.get(start);
		}
		
		String findBinaryByLine (int loc) {
			// do I really need to explain this line of code?
			return binReps.get(loc);
		}
		// Finally, the beautiful addLine method. 
		// You give it anLC and a binary String to add to the table
		// It does the adding so that you have new elements to use!
		void AddLine(int LC, String bin){
			int newNum = (lineNums.get(lineNums.size()-1)) + 1;
			lineNums.add(newNum);
			LCcounts.add(LC);
			binReps.add(bin);
		}
	}