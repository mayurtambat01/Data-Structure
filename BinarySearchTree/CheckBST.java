
package BinarySearchTree;

public class CheckBST {

    public static boolean isBST(BinarySearchTree<Integer> root){
        return isBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    public static boolean isBST(BinarySearchTree<Integer> root,long min,long max){
        if (root==null) {
            return true;
        }
        if (root.data <= min || root.data >= max) {
            return false;
        }
        return isBST(root.left, min, root.data) && isBST(root.right, root.data, max);
    }
}