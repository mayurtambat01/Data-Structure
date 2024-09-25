
package Inheritance;

public class Vehicle {

    private int maxSpeed;
    String color;    
    
    public void setmaxSpeed(int ms){
        maxSpeed = ms;
    }
    public int getmaxSpeed(){
        return maxSpeed;
    }

    public void print(){
        System.out.println("MaxSpeed is: " + maxSpeed);
        System.out.println("Color is: " + color);
    }
}