package dal;

import model.pricing.Rent;
import model.pricing.dates.MoveInDates;
import model.pricing.floors.AllAvailableFloors;
import model.pricing.floors.FloorsAvailable;

public class TwoBed implements Apartments {
	@Override
	public String getApartment() {
		return "This is a 2 Bedroom";
	}

	@Override
	public void accept(Rent rent) {
		rent.visitTwoBed(this);

	}

	@Override
	public void accept(MoveInDates moveInDates) {
		moveInDates.visitTwoBedDates(this);

	}

	@Override
	public void accept(FloorsAvailable floorsAvailable) {
		floorsAvailable.visitFloorsAvailable(this);

	}


}
