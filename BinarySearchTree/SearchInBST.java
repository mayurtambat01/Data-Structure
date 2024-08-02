/*Given a BST and an integer k. Find if the integer k is 
present in given BST or not. You have to return true, 
if node with data k is present, return false otherwise.

Note:
Assume that BST contains all unique elements.

Sample Input 1 :
8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
2
Sample Output 1 :
true
*/

public class SearchInBST {

    public static boolean searchBST(BinaryTreeNode<Integer> root,int k){
        if (root==null) {
            return false;
        }
        if (root.data == k) {
            return true;
        }
        return searchBST(root.left, k) || searchBST(root.right, k);
    }   
}