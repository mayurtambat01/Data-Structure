
public class CheckIndexNumber {

    public static int checkIndex(int arr[],int n){
        return checkIndex(arr, n, 0);
    }
    public static int checkIndex(int arr[],int n,int startIndex){
        if (startIndex==arr.length) {
            return -1;
        }
        if (arr[startIndex]==n) {
            return startIndex;
        }
        return checkIndex(arr, n, startIndex + 1);
    }

    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8};
        System.out.println(checkIndex(a, 8));
    }
}
