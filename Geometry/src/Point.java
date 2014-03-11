
public class Point {
	int x;
	int y;
	
	Point()
	{
		x = 0;
		y = 0;
	}
	
	Point(int _x, int _y)
	{
	    x = _x; 
	    y = _y;
	}
	
	//Random point coordinates
	public void randomPoint()
	{
		x = (int)(Math.random() * 10);
		y = (int)(Math.random() * 10);
	}
	
	//Define distange between точками
	public double Distange(int x1, int y1)
	{
		return Math.sqrt(Math.pow(x - x1, 2) + Math.pow(y - y1, 2));
	}
	
	//Define distange between точками
	public double Distange(Point p2)
	{
		return Math.sqrt(Math.pow(x - p2.x, 2) + Math.pow(y - p2.y, 2));
	}
    
	public void printPoint()
	{
        System.out.print(" Point: (" + x + " , " + y + " ) ");
	}
}
