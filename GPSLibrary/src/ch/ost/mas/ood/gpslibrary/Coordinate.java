package ch.ost.mas.ood.gpslibrary;

public interface Coordinate {
	int getY();
	int getX();
	
	/**
	 * @return The coordinate converted
	 *         to SwissGrid object
	 */
	SwissGrid toSwissGrid();
}
