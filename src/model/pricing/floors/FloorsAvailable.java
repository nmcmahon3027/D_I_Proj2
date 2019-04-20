package model.pricing.floors;

import dal.OneBed;
import dal.Studio;
import dal.ThreeBed;
import dal.TwoBed;

public interface FloorsAvailable {
	void visitFloorsAvailable(Studio studio);
	void visitFloorsAvailable(OneBed oneBed);
	void visitFloorsAvailable(TwoBed twoBed);
	void visitFloorsAvailable(ThreeBed threeBed);
}
