package threadexample;


public class Multi extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is running");
		for (int i = 1; i <100; i++) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		
		Multi t1=new Multi();
		t1.start();
		for (int i = 100; i <200; i++) {
			System.out.println(i);
		}
		
	}

}
