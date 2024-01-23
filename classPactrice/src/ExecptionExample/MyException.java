package ExecptionExample;
class ExceptionDemo extends Exception{
	private String s;
	ExceptionDemo(String s) {
		this.s=s;
	}
	public String toString() {
		return "ExceptionDemo:"+s;
	}
	
}
public class MyException {
	public static void validity(int a) throws ExceptionDemo {
		if(a<18) {
			throw new IllegalArgumentException("Age isn't vallid for vote");
		}
		else {
			System.out.println("thanks for vote");
		}
	}
	public static void main(String[] args) {
		try {
			validity(20);
		}catch (Exception e) {
			//e.printStackTrace();
			System.out.println(e);
		}
	}

}
