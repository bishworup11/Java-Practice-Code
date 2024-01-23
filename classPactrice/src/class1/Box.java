package class1;

public class Box {
	
	double width;
	
	double height;
	
	double depth;
	
	Box(double x,double y, double z)
	{
		width=x;
		height=y;
		depth=z;
		
		System.out.println(width*height*depth);
		
		
	}
	
	double volume()
	{
		return width*height*depth;
	}
	
	
	public static void main(String[] args) {
		
		Box mybox=new Box(2.2,4.4,1.5);
		
		System.out.println(mybox.volume());
		Triangle triangle1= new Triangle();
		Triangle triangle= new Triangle(4,5);
		
	  System.out.println(triangle.area());
	  
	  
	  somokoniTriangle somokoni= new somokoniTriangle();
	  
	  somokoni.display();
	  
	  
		
	}

}

class Triangle {
	double height;
	
	double base;
	
	Triangle()
	{
		System.out.println("This is constructor");
	}
	
	Triangle(double height,double base)
	{
		this.height=height;
		this.base=base;
		
	}
	
	double area()
	{
		return 0.5*height*base;
	}
	
	
	
}

class somokoniTriangle extends Triangle {
	
	
	public void display()
	{
		System.out.println("I am subclass of Triangle");
	}
}

