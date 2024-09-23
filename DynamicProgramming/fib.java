package DynamicProgramming;

public class fib {

    //using recursive approach.
    public static int fibo(int n){   
        if (n==0 || n==1) {
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }

    //using Memoisation approach.
    public static int fibM(int n){
        int storage[] = new int[n+1];
        for(int i=0;i <= n;i++){
            storage[i] = -1;
        }
        return fibM(n, storage);
    }
    private static int fibM(int n, int[] storage) {
        if (n==0 || n==1) {
            storage[n] = n;
            return storage[n];
        }
        if (storage[n] != -1) {
            return storage[n];
        }
        storage[n] = fibM(n-1, storage) + fibM(n-2, storage);
        return storage[n];
    }

    //using Dynamic Programming approach.
    public static int fibDP(int n){
        int storage[] = new int[n + 1];
        storage[0] = 0;
        storage[1] = 1;

        for(int i=2;i <= n;i++){
            storage[i] = storage[i-1] + storage[i-2];
        }
        return storage[n];
    }

    public static void main(String[] args) {
        int n = 40;
        System.out.println(fibDP(n));
        System.out.println(fibM(n));
        System.out.println(fibo(n));
    }    
}