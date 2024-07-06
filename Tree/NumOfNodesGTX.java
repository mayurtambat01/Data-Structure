
import java.util.Scanner;

public class NumOfNodesGTX {

    public static TreeNode<Integer> takeInput(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Next Node Data");
        int n=s.nextInt();
        TreeNode<Integer> root = new TreeNode<Integer>(n);
        System.out.println("Enter Number Of Child "+n);
        int childCount = s.nextInt();
        for(int i=0;i < childCount;i++){
            TreeNode<Integer> child = takeInput();
            root.children.add(child);
        }
        return root;
    }
    public static int NumNodes(TreeNode<Integer> root,int x){
        if (root==null) {
            return 0;
        }
        int count = 0;
        if (root.data < x) {
            count = 1;
        }
        for(TreeNode<Integer> child : root.children){
            count += NumNodes(child, x);
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Value Of X");
        int x = s.nextInt();   
        TreeNode<Integer> root = takeInput();
        System.out.println(NumNodes(root, x));
    }   
}