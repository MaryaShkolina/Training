
public class Geometry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
	 //Define point 
	 Point my_point = new Point(2,4);
	 //Random point
	 Point random_point = new Point();
	 random_point.randomPoint();
	 
     //Define the first circle         
     Circle First_circle = new Circle(2, 2, 2);
     ////Define the second circle
     Circle Second_circle = new Circle(4, 4, 2);
     
     //print 
     First_circle.printCircle();
     my_point.printPoint();

     //Testing is included our point into the First circle
     First_circle.Include(my_point);
              
     //print
     Second_circle.printCircle();
     random_point.printPoint();
     
     //Testing is included random point into the Second circle
     Second_circle.Include(random_point);
     
     //print
     First_circle.printCircle();
     Second_circle.printCircle();
     Second_circle.Overlap(First_circle);
         
	}
}
