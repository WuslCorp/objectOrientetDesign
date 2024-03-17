package hfdp.simuduck;

public abstract class Duck {
	public void quack() {
		System.out.println("Quack");
	}
	
	public void swim() {
		System.out.println("Swimming");
	}
	
	public abstract void display();
	
	public void fly() {
		System.out.println("Flying");
	}
}
