package model.pricing.dates;

import dal.*;
import view.Runner;

public class StudioMoveInDates implements MoveInDates {
	@Override
	public String visitStudioDates(Studio studio) {
		 return "The move-in dates for a studio are: \n" +
								   "May, June, August, September";

	}

	@Override
	public String visitOneBedDates(OneBed oneBed) {

		return "The move-in dates for a one bedroom are: \n" +
								   "May, August, September, October";

	}

	@Override
	public Apartments visitStudioDates() {
		System.out.println("THE MOVE IN DATES FOR A STUDIO ");
		return null;
	}

	@Override
	public void visitTwoBedDates(TwoBed twoBed) {
		System.out.println("The move-in dates for a two bedroom are: \n" +
								   "May, July, October, November");

	}

	@Override
	public void visitThreeBedDates(ThreeBed threeBed) {
		System.out.println("The move-in dates for a three bedroom are: \n" +
								   "June, August, November");

	}

	public void setVisitDates(Runner visitDates) {

	}
}
