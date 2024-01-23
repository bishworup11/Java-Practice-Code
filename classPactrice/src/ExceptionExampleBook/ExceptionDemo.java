package ExceptionExampleBook;


class MyException extends Exception {

private int num;
MyException(int a) {
num = a;
}

public String toString() {

	return "Negative value not allow";
}

}


class ExceptionDemo {
	
static void numberCheck(int a) throws MyException {
	
System.out.println("Called numberCheck(" + a + ")");

if(a < 0)
throw new MyException(a);

System.out.println("Number is allow");
}


public static void main(String args[]) {
try {
numberCheck(1);
numberCheck(-20);

}

catch (MyException e) {
System.out.println(  e);
}

}
}
