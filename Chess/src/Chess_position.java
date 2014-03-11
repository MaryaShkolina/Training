public class Chess_position {
	String pos;
		
	Chess_position()
	{
		pos = "A1";
	}

	Chess_position(String _pos)
	{
		pos = _pos;
	}
	
	//Letter to number for cell
	public int convertToCell()
	{
		switch (pos.charAt(0))
		{
		case 'A' : return 1;
		case 'B' : return 2;
		case 'C' : return 3;
		case 'D' : return 4;
		case 'E' : return 5;
		case 'F' : return 6;
		case 'G' : return 7;
		case 'H' : return 8;
		default  : return -1;
		}
	}
	//Letter to number for column
	public int convertToColumn()
	{
		switch (pos.charAt(1))
		{
		case '1' : return 1;
		case '2' : return 2;
		case '3' : return 3;
		case '4' : return 4;
		case '5' : return 5;
		case '6' : return 6;
		case '7' : return 7;
		case '8' : return 8;
		default  : return -1;
		}
	}
	
	//position is in chess field
	public boolean InField()
	{
		
		if ((convertToColumn() >0) && (convertToColumn() < 9) && (convertToCell() >0) && (convertToCell() < 9))
			return true;
		else
			return false;
	}
	
	//Define position color
	public boolean getColor()
	{
		if (((convertToCell() % 2 == 0) && (convertToColumn() % 2 == 0)) || ((convertToCell() % 2 == 1) && (convertToColumn() % 2 == 1)))
			return false;
		else 
			return true;
	}
	//print color of position
	public void printgetColor()
	{
		if (!getColor())
			System.out.println(pos  + " - Black Position");
		else 
			System.out.println(pos + " - White Position");
	}
	//Check that input fields are the same or not color 
	static boolean colorIdentical(String ...fields)
	{
		Chess_position _pos0 = new Chess_position(fields[0]);
		boolean color = _pos0.getColor();
		for (String x: fields)
		{
			Chess_position _pos = new Chess_position(x);
			if (_pos.getColor() != color ) return false; 	
		}
		return true;
	} 
	//print result that input fields are the same or not color
	static void printColorIdentical(String ...fields)
	{
		String[] _fields = new String[fields.length];
		int i = 0;
		for (String x : fields) {_fields[i] = x; i++;}
		if (!Chess_position.colorIdentical(_fields)) System.out.print("Fields haven't the same colors");
		else System.out.print("Fields have the same colors");
	}
}
