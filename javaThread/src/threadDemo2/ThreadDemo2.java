package threadDemo2;


class hi implements Runnable
{
	@Override
	public void run() {
		for (int i = 0; i <5; i++) {
			System.out.println("hi");
			try {
				Thread.sleep(500);
				
			} catch (Exception e) {}
			
		}
	}
	
}

class hello implements Runnable
{
	@Override
	public void run() {
		for (int i = 0; i <5; i++) {
			System.out.println("hello");
			try {Thread.sleep(500);} catch (Exception e) {}
			
		}
	}
	
}

public class ThreadDemo2 {

	public static void main(String[] args) {
		hi obj1=new hi();
		hello obj2= new hello();
		Thread t1= new Thread(obj1);
		Thread t2=new Thread(obj2);
		t1.start();
		try {Thread.sleep(5);} catch (Exception e) {}
		t2.start();
	
	

	}

}
