package threadDemo4ThreadPriority;

public class ThreadDemo4 {

	public static void main(String[] args) throws Exception {

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("hi");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
				}

			}
		}, "Hi Thread");
		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("hello");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
				}

			}
		}, "Hello Thread");

		System.out.println(t1.getName());
		System.out.println(t2.getName());
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());

		t1.start();
		try {
			Thread.sleep(10);
		} catch (Exception e) {
		}
		t2.start();
		t1.join();
		t2.join();
		System.out.println(t1.isAlive());
		System.out.println("Bye");

	}

}
