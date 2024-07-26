
public class CheckSorted {

    public static boolean isSorted(int arr[]){
        return isSorted(arr, 0);
    }
    public static boolean isSorted(int arr[],int startIndex){
        if (startIndex >= arr.length-1) {
            return true;
        }
        if (arr[startIndex] > arr[startIndex + 1]) {
            return false;
        }
        boolean ans =  isSorted(arr, startIndex + 1);
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={1,3,2,4,5};
        System.out.println(isSorted(arr));
    }
}
