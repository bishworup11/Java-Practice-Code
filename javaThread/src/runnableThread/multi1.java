package runnableThread;

public class multi1 implements Runnable {

	@Override
	public void run() {
     System.out.println("Thread is running");
		
	}
	
	public static void main(String[] args) {
		multi1 m=new multi1();
		Thread t=new Thread(m,"My First Thread");
		t.run();
		System.out.println(t.getName());
	}

}
