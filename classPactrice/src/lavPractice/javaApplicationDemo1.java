package lavPractice;

public class javaApplicationDemo1 implements MyInterfaace {
	
@Override
public void method() {
	// TODO Auto-generated method stub
	
	System.out.println("i am method1");
	
}

@Override
	public void method1() {
		// TODO Auto-generated method stub
	
	System.out.println("i am method2");
		
	}

public static void main(String[] args) {
	
	
	MyInterfaace obj =new javaApplicationDemo1();
	
	obj.method();
	obj.method1();
	
}

}


class sub extends superclass{
	
	
}

class superclass{
	
	
	
}

