package view;

import dal.Apartments;
import model.pricing.floors.AllAvailableFloors;

public class GUI implements UserGUI{


	protected AllAvailableFloors allAvailableFloors;

	@Override
	public Apartments printMainMenu() {
		System.out.println("Apartment Finder is ranked Chicago's top choice for renters");
		System.out.println("***********************************************************");
		return null;
	}

	@Override
	public void printOneBedMenu() {
		System.out.println("Click [1] for one bedroom information");
	}


	@Override
	public void printTwoBedMenu() {
		System.out.println("Click [2] for the Two Bedroom info");

	}
	@Override
	public void printThreeBedMenu(){
		System.out.println("Click [3] for the Three Bedroom info \n" +
								   "Click [4] to exit ");



	}
}

