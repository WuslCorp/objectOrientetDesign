package ch.ost.mas.ood.libraryuser;

import ch.ost.mas.ood.gpslibrary.Navigator;

public class BoardComputer {
	private Navigator navigator = new Navigator();
	
	public void navigateToOst() {
		int ostY = 2704370;
		int ostX = 1231230;
		navigator.navigateTo(ostY, ostX); //v1
//		var coordinate = new SwissGrid(ostY, ostX);
//		navigator.navigateTo(coordinate);
	}
}
