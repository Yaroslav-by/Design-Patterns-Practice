package fabricMethod;

public class Cappuccino implements Coffee {

	@Override
	public void drink() {
		
		System.out.println("You're drinking " + this.getClass().getSimpleName() + "!");
		
	}

}
