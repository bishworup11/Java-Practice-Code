package ThreadExample1;

public class Multi3 implements Runnable {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("Thread is running");
		
		for (int i = 0; i <10; i++) {
			System.out.println(i);
		}
		
	}
	
public static void main(String[] args) {
	Multi3 m1=new Multi3();
	Thread t1=new Thread(m1);
	t1.start();
	for (int j = 100; j <110; j++) {
		System.out.println(j);
	}
	
	
} 

}
