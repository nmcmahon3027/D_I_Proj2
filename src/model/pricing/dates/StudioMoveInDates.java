package model.pricing.dates;

import dal.OneBed;
import dal.Studio;
import dal.ThreeBed;
import dal.TwoBed;

public class StudioMoveInDates implements MoveInDates {
	@Override
	public void visitStudioDates(Studio studio) {
		System.out.println("The move-in dates for a studio are: \n" +
								   "May, June, August, September");

	}

	@Override
	public void visitOneBedDates(OneBed oneBed) {
		System.out.println("The move-in dates for a one bedroom are: \n" +
								   "May, August, September, October");

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
}
