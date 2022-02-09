
class Bat extends Mammal {
	
	public Bat(int energy) {
		super(energy);
	}
	public void fly() {
		System.out.println("The wings generate a sound so undescriable I won't even bother... it does tire the bat though");
		super.changeEnergy(-50);
	}
	public void eatHumans() {
		System.out.println("Like a vampire, it enjoys feasting on humans. Unlike vampires, they don't understand the concept of overharvesting");
		super.changeEnergy(25);
	}
	
	public void attackTown() {
	System.out.println("How a bat sets the town on fire is unknown. But if it can eat humans, I'm sure it wasn't too difficult");
	super.changeEnergy(-100);
	}

}
