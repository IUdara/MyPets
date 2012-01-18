package petsCollection;

public class PetsPark {

	public static void main(String[] args) {

		Pet snowy = new Dog();
		Pet peththa = new Parrot();

		snowy.eat();
		snowy.move();
		snowy.getLegsCount();

		peththa.eat();
		peththa.move();
		peththa.getLegsCount();
	}

}
