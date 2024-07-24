import java.util.Scanner;

public class PostOrder {
    
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
    public static void postOrder(BinaryTreeNode<Integer> root){
        if (root==null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data +" ");
    }

    public static void main(String[] args) {
        
    }
}
