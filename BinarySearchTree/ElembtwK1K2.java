/* Given a Binary Search Tree and two integers k1 and k2, 
find and print the elements which are in range k1 and k2 (both inclusive).
Print the elements in increasing order.

Sample Input 1:
8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
6 10
Sample Output 1:
6 7 8 10
*/

public class ElembtwK1K2 {

    public static void elembtwk1k2(BinaryTreeNode<Integer> root,int k1,int k2){
        if (root==null) {
            return;
        }
        if (root.data > k1) {
            elembtwk1k2(root.left, k1, k2);
        }
        if (root.data >= k1 && root.data <= k2) {
            System.out.print(root.data +" ");
        }
        if (root.data < k2) {
            elembtwk1k2(root.right, k1, k2);
        }
    }   
}