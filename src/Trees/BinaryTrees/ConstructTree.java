package Trees.BinaryTrees;

import java.util.HashMap;

public class ConstructTree {
    public static HashMap<Integer,Integer> m = new HashMap<>();
    public static TreeNode constructTree(int po[],int io[],int is,int ie,int ps,int pe) {
        if (ps>pe){
            return null;
        }
        TreeNode root = new TreeNode(po[ps]);
        int idx = m.get(po[ps]);
        int c = idx-is;
        root.left = constructTree(po,io,is,idx-1,ps+1,ps+c);
        root.right = constructTree(po,io,idx+1,ie,ps+c+1,pe);
        return root;
    }
    public static void preorder(TreeNode root){
        if(root == null){
            return;
        }
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        ConstructTree tree = new ConstructTree();
        int po[] = {10,5,2,7,6,8,20,22,21,50};
        int io[] = {2,5,6,7,8,10,20,21,22,50};
        int n = po.length-1;
        int ps=0,is=0,ie=n,pe=n;
        for(int i=0;i<=n;i++)
        {
            m.put(io[i],i);
        }
        TreeNode ans = constructTree(po,io,is,ie,ps,pe);
        tree.preorder(ans);
    }
}
