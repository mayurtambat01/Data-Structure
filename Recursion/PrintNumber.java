import java.util.Scanner;

public class PrintNumber {

    public static void Print(int n){
        if (n < 1) {
            return;
        }
        Print(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Print(n);
    }
}
