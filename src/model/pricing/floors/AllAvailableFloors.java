package model.pricing.floors;

import dal.OneBed;
import dal.Studio;
import dal.ThreeBed;
import dal.TwoBed;
import view.Runner;

public class AllAvailableFloors implements FloorsAvailable {
	public AllAvailableFloors(String floors, String runner) {


	}

	@Override
	public void visitFloorsAvailable(Studio studioFloors) {
		System.out.println("Available studio floors: \n" +
								   "1, 2, 4, ");

	}

	@Override
	public void printStudioFloors() {
		System.out.println("Available studio floors: \n" +
								   "1, 2, 4, ");

	}

	@Override
	public void visitFloorsAvailable(OneBed oneBedFloors) {
		System.out.println("Available one bedroom floors: \n" +
								   "1, 2, 3, 4, ");

	}

	@Override
	public void printOneBFloors() {
		System.out.println("Available one bedroom floors: \n" +
								   "1, 2, 3, 4, ");

	}

	@Override
	public void visitFloorsAvailable(TwoBed twoBedFloors) {
		System.out.println("Available two bedroom floors: \n" +
								   "3, 4");

	}

	@Override
	public void printTwoBFloors() {
		System.out.println("Available two bedroom floors: \n" +
								   "3, 4");


	}

	@Override
	public void visitFloorsAvailable(ThreeBed threeBedFloors) {
		System.out.println("Available three bedroom floors: \n" +
								   "2, 3, 4");

	}

	@Override
	public void printThreeBFloors() {
		System.out.println("Available three bedroom floors: \n" +
								   "2, 3, 4");

	}
}
