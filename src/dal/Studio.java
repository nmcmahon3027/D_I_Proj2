package dal;

import model.pricing.Rent;
import model.pricing.dates.MoveInDates;
import model.pricing.floors.AllAvailableFloors;
import model.pricing.floors.FloorsAvailable;

public class Studio implements Apartments {

	@Override
	public String getApartment() {
		return "This is a Studio";
	}

	@Override
	public void accept(Rent rent) {
		rent.visitStudio(this);


	}

	@Override
	public void accept(MoveInDates moveInDates) {
		moveInDates.visitStudioDates(this);

	}

	@Override
	public void accept(FloorsAvailable floorsAvailable) {
		floorsAvailable.visitFloorsAvailable(this);

	}



}
