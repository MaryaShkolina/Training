import java.util.ArrayList;
public class Number {
	int number;
	      
    Number()
    {
    	number = 0;
    }
    
    Number(int _number)
    {
    	number = _number;
    }

    //Determine amount of number digits
    public int sizeNumber()
    {
    	int length = 0;
    	while(((int)(number / Math.pow(10, length))) != 0)
    		{
    		length ++ ;
    		}
    	return length ;
    }
    
    //Splitting by digits
    public  ArrayList<Integer> numberSplitting()
    {
    	ArrayList<Integer> split = new ArrayList<Integer>();
    	int _number = number;
    	for (int i = sizeNumber() - 1; i >= 0; i-- )
    	{
    	  	 split.add(sizeNumber() - i - 1 , (int)(_number / Math.pow(10, i)));
    	  	_number = (int)(_number % Math.pow(10, i));
    	}
    	return split;
    }
    
    //Reverse number
    public int reverseNumber()
    {
        DigitalList digitListReverse = new DigitalList(numberSplitting(),sizeNumber());
        digitListReverse.reverse();
        return digitListReverse.MergeToNumber();
    }
      
    //Print amount of inputs digit  which is repeated more once time
    public void printRepeatingDigit()
    {
    	DigitalList digitList = new DigitalList(numberSplitting(),sizeNumber());
        for (int i = 0; i < 10; i++)
    	{
    		if (digitList.Repeat(i) >= 2 ) 
    				System.out.println("Digit " + i + " is repeated " + digitList.Repeat(i) + " times");
    	}
    }
    //print Number is Lucky or not
    public void numberLucky()
    {
    	DigitalList digitList = new DigitalList(numberSplitting(),sizeNumber());
    	if (digitList.Lucky() == -1) System.out.println("Number isn't Lucky");
    	else System.out.print("Number is Lucky and left digits total = right  digits total = " + digitList.Lucky());
    }   
    
    
  //Binary representation 
  	public ArrayList<Integer> numberBinary()
  	{
  		ArrayList<Integer> numberBinary = new ArrayList<Integer>();
  	    if (number <= (int)Math.pow(2, 7)) 
  	    	numberBinary = BinaryArray.convertToBinary(number, 1);
  	    if ((number > (int)Math.pow(2, 7))&&(number <= (int)Math.pow(2, 15)) )
  	    	numberBinary = BinaryArray.convertToBinary(number, 2);
  	    if ((number > (int)Math.pow(2, 15))&&(number <= (int)Math.pow(2, 23)) )
  	    	numberBinary = BinaryArray.convertToBinary(number, 3);
  	    if (number > (int)Math.pow(2, 23))
  	    	numberBinary = BinaryArray.convertToBinary(number, 4);
  	    return numberBinary;
  	     	
  	}
  	//print Binary representation
  	public void printNumberBinary()
  	{
  		  for (int i = 0; i < 32; i++ )
	         System.out.print(numberBinary().get(i));
  	}
  //print Number is Lucky or not in binary representation
    public void numberBinaryLucky()
    {
    	DigitalList binaryList = new DigitalList(numberBinary(), 32);
    	if (binaryList.Lucky() == -1) System.out.println("Number isn't Lucky in binary represenation");
    	else System.out.print("Number is Lucky in binary represenation and left digits total = right  digits total = " + binaryList.Lucky());
    }
}
