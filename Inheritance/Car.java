package Inheritance;

public class Car extends Inheritance{
    private String modelName="Supra";
    public static void main(String[] args) {

        // Create a myCar object
        Car myCar = new Car();
    
        // Call the sound() method (from the Vehicle class) on the myCar object
        myCar.sound();
    
        // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
        System.out.println(myCar.brand + " " + myCar.modelName);
      }
}
