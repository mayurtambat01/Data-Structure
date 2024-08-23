/*
You are given with an integer k and an array of integers that contain numbers in random order. 
Write a program to find k largest numbers from given array. You need to save them in an array and return it.

Time complexity should be O(nlogk) and space complexity should be not more than O(k).

Order of elements in the output is not important.
Detailed explanation ( Input/output format, Notes, Images )
Sample Input :
13
2 12 9 16 10 5 3 20 25 11 1 8 6 
4
Sample Output :
12
16
20
25
*/

import java.util.PriorityQueue;

public class KLargestElement {

    public static void printLargestElement(int arr[],int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i=0;
        for(;i < k;i++){
            pq.add(arr[i]);
        } 
        for(;i < arr.length;i++){
            arr[i-k]=pq.remove();
            pq.add(arr[i]);
        }
        while (!pq.isEmpty()) {
            System.out.print(pq.remove()+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {2,15,8,9,12,13,20};
        int k = 4;
        printLargestElement(arr, k);
    }    
}