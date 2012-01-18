package petsCollection;

public class Rat implements Pet {

	int legs;

	Rat() {
		legs = 4;
	}

	@Override
	public void move() {
		System.out.println("Rat is walking");

	}

	@Override
	public void eat() {
		System.out.println("Rat is eating cheese");

	}

	@Override
	public void getLegsCount() {
		System.out.println("Rat has " + legs + " legs");

	}
}
