package model.pricing.floors;

import dal.OneBed;
import dal.Studio;
import dal.ThreeBed;
import dal.TwoBed;

public interface FloorsAvailable {
	void visitFloorsAvailable(Studio studio);
	void printStudioFloors();
	void visitFloorsAvailable(OneBed oneBed);
	void printOneBFloors();
	void visitFloorsAvailable(TwoBed twoBed);
	void printTwoBFloors();
	void visitFloorsAvailable(ThreeBed threeBed);
	void printThreeBFloors();
}
