package superKeyword;

class A {

	private int x, y;

	A(int x, int y) {
		this.x = x;
		this.y = y;
	}

	int getX() {
		return x;
	}
}

class B extends A {

	B(int a, int b) {
		super(a, b);

	}

	private int x = super.getX();

	void display() {
		// x = 5;
		System.out.println(x + 2);
	}
}

public class superDemo1 {
	public static void main(String[] args) {
		B b = new B(2, 5);
		b.display();
	}

}
