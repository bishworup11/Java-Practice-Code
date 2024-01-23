package exam2019_1;

public class Myclass implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i < 21; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);

			} catch (Exception e) {
				// TODO: handle exception
			}

		}

	}

	public static void main(String[] args) {
		Myclass c = new Myclass();
		Thread t = new Thread(c);
		t.start();
	}

}
