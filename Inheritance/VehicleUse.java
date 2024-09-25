
package Inheritance;

public class VehicleUse {

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.print();

        Car c = new Car();
        c.color = "Black";
        c.setmaxSpeed(200);
        c.print();
        c.isConvertible = true;
        c.numGears = 5;
        c.printCar();
    }
    
}