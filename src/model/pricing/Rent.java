package model.pricing;

import dal.OneBed;
import dal.Studio;
import dal.ThreeBed;
import dal.TwoBed;

public interface Rent {
	void visitStudio(Studio studio);
	void visitOneBed(OneBed oneBed);
	void visitTwoBed(TwoBed twoBed);
	void visitThreeBed(ThreeBed threeBed);

}
