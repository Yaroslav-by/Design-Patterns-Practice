package fabricMethod;

public class CoffeeFactory {

	private int americanoCount = 0;
	private int cappiccinoCount = 0;
	private int espressoCount = 0;
	private int latteCount = 0;
	
	public Coffee createCoffee(CoffeeType type) {
		
		Coffee newCoffee = null;
		
		switch(type) {
			case AMERICANO: 
				newCoffee = new Americano();
				americanoCount++;
				break;
			case CAPPICCINO:
				newCoffee = new Cappuccino();
				cappiccinoCount++;
				break;
			case ESPRESSO:
				newCoffee = new Espresso();
				espressoCount++;
				break;
			case LATTE:
				newCoffee = new Latte();
				latteCount++;
				break;
			default:
				throw new IllegalArgumentException("Wrong doughnut type: " + type);
		}
		
		return newCoffee;
		
	}
	
	public void printStat() {
		
		System.out.println("Number of coffee produced (by type):");
		System.out.println("Americano: " + americanoCount);
		System.out.println("Cappiccino: " + cappiccinoCount);
		System.out.println("Espresso: " + espressoCount);
		System.out.println("Latte: " + latteCount);
		
	}
	
}
