import java.util.Scanner;

public class CountNum {

    static int count = 0;
    public static int Count(int n){
        if (n > 0) {
            count++;
            Count(n/10);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(Count(n));
    }
}
