/*Given a binary tree with N number of nodes, check if that input tree is BST (Binary Search Tree). If yes, return true, return false otherwise.

Note:
Duplicate elements should be kept in the right subtree. */

public class CheckBST {

    public static boolean isBST(BinaryTreeNode<Integer> root){
        return isBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    public static boolean isBST(BinaryTreeNode<Integer> root,long min,long max){
        if (root==null) {
            return true;
        }
        if (root.data <= min || root.data >= max) {
            return false;
        }
        return isBST(root.left, min, root.data) && isBST(root.right, root.data, max);
    }
}