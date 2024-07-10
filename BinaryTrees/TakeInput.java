
import java.util.Scanner;

public class TakeInput {

    public static BinaryTreeNode<Integer> takeInput(Scanner s){
        System.out.println("Enter next Node");
        int rootData = s.nextInt();
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        if (root.data == -1) {
            return null;
        }
        root.left = takeInput(s);
        root.right = takeInput(s);

        return root;
    }

    public static void print(BinaryTreeNode<Integer> root){
        if (root == null) {
            return;
        }
        String s = root.data + "";
        if (root.left != null) {
            s += "L: "+ root.left.data;
        }
        if (root.right != null) {
            s += "R: "+ root.right.data;
        }
        System.out.println(s);
        print(root.left);
        print(root.right);
    } 

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takeInput(s);
        print(root);
        s.close();
    }
}