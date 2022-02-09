
class Gorilla extends Mammal {
	public void throwSomething() {
		System.out.println("Gorilla chooses throw!");
		super.changeEnergy(-5);
	}
	
public void eatBananas() {
	System.out.println("Gorilla chooses eat!");
	super.changeEnergy(10);
	}

public void climb() {
	System.out.println("Climb Gorilla! Climb!");
	super.changeEnergy(-10);
}
}
