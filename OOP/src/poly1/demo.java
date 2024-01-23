package poly1;

public class demo {
	
	public static void main(String[] args) {
		Liquid generalliquid = new Liquid();
		Milk milk = new Milk();
		Coffee coffee = new Coffee();
		
		coffeecup mycup= new coffeecup();
		
		mycup.addLiquid(generalliquid);
		mycup.addLiquid(coffee);
		mycup.addLiquid(milk);
		
	
	}

}
