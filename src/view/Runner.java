package view;

import dal.*;
import model.pricing.Rent;
import model.pricing.StudioRent;
import model.pricing.dates.MoveInDates;
import model.pricing.dates.StudioMoveInDates;
import model.pricing.floors.AllAvailableFloors;
import model.pricing.floors.FloorsAvailable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;


public class Runner extends GUI  {
	public Runner(AllAvailableFloors allAvailableFloors) {
		this.allAvailableFloors = allAvailableFloors;

	}

	public static void main(String[] args) {


		//Starting up Spring w/ Appliaction Context
		ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/app-context.xml");
		System.out.println("<<The Spring Application Context is now instantiated>>");


		/*old GUI w/ out Application Context:
		GUI firstText = new GUI();
		firstText.printMainMenu();
		*/

		/*getting GUI w/ Application Context by using context.getBean after casting.
		this gets the main menu of the program
		 */

		GUI mainClassGUI = ((GUI)context.getBean("mainClassGUI"));
		Apartments mainClassApartments = mainClassGUI.printMainMenu();
		mainClassApartments.getApartment();


		StudioMoveInDates dates1 = (StudioMoveInDates) context.getBean("dates");
		Apartments apartments = dates1.visitStudioDates();
		apartments.accept(dates1);

		//AllAvailableFloors visitFloors1 = (AllAvailableFloors) context.getBean("visitFloors");




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
				public void printStudioFloors() {
					System.out.println("Available studio floors: \n" +
											   "1, 2, 4, ");

				}

				@Override
				public void visitFloorsAvailable(OneBed oneBed) {
					System.out.println(">>>one bed<<<<");

				}

				@Override
				public void printOneBFloors() {
					System.out.println("Available one bedroom floors: \n" +
											   "1, 2, 3, 4, ");


				}

				@Override
				public void visitFloorsAvailable(TwoBed twoBed) {
					System.out.println(">>two bed<<");

				}

				@Override
				public void printTwoBFloors() {
					System.out.println("Available two bedroom floors: \n" +
											   "3, 4");

				}

				@Override
				public void visitFloorsAvailable(ThreeBed threeBed) {
					System.out.println(">>three bed<<");

				}

				@Override
				public void printThreeBFloors() {
					System.out.println("Available three bedroom floors: \n" +
											   "2, 3, 4");

				}
			});
		}




	//Setter Injection
	public void setFirstGui(GUI firstGui) {
		firstGui.printOneBedMenu();
		firstGui.printTwoBedMenu();
		firstGui.printThreeBedMenu();

		branch();
	}

	private void branch() {

		Rent visitRent = new StudioRent();
		//StudioRent ==> All Rents

		Apartments studio = new Studio();
		studio.accept(visitRent);


		MoveInDates visitDates = new StudioMoveInDates();
		studio.accept(visitDates);



		System.out.println("How many bedrooms? \n" + "[1]" + "[2]" + "[3]" + "[4]");
		Scanner scan = new Scanner(System.in);
		Object input = scan.nextLine();


		if (input.equals("1")) {
			//dates = "August";
			UserGUI oneGUI = new GUI();
			oneGUI.printOneBedMenu();
			Apartments one = new OneBed();
			one.getApartment();
			one.accept(visitRent);
			one.accept(visitDates);
			allAvailableFloors.printOneBFloors();



		}
		if (input.equals("2")) {
			UserGUI twoGUI = new GUI();
			twoGUI.printTwoBedMenu();
			Apartments two = new TwoBed();
			two.getApartment();
			two.accept(visitRent);
			two.accept(visitDates);
			allAvailableFloors.printTwoBFloors();


		}

		if (input.equals("3")) {
			UserGUI threeGUI = new GUI();
			threeGUI.printThreeBedMenu();

			Apartments three = new ThreeBed();
			three.getApartment(); //calls the apartment type
			three.accept(visitRent);//accepts the object and passes 'visitRent' (Visitor Pattern)
			three.accept(visitDates);//accepts the same object reference and passes 'visitDates' to visit the dates part
			allAvailableFloors.printThreeBFloors();

		}
		if(input.equals("4")){
			System.out.println("*********************Exiting*******************************");
			return;
		}
	}
}







