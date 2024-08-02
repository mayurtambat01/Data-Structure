/*Given a BST and an integer k. Find and return the path from the node 
with data k and root (if a node with data k is present in given BST) 
in a list. Return empty list otherwise.

Note: Assume that BST contains all unique elements.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class FindPath {

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
    public static ArrayList<Integer> findPath(BinaryTreeNode<Integer> root,int data){
        if (root==null) {
            return null;
        }
        if (root.data==data) {
            ArrayList<Integer> output = new ArrayList<>();
            output.add(root.data);
            return output;
        }
        ArrayList<Integer> leftOutput = findPath(root.left, data);
        if (leftOutput != null) {
            leftOutput.add(root.data);
            return leftOutput;
        }

        ArrayList<Integer> rightOutput = findPath(root.right, data);
        if (rightOutput != null) {
            rightOutput.add(root.data);
            return rightOutput;
        }else{
            return null;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BinaryTreeNode<Integer> root = takeInput(s);
        ArrayList<Integer> rootData = findPath(root, 4);
        System.out.println(rootData);        
    }
}
