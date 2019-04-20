package dal;

import model.pricing.Rent;
import model.pricing.dates.MoveInDates;
import model.pricing.floors.AllAvailableFloors;
import model.pricing.floors.FloorsAvailable;

public class OneBed implements Apartments {
	@Override
	public String getApartment() {
		return "This is a 1 Bedroom";
	}

	@Override
	public void accept(Rent rent) {
		rent.visitOneBed(this);

	}

	@Override
	public void accept(MoveInDates moveInDates) {
		moveInDates.visitOneBedDates(this);

	}

	@Override
	public void accept(FloorsAvailable floorsAvailable) {
		floorsAvailable.visitFloorsAvailable(this);

	}

}
