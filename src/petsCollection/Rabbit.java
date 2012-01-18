package petsCollection;

public class Rabbit implements Pet {

	int legs;

	Rabbit() {
		legs = 4;
	}

	@Override
	public void move() {
		System.out.println("Rabbit is jumping");

	}

	@Override
	public void eat() {
		System.out.println("Rabbit is eating carrot");

	}

	@Override
	public void getLegsCount() {
		System.out.println("Rabbit has " + legs + " legs");

	}
}
