
public class BinaryTreeUse {

    public static void main(String[] args) {
        
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(100);
        BinaryTreeNode<Integer> node1 = new BinaryTreeNode<Integer>(100);
        root.left = node1;

        BinaryTreeNode<Integer> node2 = new BinaryTreeNode<Integer>(100);
        root.right = node2;
    }
}