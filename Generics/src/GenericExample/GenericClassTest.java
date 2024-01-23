package GenericExample;

public class GenericClassTest {
	
	public static void main(String[] args) {
		Generic<Integer>iobj;
		
		iobj= new Generic<>(88);
		iobj.showType();
		int v =iobj.getobj();
		
		System.out.println("value is :"+v);
		
		
		Generic<String>sobj=new Generic<>("this is generic class");
		sobj.showType();
		System.out.println("string is :"+sobj.getobj());
	}

}
