package Trees.BinaryTrees;

import com.sun.source.tree.Tree;

public class InvertTree {
    TreeNode root,iroot;
    InvertTree() {
        root = null;
        iroot = null;
    }
    public static TreeNode invertBTree(TreeNode root) {
        if (root == null){
            return null;
        }
        TreeNode left = invertBTree(root.left);
        TreeNode right = invertBTree(root.right);

        root.left = right;
        root.right = left;
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
        InvertTree it = new InvertTree();
        it.root = new TreeNode(4);
        it.root.left = new TreeNode(2);
        it.root.right = new TreeNode(7);
        it.root.left.left = new TreeNode(1);
        it.root.left.right = new TreeNode(3);
        it.root.right.left = new TreeNode(6);
        it.root.right.right = new TreeNode(9);
        preorder(it.root);
        System.out.println();
        TreeNode ans = invertBTree(it.root);
        preorder(ans);
    }
}
