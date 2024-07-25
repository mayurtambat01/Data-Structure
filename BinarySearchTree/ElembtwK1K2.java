package BinarySearchTree;

public class ElembtwK1K2 {

    public static void elembtwk1k2(BinarySearchTree<Integer> root,int k1,int k2){
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