package animals;

public class Human extends Mammal implements Moo {
	
	public void moo() {
		System.out.println("moooo");
	}
	public Human(int weight) {
	}
	public Human() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void eat() {
		// Knife and fork
	}
	
	@Override
	public void shit() {
		System.out.println("Shit sideways");
	}
	public void cry() {
		System.out.println("Tears");
	}
}
