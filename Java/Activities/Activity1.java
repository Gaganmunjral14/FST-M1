package activities;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//Create an Object
	Car creta = new Car();
	creta.make = 2014;
	creta.color = "Black";
	creta.transmission = "Manual";
	
	//Using car class methods
	
	creta.displayCharacteristics();
	creta.accelerate();
	creta.brake();
	}
}

