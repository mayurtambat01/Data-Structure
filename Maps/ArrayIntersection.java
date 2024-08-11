/* 
You have been given two integer arrays/lists (ARR1 and ARR2) of size N and M, respectively. 
You need to print their intersection; An intersection for this problem can be defined when 
both the arrays/lists contain a particular value or to put it in other words, when there is 
a common value that exists in both the arrays/lists.
*/

import java.util.HashMap;

public class ArrayIntersection {

    public static void printIntersection(int a[],int b[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i < a.length;i++){
            if (map.containsKey(a[i])) {
                int value = map.get(a[i]);
                map.put(a[i],value + 1);
            }else{
                map.put(a[i],1);
            }
        }
        for(int i=0;i < b.length;i++){
            if(map.containsKey(b[i])){
                int freq = map.get(b[i]);
                if (freq > 0) {
                    System.out.print(b[i] + " ");
                    map.put(b[i],freq - 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        int a[] = {1,3,5,7,9};        
        int b[] = {1,2,3,4,5};
        printIntersection(a, b);
    }
}