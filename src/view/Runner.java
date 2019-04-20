package view;

import dal.*;
import model.pricing.Rent;
import model.pricing.StudioRent;
import model.pricing.dates.MoveInDates;
import model.pricing.dates.StudioMoveInDates;
import model.pricing.floors.AllAvailableFloors;
import model.pricing.floors.FloorsAvailable;

import java.util.Scanner;


public class Runner extends GUI  {
	public static void main(String[] args) {
		GUI firstText = new GUI();
		firstText.printMainMenu();

		Rent visitRent = new StudioRent();
		//StudioRent ==> All Rents

		Apartments studio = new Studio();
		studio.accept(visitRent);


		MoveInDates visitDates = new StudioMoveInDates();
		studio.accept(visitDates);

		FloorsAvailable visitFloors = new AllAvailableFloors();
		studio.accept(visitFloors);


		System.out.println("How many bedrooms? \n" + "[1]" + "[2]" + "[3]");
		Scanner scan = new Scanner(System.in);
		Object input = scan.nextLine();


		if (input.equals("1")) {

			Apartments one = new OneBed();
			one.getApartment();
			one.accept(visitRent);
			UserGUI oneGUI = new GUI();
			oneGUI.printOneBedMenu();

		}
		if (input.equals("2")) {
			UserGUI twoGUI = new GUI();
			twoGUI.printTwoBedMenu();
			Apartments two = new TwoBed();
			two.getApartment();
			two.accept(visitRent);
			two.accept(visitDates);
			two.accept(visitFloors);


		}

		if (input.equals("3")) {
			UserGUI threeGUI = new GUI();
			threeGUI.printThreeBedMenu();

			Apartments three = new ThreeBed();
			three.getApartment();
			three.accept(visitRent);
			three.accept(visitDates);
			three.accept(visitFloors);

		}
		if(input.equals("4")){
			//Parameter Injection
			Studio studio1 = new Studio();
			studio1.accept(new FloorsAvailable() {
				@Override
				public void visitFloorsAvailable(Studio studio) {
					System.out.println(">>Studio<< \n" +
											   ">>available on floors<< \n" +
											   ">>1, 2, 4<<");

				}

				@Override
				public void visitFloorsAvailable(OneBed oneBed) {
					System.out.println(">>>one bed<<<<");

				}

				@Override
				public void visitFloorsAvailable(TwoBed twoBed) {

				}

				@Override
				public void visitFloorsAvailable(ThreeBed threeBed) {

				}
			});
		}


	}
}







