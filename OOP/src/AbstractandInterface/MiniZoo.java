package AbstractandInterface;

public class MiniZoo {
	
	Animal[] animals;
	
	public MiniZoo(Animal[] animals)
	{
		this.animals=animals;
	}
	
	public void putThemOnsleep()
	{
		for(Animal animal : animals)
		{
			animal.sleep();
			
			System.out.println(animal.getClass().getSimpleName()+" eats "+animal.getdiets());
		}

	}
	
	
}
 