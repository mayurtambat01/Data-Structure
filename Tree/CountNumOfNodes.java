
import java.util.Scanner;

public class CountNumOfNodes {

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
    public static int Count(TreeNode<Integer> root){
        if (root==null) {
            return 0;
        }
        int count = 1;
        for(int i=0;i < root.children.size();i++){
            count += Count(root.children.get(i));
        }
        return count;
    }

    public static void main(String[] args) {
        TreeNode<Integer> root = takeInput();
        System.out.println(Count(root));
    }
}
