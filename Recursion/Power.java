import java.util.Scanner;

public class Power {

    public static int print(int x,int n){
        if (n==0) {
            return 1;
        }
        if (n % 2==0) {
            int t = print(x, n/2);
            return t * t;
        }else{
            int t = print(x, n/2);
            return x * t * t;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();
        System.out.println(print(x, n));
    }
}
