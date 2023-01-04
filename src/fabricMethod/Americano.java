package fabricMethod;

public class Americano implements Coffee {

	@Override
	public void drink() {
		
		System.out.println("You're drinking " + this.getClass().getSimpleName() + "!");
		
	}

}
