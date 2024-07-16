import java.util.Scanner;

public class RemoveLeaves{

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
    public static void print(BinaryTreeNode<Integer> root){
        if (root==null) {
            return;
        }
        String s = root.data + "";
        if(root.left != null){
            s += "L: " + root.left.data; 
        }
        if(root.right != null){
            s += "R: " + root.right.data;
        }
        System.out.println(s);
        print(root.left);
        print(root.right);
    }

    public static BinaryTreeNode<Integer> remove(BinaryTreeNode<Integer> root){
        if(root==null){
            return null;
        }
        if (root.left==null && root.right==null) {
            return null;
        }
        root.left = remove(root.left);
        root.right = remove(root.right);
        return root;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takeInput(s);
        BinaryTreeNode<Integer> newRoot = remove(root);
        print(newRoot);
    }
}