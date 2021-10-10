package activities;

public class Car {
	
	//Class member variables
	
    public String color;
	public String transmission;
	public int make;
	public int tyres;
    public int doors;

	//Creating a Constructor
	
     Car() {
	 int tyres = 4;
	 int doors = 4; 	
	}
     
 //Adding methods to a class
 
 //displayCharacteristics method
 
 public void displayCharacteristics() {
	 System.out.println("Color of the car:" + color);
	 System.out.println("Transmission of the car:" + transmission);
	 System.out.println("Make of the car:" + tyres);
	 System.out.println("Doors of the car" + doors);	 
 }
 //Accelerate method
 
 public void accelerate() {
	 System.out.println("Car is moving forward."); 
 }
 //brake method
 
 public void brake() {
	 System.out.println("Car has stopped.");
 }
 
 
 
 
 
 
 
 
 
	
	

}
