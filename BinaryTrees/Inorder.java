import java.util.Scanner;

public class Inorder {

    public static BinaryTreeNode<Integer> takeInput(Scanner s){
        System.out.println("Enter next node");
        int rootData = s.nextInt();
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        if (root.data == -1) {
            return null;
        }
        root.left = takeInput(s);
        root.right = takeInput(s);
        return root;
    }
    public static void inorder(BinaryTreeNode<Integer> root){
        if (root==null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data +" ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takeInput(s);
        inorder(root);
    }
}
