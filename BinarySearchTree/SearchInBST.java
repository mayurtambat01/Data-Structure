package BinarySearchTree;

public class SearchInBST {

    public static boolean searchBST(BinarySearchTree<Integer> root,int k){
        if (root==null) {
            return false;
        }
        if (root.data == k) {
            return true;
        }
        return searchBST(root.left, k) || searchBST(root.right, k);
    }   
}