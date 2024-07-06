
import java.util.Scanner;

public class FindHeight {
    
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
    public static int Height(TreeNode<Integer> root){
        if (root==null) {
            return 0;
        }
        int height = 0;
        for(TreeNode<Integer> child : root.children){
            height = Math.max(height, Height(child));
        }
        return height + 1;
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = takeInput();
        System.out.println(Height(root));
    }
}
