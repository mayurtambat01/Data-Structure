/*
 * An integer matrix of size (M x N) has been given. 
 * Find out the minimum cost to reach from the cell (0, 0) to (M - 1, N - 1).

From a cell (i, j), you can move in three directions:

1. ((i + 1),  j) which is, "down"
2. (i, (j + 1)) which is, "to the right"
3. ((i+1), (j+1)) which is, "to the diagonal"
The cost of a path is defined as the sum of each cell's values through which the route passes.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :
1 <= M <= 10 ^ 2
1 <= N <=  10 ^ 2

Time Limit: 1 sec
Sample Input 1 :
3 4
3 4 1 2
2 1 8 9
4 7 8 1
Sample Output 1 :
13
Sample Input 2 :
3 4
10 6 9 0
-23 8 9 90
-200 0 89 200
Sample Output 2 :
76
Sample Input 3 :
5 6
9 6 0 12 90 1
2 7 8 5 78 6
1 6 0 5 10 -4 
9 6 2 -10 7 4
10 -2 0 5 5 7
Sample Output 3 :
18
 */

package DynamicProgramming;

public class MinCostPath {

    public static int minCostPath(int arr[][]){
        return minCostPath(arr,0,0);
    }
    private static int minCostPath(int arr[][],int i,int j){
        int m = arr.length;
        int n = arr[0].length;

        if (i == m-1 && j == n-1) {
            return arr[i][j];
        }
        if (i >= m || j >= n) {
            return Integer.MAX_VALUE;
        }
        int option1 = minCostPath(arr, i+1, j);
        int option2 = minCostPath(arr, i+1, j+1);
        int option3 = minCostPath(arr, i, j+1);

        return arr[i][j] + Math.min(option1, Math.min(option2, option3));
    }

    public static void main(String[] args) {
        int arr[][] = {{1,1,1},{4,5,2},{7,8,9}};
        System.out.println(minCostPath(arr));
    }   
}