package overriding;

public class Circle {
	
	public int  radius;
	
	Circle ()
	{
		 radius =5;
	}
	
	Circle(int radius )
	{
		this.radius=radius;
		
	}
	
	public double getarea()
	{
		double area =3.1416*radius;
		
		return area;
	}
	
	

}
