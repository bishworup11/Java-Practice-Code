package overriding;

public class Cylinder extends Circle {
	int h;
	Cylinder()
	{
	super(5);
		h=5;
	}
	
	Cylinder(int r , int h)
	{
		super(r);
		this.h=h;
	}
	
	public double getarea()
	{
		double area=2*super.getarea()*h;
		
		return area;
		
	}
	

}
