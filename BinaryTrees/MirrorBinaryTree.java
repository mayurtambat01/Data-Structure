
import java.util.Scanner;

public class MirrorBinaryTree{

    public static BinaryTreeNode<Integer> takeInput(Scanner s){
        System.out.println("Enter next node");
        int rootdata = s.nextInt();
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootdata);
        if (root.data == -1) {
            return null;
        }
        root.left = takeInput(s);
        root.right = takeInput(s);
        return root;
    }
    public static void mirror(BinaryTreeNode<Integer> root){
        if (root==null) {
            return;
        }
        BinaryTreeNode<Integer> temp = root.left;
        root.left = root.right;
        root.right = temp;

        mirror(root.left);
        mirror(root.right);
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takeInput(s);
        mirror(root);
    }
}