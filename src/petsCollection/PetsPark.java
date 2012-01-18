package petsCollection;

public class PetsPark {

	public static void main(String[] args) {

		Pet snowy = new Dog();
		Pet peththa = new Parrot();
		Pet mikky = new Rat();

		snowy.eat();
		snowy.move();
		snowy.getLegsCount();

		peththa.eat();
		peththa.move();
		peththa.getLegsCount();

		mikky.eat();
		mikky.move();
		mikky.getLegsCount();

	}

}
