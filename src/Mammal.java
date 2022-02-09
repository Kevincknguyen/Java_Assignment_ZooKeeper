class Mammal {
	private int energy;
	
	public Mammal() {
		this.energy=100;
	}
	public Mammal (int energy) {
		this.energy=energy;
	}
	public int displayEnergy() {
		System.out.println("Remaining energy "+energy);
		return energy;
	}
	
	public void changeEnergy(int input) {
		energy += input;
	}
}
