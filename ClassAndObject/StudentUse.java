
// Class And Object.

package ClassAndObject;

// import java.util.Scanner;

public class StudentUse {

    public static void main(String[] args) {
        // Scanner s = new Scanner(System.in);

        Student s1 = new Student();
        s1.name = "John";
        s1.rollnumber = 101;
        System.out.println(s1.name + " " + s1.rollnumber);
    
        Student s2 = new Student();
        s2.name = "Arya";
        s2.rollnumber = 102;
        System.out.println(s2.name + " " + s2.rollnumber);
    }
}