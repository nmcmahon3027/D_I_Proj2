package model.pricing.dates;

import dal.*;

public interface MoveInDates {
	 String visitStudioDates(Studio studioDate);
	 String visitOneBedDates(OneBed oneBedDate);
	 Apartments visitStudioDates();
	 void visitTwoBedDates(TwoBed twoBedDate);
	 void visitThreeBedDates(ThreeBed threeBedDate);
}
