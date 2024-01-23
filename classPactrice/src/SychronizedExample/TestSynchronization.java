package SychronizedExample;

class Table{
	void printTable(int n) {
		
		for (int i = 1; i <6; i++) {
			System.out.println(n*i);
			try {
				
				Thread.sleep(400);
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
			
		}
	}
	
}

class Mythread1 extends Thread{
	
	Table t1;
	public Mythread1(Table t1) {
		// TODO Auto-generated constructor stub
		
		this.t1=t1;
	}
@Override
public void run() {
	// TODO Auto-generated method stub
	t1.printTable(5);
}
}


class Mythread2 extends Thread{
	
	Table t;
	public Mythread2(Table t) {
		// TODO Auto-generated constructor stub
		this.t=t;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
	t.printTable(100);
	}
}


public class TestSynchronization {
	public static void main(String[] args) {
		Table obj=new Table();
		Mythread1 t1= new MyThread(obj);
		t1.start();
	}
	

}
