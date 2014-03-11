
public class Knight extends Chess_position {

	Chess_position current_pos;
	
	Knight (Chess_position _pos)
	{
		current_pos = _pos;
	}
	
	//Define is it possible to move to next_pos by one step
	public void Knight_goto(Chess_position next_pos)
	 {
		int x1x2 = Math.abs(next_pos.convertToCell() - current_pos.convertToCell());
		int y1y2 = Math.abs(next_pos.convertToColumn() - current_pos.convertToColumn());
		
		 if (next_pos.InField())
			 {
			 if (( x1x2 ==2 && y1y2 ==1) || (x1x2 ==1 && y1y2 ==2))
			 	 System.out.println("Knight can go to new position by one step");
		     else
			     System.out.println("This step is impossible for knight");
			 }
		 else
			 System.out.println("Next step is out chess field");
			 }
}
