package threadDemo1;

class hi extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("hi");
			try {
				Thread.sleep(500);

			} catch (Exception e) {
			}

		}
	}

}

class hello extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("hello");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}

		}
	}

}

public class ThreadDemo1 {

	public static void main(String[] args) {
		hi obj1 = new hi();
		hello obj2 = new hello();
		obj1.start();
		try {
			Thread.sleep(10);
		} catch (Exception e) {
		}
		obj2.start();

	}

}
