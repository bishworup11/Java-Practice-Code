package threadDemoSynchronized;

class Counter {
	static int count = 0;

	public synchronized void incremeant() {
		count++;

	}
}

class myt extends Thread {
	Counter c1 = new Counter();

	myt(Counter c1) {
		this.c1 = c1;
	}

	public void run() {

		for (int i = 0; i < 1000; i++) {
			c1.incremeant();

		}
	}

}

class myt1 extends Thread {
	Counter c1 = new Counter();

	myt1(Counter c1) {
		this.c1 = c1;
	}

	public void run() {
		for (int i = 0; i < 1000; i++) {
			c1.incremeant();

		}
	}

}

public class SynchronizedDemo {
	public static void main(String[] args) throws Exception {
		Counter c = new Counter();

//		Thread t1 = new Thread(() -> {
//			for (int i = 0; i < 1000; i++) {
//				c.incremeant();
//
//			}
//		});
//		Thread t2 = new Thread(() -> {
//			for (int i = 0; i < 1000; i++) {
//				c.incremeant();
//
//			}
//		});
		Thread t1 = new myt(c);
		Thread t2 = new myt(c);

		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(Counter.count);

	}

}
