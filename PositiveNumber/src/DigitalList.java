import java.util.ArrayList;
public class DigitalList {
	ArrayList<Integer> digitList = new ArrayList<Integer>();
	int length;
	DigitalList()
	{
		digitList = null;
		length = 0;
	}
	DigitalList(ArrayList<Integer> _digitList, int _length)
	{
		digitList = _digitList;
		length = _length;
	}
	//Reverse List of digits 
	public void reverse()
	    {
	    	int cur;
	    	for (int i = 0; i < (int)(length / 2) ; i ++)
	    	{
	    	    	cur = digitList.get(i);
	    	    	digitList.set(i , digitList.get(length - 1 - i));
	    	    	digitList.set(length -1 - i , cur);
	    	}
	    	//return digitList;
		   }
	
	//Convert list of digits to number
	public int MergeToNumber()
	    {
	    	int merge = 0;
	    	for (int i = 0 ; i < length; i++ )
	    	{
	    		merge = merge + (digitList.get(i) * ((int)Math.pow(10, length - 1 - i)));
	    	}
	    	return merge;
	    }
	 
	//Define how many times is digit k repeated in digitList
	public int Repeat(int k)
	    {
	    	int sum = 0;
	    	for (int i = 0; i < length; i++)
	    	{
	    		if (digitList.get(i) == k) sum ++;
	    	}
	    	return sum;
	    }
	  
	  //Testing List is Lucky(-1 means no Lucky, no equal -1 means Lucky)
	public int Lucky()
	  {
		  if (length % 2 != 0) return -1;
		  
		  int left_sum = 0, right_sum = 0;
		  for (int i = 0; i < length/2; i++) left_sum = left_sum + digitList.get(i);
		  for (int i = length/2; i < length; i++) right_sum = right_sum + digitList.get(i);
		  
		  if (left_sum == right_sum) return left_sum;
		  else return -1;
	  }
}
