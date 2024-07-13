import java.util.Scanner;

public class NumOfNodeGTX {

    public static BinaryTreeNode<Integer> takeInput(Scanner s){
        System.out.println("Enter next node");
        int rootData = s.nextInt();
        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
        if(root.data == -1){
            return null;
        }
        root.left = takeInput(s);
        root.right = takeInput(s);
        return root;
    }
    public static int numNodes(BinaryTreeNode<Integer> root,int X){
        if (root==null) {
            return 0;
        }
        int smallOutput = numNodes(root.left, X) + numNodes(root.right, X);
        if (root.data > X) {
            return smallOutput + 1;
        }
        else{
            return smallOutput;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takeInput(s);
        System.out.println(numNodes(root, 5));
    }
}
