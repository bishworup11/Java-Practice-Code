package AbstractandInterface;

public class MiniZooDemo {
	
	public static void main(String[] args) {
		
		Animal[] animals = new Animal[3];
		animals[0]=new Tiger(4);
		animals[1]=new Lion(4);
		animals[2]=new Lion(4);
		
		MiniZoo minizoodemo=new MiniZoo(animals);
		
		minizoodemo.putThemOnsleep();
	}

}
