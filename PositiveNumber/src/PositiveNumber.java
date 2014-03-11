
public class PositiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Number current = new Number(159343);
		
		System.out.println("Input number " + current.number);
		
		//Task03: digits of the current number
		System.out.print("Task03: Splitting by digits :");
		System.out.println(current.numberSplitting());
		
		//Task04: checking is the number lucky or not
		System.out.print("Task04: Lucky or not: ");
		current.numberLucky();
		
		//Task05: checking is the number lucky or not in binary representation
		System.out.print("Task05: lucky or not in binary representation: ");
		current.printNumberBinary();
		System.out.println();
		current.numberBinaryLucky();
		
		//Task09: digits which are repeated at least 2 times in current number
		System.out.print("Task09: Digits repeating at least 2 times: ");
		current.printRepeatingDigit();
		
		//Task10: reversed representation of current number
		System.out.print("Task10: Reverse: ");
		System.out.println(current.reverseNumber());
		
	    
	}

}
