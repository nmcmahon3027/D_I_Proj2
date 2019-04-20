package model.pricing.dates;

import dal.OneBed;
import dal.Studio;
import dal.ThreeBed;
import dal.TwoBed;

public interface MoveInDates {
	void visitStudioDates(Studio studioDate);
	void visitOneBedDates(OneBed oneBedDate);
	void visitTwoBedDates(TwoBed twoBedDate);
	void visitThreeBedDates(ThreeBed threeBedDate);
}
