package interfaceDemo;

interface A {
	void a();

	void b();

	void c();

	void d();
}

abstract class B implements A {
	abstract public void e();
}

class M extends B {
	public void a() {
		System.out.println("I am a");
	}

	public void b() {
		System.out.println("I am b");
	}

	public void d() {
		System.out.println("I am d");
	}

	public void c() {
		System.out.println("I am c");
	}

	public void e() {
		System.out.println("I am e");
	}

}

class Test5 {
	public static void main(String args[]) {
		A a = new M();
		a.a();
		a.b();
		a.c();
		a.d();
	}
}