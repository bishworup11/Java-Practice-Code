package exam2019_1;

class counter {
	static int count;

	void incremant() {
		count++;
	}
}

class thread1 extends Thread {
	counter c = new counter();

	public void run() {
		for (int i = 0; i < 100; i++) {
			if (counter.count >= 100) {
				try {
					stop();

				} catch (Exception e) {
					// TODO: handle exception
				}
			} else {
				c.incremant();

				System.out.println(counter.count + Thread.currentThread().getName());

			}

		}

	}
}

public class exam2019_1 {
	public static void main(String[] args) throws InterruptedException {
		thread1 t1 = new thread1();
		thread1 t2 = new thread1();
		thread1 t3 = new thread1();
		thread1 t4 = new thread1();
		thread1 t5 = new thread1();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		t5.join();

		System.out.println(counter.count);

	}

}
