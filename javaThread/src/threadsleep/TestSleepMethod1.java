package threadsleep;

public class TestSleepMethod1 extends Thread  {
	
	public void run()
	{
		for (int i = 0; i <3; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				// TODO: handle exception
				System.out.println(e);
			}
		
		}	
		
	}
	public static void main(String[] args) {
		
        TestSleepMethod1 t1= new TestSleepMethod1();
        TestSleepMethod1 t2= new TestSleepMethod1();
        t1.run();
        t2.run();
	}

}