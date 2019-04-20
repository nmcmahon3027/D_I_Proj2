package dal;

import model.pricing.Rent;
import model.pricing.dates.MoveInDates;
import model.pricing.floors.AllAvailableFloors;
import model.pricing.floors.FloorsAvailable;

public interface Apartments {
	String getApartment();
	void accept(Rent rent);
	void accept(MoveInDates moveInDates);
	void accept(FloorsAvailable floorsAvailable);
}
