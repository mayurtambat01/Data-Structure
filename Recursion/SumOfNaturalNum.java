import java.util.Scanner;

public class SumOfNaturalNum {

    public static int Num(int n){
        if (n==1) {
            return 1;
        }
        return n + Num(n-1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(Num(n));
    }
}
