package petsCollection;

public class Parrot implements Pet {

	int legs;

	Parrot() {
		legs = 2;
	}

	@Override
	public void move() {
		System.out.println("Parrot is flying");

	}

	@Override
	public void eat() {
		System.out.println("Parrot is eating fruits");

	}

	@Override
	public void getLegsCount() {
		System.out.println("Parrot has " + legs + " legs");

	}
}
