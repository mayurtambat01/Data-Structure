import java.util.Scanner;

public class IsNodePresent {
    
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
    public static boolean isNode(BinaryTreeNode<Integer> root,int X){
        if(root==null){
            return false;
        }
        if(root.data==X){
            return true;
        }
        return isNode(root.left, X) || isNode(root.right, X);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takeInput(s);
        System.out.println(isNode(root, 5));
    }
}
