
public class ArraySum {

    public static int Sum(int arr[]){
        int sum = 0;
        for(int i=0;i < arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        System.out.println(Sum(a));
    }
}
