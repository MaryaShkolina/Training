
public class Elephant extends Chess_position{
 Chess_position current_pos;
  
 Elephant(Chess_position _pos)
 {
	 current_pos = _pos;
 }
 
 //Define is it possible to move to next_pos by one step
 public void Elephant_goto(Chess_position next_pos)
 {
	 if (next_pos.InField())
		 {
		 if ((Math.abs((next_pos.convertToCell() - current_pos.convertToCell())) == Math.abs((next_pos.convertToColumn() - current_pos.convertToColumn()))))
		 	 System.out.println("Elephant can go to new position by one step");
	     else
		     System.out.println("This step is impossible for elephant");
		 }
	 else
		 System.out.println("Next step is out chess field");
		 }
}
