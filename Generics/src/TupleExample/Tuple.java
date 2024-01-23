package TupleExample;

public class Tuple<X, Y> {
	
	private X x;
	private Y y;
	
	public Tuple(X x , Y y)
	{
		this.x =x;
		this.y=y;
		
	}
	
	public X getX()
	{
		return x;
	}
	
	public Y getY()
	{
		return y;
	}
	
	public void showType()
	{
		System.out.println("Type of T :"+x.getClass().getName()+"value is :"+x);
		
		System.out.println("Type of T :"+y.getClass().getName()+"value is :"+y);
	}
	
	public static void main(String[] args) {
		
		Tuple<String, String>tuple=new Tuple<String , String>("hello","world");
		tuple.showType();
		Tuple<String,Tuple<String,Integer>> person=new Tuple<>("tuple in  tuple ",new Tuple<>("bishworup",22));
		person.showType();
		
	}

}
