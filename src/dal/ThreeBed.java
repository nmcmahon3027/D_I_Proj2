package dal;

import model.pricing.Rent;
import model.pricing.dates.MoveInDates;
import model.pricing.floors.AllAvailableFloors;
import model.pricing.floors.FloorsAvailable;

public class ThreeBed implements Apartments {
	@Override
	public String getApartment() {
		return "This is a 3 Bedroom";
	}

	@Override
	public void accept(Rent rent) {
		rent.visitThreeBed(this);

	}

	@Override
	public void accept(MoveInDates moveInDates) {
		moveInDates.visitThreeBedDates(this);

	}

	@Override
	public void accept(FloorsAvailable floorsAvailable) {
		floorsAvailable.visitFloorsAvailable(this);

	}

}
