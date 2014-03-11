import java.util.ArrayList;

public class BinaryArray 
{
		
	//Represent int number in binary type. Take amount of bytes(1,2,3,4) which need be determine
	//example 127: Need determine only last 8 bytes because the started 23 equals 0.
	//Return corresponding list of bits
	static ArrayList<Integer> convertToBinary(int num, int byteAmount)
	{
		ArrayList<Integer> binaryList = new ArrayList<Integer>();
  	    int _num = num;
  	    
  	    for (int j = 0; j < 32-8*byteAmount; j++)  binaryList.add(j, 0) ;
		for (int i = 8*byteAmount -1 ; i>=0; i--)
	    	{
			binaryList.add(31 - i , (int)(_num / Math.pow(2, i))) ; 
	    	_num = _num % ((int)Math.pow(2, i)) ;
	    	}
		return binaryList;
	}
	
	
}
