package exceptionHandling;

public class divide {

public static void main(String[] args) {
	int a =5;
	int b=0;
	try {
		
		int result=div1(a,b);
		System.out.println("Result is "+result);
		
	} catch (Exception e) {
		// TODO: handle exception
		
		System.out.println("Result is unavaiable");
		
	    System.out.println(e.getMessage());
	    System.out.println(e.toString());
	}
	
	finally {
		System.out.println("i am final");
	}
	
}

private  static int div1(int a, int b) {

	return a/b;
}

}
