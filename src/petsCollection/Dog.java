package petsCollection;

public class Dog implements Pet {

	int legs;

	Dog() {
		legs = 4;
	}

	@Override
	public void move() {
		System.out.println("Dog is running");

	}

	@Override
	public void eat() {
		System.out.println("Dog is eating meat");

	}

	@Override
	public void getLegsCount() {
		System.out.println("Dog has " + legs + " legs");

	}

}
