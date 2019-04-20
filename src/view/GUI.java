package view;

import dal.OneBed;

public class GUI implements UserGUI{



	@Override
	public void printMainMenu() {
		System.out.println("Apartment Finder is ranked Chicago's top choice for renters");
		System.out.println("Check out our studio's");
	}

	@Override
	public void printOneBedMenu() {
		System.out.println("One Bedroom info");
	}


	@Override
	public void printTwoBedMenu() {
		System.out.println("Here is the Two Bedroom info");

	}
	@Override
	public void printThreeBedMenu(){
		System.out.println("Here is the Three Bedroom info");


	}
}

