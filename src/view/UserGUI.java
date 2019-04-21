package view;

import dal.Apartments;
import dal.OneBed;

public interface UserGUI {
	Apartments printMainMenu();
	void printOneBedMenu();
	void printTwoBedMenu();
	void printThreeBedMenu();

}
