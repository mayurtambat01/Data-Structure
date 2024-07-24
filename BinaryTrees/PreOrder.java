import java.util.Scanner;

public class PreOrder {

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
    public static void preOrder(BinaryTreeNode<Integer> root){
        if (root==null) {
            return;
        }
        System.out.print(root.data +" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takeInput(s);
        preOrder(root);        
    }
}
