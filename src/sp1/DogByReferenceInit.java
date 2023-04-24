package sp1;


public class DogByReferenceInit {
	
	int age;
	String color;
	
	public static void main(String[] args) {
		DogByReferenceInit buzo = new DogByReferenceInit();
		buzo.age = 10;
		buzo.color = "black";
		System.out.println(buzo.age+ " "+buzo.color);
				
	
		
	}

}
