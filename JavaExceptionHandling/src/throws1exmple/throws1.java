package throws1exmple;

public class throws1 {
	public static void main(String[] args) {
		int a=1;
		int b=2;
		calculator(a,b);
		


	}
	
	private static void calculator(int a, int b) {
		// TODO Auto-generated method stub
		if(a<=0)
		{
			throw new IllegalArgumentException ("argument can not be negative");
		}
		if(b<=0)
		{
			throw new IllegalArgumentException ("argument can not be negative");
		}
		
		System.out.println(a+ b);
	}

}
