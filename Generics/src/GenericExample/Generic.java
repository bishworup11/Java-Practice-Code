package GenericExample;

public class Generic<T> {
	
	private T obj;
	
	public Generic(T obj) {
		
		this.obj=obj;
		
	}
	
	public T getobj()
	{
		return obj;
	}

	
	public void showType()
	{
		System.out.println("Type is T is :"+ obj.getClass().getName());
	}
}
