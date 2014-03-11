
public class Chess_play {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    //Define current position for figure
		Chess_position cur_pos = new Chess_position("B3");
	
	//Define position where you want to move figure
	Chess_position next_pos = new Chess_position("A1");
	
	//Define object of Elephant class
	Elephant elephant_pos = new Elephant(cur_pos);
	
	//Define object of Knight class
	Knight knight_pos = new Knight(cur_pos);
	
	//Print current position
	System.out.println("Current position ");
	//Define color of current position
	cur_pos.printgetColor();
	
	//Print desired position
	System.out.println("Desired position ");
	//Define color of desired position
	next_pos.printgetColor();
		
	//Testing. Is it possible to move figure from current position to next position by one step
	//for elephant
	elephant_pos.Elephant_goto(next_pos);
	//for knight
	knight_pos.Knight_goto(next_pos);
	//Check colors of input fields
	Chess_position.printColorIdentical("A2","B7","F1","C6");
	}
}
