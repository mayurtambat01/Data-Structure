
package Inheritance;

public class Car extends Vehicle{

    int numGears;
    boolean isConvertible;
    
    public void printCar(){
        System.out.println("MaxSpeed is: " + getmaxSpeed());
        System.out.println("Color is: " + color);
        System.out.println("numGears is: " + numGears);
        System.out.println("isConvertible is: " + isConvertible);
    }
}