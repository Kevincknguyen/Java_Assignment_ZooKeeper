
public class ZooTest {

	public static void main(String[] args) {
		System.out.println("test");
		Gorilla me= new Gorilla();
		Bat bat=new Bat(300);
		
		me.displayEnergy();
		me.climb();
		me.displayEnergy();
		me.throwSomething();
		me.throwSomething();
		me.throwSomething();
		me.displayEnergy();
		me.eatBananas();
		me.eatBananas();
		me.displayEnergy();
		
		System.out.println("The bat has arrived!");
		bat.displayEnergy();
		bat.attackTown();
		bat.attackTown();
		bat.attackTown();
		bat.displayEnergy();
		bat.eatHumans();
		bat.eatHumans();
		bat.displayEnergy();
		bat.fly();
		bat.fly();
		bat.displayEnergy();
		
	}

}
