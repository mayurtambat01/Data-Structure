/* 
You are given with an integer k and an array of integers that contain numbers in random order. 
Write a program to find k smallest numbers from given array. You need to save them in an array and return it.

Time complexity should be O(n * logk) and space complexity should not be more than O(k).

Note: Order of elements in the output is not important.

Detailed explanation ( Input/output format, Notes, Images )
Constraints:
Time Limit: 1 sec
Sample Input 1 :
13
2 12 9 16 10 5 3 20 25 11 1 8 6 
4
Sample Output 1 :
1 2 3 5 
*/

import java.util.PriorityQueue;
import java.util.Collections;

public class KSmallestElement {

    public static void printSmallestElement(int arr[],int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i < k;i++){
            pq.add(arr[i]);
        }
        for(int i=k;i < arr.length;i++){
            int min = pq.element();
            if (min > arr[i]) {
                min = arr[i];
            }
            if (min != pq.element()) {
                pq.remove();
                pq.add(arr[i]);
            }
        }

        while (!pq.isEmpty()) {
            System.out.print(pq.remove()+ " ");
        }
    }    

    public static void main(String[] args) {
        int arr[] = {2,15,8,9,12,13,20};
        int k= 3;
        
        printSmallestElement(arr, k);
    }
}