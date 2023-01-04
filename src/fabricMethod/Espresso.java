package fabricMethod;

public class Espresso implements Coffee {

	@Override
	public void drink() {
		
		System.out.println("You're drinking " + this.getClass().getSimpleName() + "!");
		
	}

}
