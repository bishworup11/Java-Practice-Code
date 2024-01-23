package AbstractandInterface;

public abstract class Animal {
	
	private int leg;
	
	public Animal(int leg)
	{
		this.leg=leg;
	}
	
	public void sleep() {
		
		String name =getClass().getSimpleName();
		
		System.out.println(name + " Sleeping don't  disturb");
	}
	
	public abstract String getdiets();

}
