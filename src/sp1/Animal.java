package sp1;

public class Animal {
	
	public void eat() {
		System.out.println("I am eating");
	
	}
	public void run() {
		System.out.println("I am running");
	
	}

	public static void main(String[] args) {
		//Before
		System.out.println("1");
		Animal buzo = new Animal();
		buzo.eat();
		buzo.run();
		Birds sp = new Birds();
		sp.fly();
		

	}

}

class Birds{
	void fly() {
		System.out.println("I am flying");
	}
}

