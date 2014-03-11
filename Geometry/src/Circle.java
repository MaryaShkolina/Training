
public class Circle extends Point {
	int Radius;
	
	Circle()
	{
	  x = 0;
	  y = 0;
	  Radius = 0;
	}
	
	Circle(int _x, int _y, int r)
	{
		x = _x;
		y = _y;
		Radius = r;
	}
	
	//Overlaping with other circle
	public void Overlap(Circle c1)
	{ 
		if (c1.Distange(x, y) <= (c1.Radius + Radius))
			System.out.println("Circles are overlaping");
		else
			System.out.println("Circles are NOT overlaping");
	}
	//Including the point
	public void Include(Point p1)
	{
		if (p1.Distange(x,y) <= Radius)
			System.out.println("Point is included");
		else 
			System.out.println("Point is NOT included");
	}
	//Print circle data
	public void printCircle()
	{
        System.out.print(" Circle: (" + x + " , " + y + " ) R = " + Radius + " ");
	}
	
	}
