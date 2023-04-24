package sp1;

public class DogMethodInit {
	String dogName;
	String color;
	int age;
	void initObj(String c,int a) {
		color = c;
		age = a;
		
	}
	void diplayObj() {
		System.out.print(color+" "+age);
	}

	public static void main(String[] args) {
		DogMethodInit buzo = new DogMethodInit();
		// The value is send initialized with value black and 10 and send/pass to initObj method as c and a which is stored in 
		//variable color and age instance 
		// inorder to refer to those objects we need to use .
		buzo.initObj("black", 10);
		buzo.diplayObj();

	}

}
