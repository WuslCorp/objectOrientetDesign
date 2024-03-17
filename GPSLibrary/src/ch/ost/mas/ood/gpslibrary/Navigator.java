package ch.ost.mas.ood.gpslibrary;

public class Navigator {
	/**
	 * Version 1
	 */
	public void navigateTo(int x, int y) {
		var message = "Navigating to coordinates x = %d / y = %d";
		System.out.println(message.formatted(x, y));
	}
	
//	/**
//	 * Version 2
//	 */
//	public void navigateTo(SwissGrid coordinate) {
//		var message = "Navigating to coordinates x = %d / y = %d";
//		int x = coordinate.getX();
//		int y = coordinate.getY();
//		System.out.println(message.formatted(x, y));
//	}
//	
//	/**
//	 * Version 3
//	 */
//	public void navigateTo(Coordinate coordinate) {
//		var message = "Navigating to coordinates x = %d / y = %d";
//		int x = coordinate.getX();
//		int y = coordinate.getY();
//		System.out.println(message.formatted(x, y));
//	}
} 
