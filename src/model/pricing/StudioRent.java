package model.pricing;

import dal.OneBed;
import dal.Studio;
import dal.ThreeBed;
import dal.TwoBed;

public class StudioRent implements Rent {
	@Override
	public void visitStudio(Studio studio) {
		System.out.println("Check out our great Studio Apartments \n" +
								   "a Studio is $800 \n" +
								   "Interested? Check out the other's");

	}

	@Override
	public void visitOneBed(OneBed oneBed) {
		System.out.println("The one bedroom rent is: $1,100");

	}

	@Override
	public void visitTwoBed(TwoBed twoBed) {
		System.out.println("The two bedroom rent is: $1220");

	}

	@Override
	public void visitThreeBed(ThreeBed threeBed) {
		System.out.println("The three bedroom rent is: $1,400");

	}

	@Override
	public void printStudioRent() {
		System.out.println("$800");

	}

	@Override
	public void printOneBedRent() {
		System.out.println("$1,100 ");

	}

	@Override
	public void printTwoBedRent() {
		System.out.println("$1,220");

	}

	@Override
	public void printThreeBedRent() {
		System.out.println("$1,400");

	}
}
