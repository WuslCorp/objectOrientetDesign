package hfdp.simuduck;

public class DecoyDuck extends Duck {

	@Override
	public void quack() {
		//Do nothing
	}
	
	@Override
	public void display() {
		System.out.println("Looks like a decoy duck");		
	}

	@Override
	public void fly() {
		//Do nothing
	}
}
