
import java.util.Scanner;

public class PreOrderPrint {
    
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
    public static void preOrder(TreeNode<Integer> root){
        if (root==null) {
            return;
        }
        System.out.println(root.data);
        for(int i=0;i < root.children.size();i++){
            preOrder(root.children.get(i));
        }
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = takeInput();
        preOrder(root);
    }
}
