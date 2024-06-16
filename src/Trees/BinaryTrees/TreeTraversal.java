package Trees.BinaryTrees;

public class TreeTraversal {
    TreeNode root;
    TreeTraversal(){
        root = null;
    }
    void preorder(TreeNode root){
        if(root == null){
            return;
        }
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    void inorder(TreeNode root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
    void postorder(TreeNode root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
    }

    public static void main(String[] args) {
        TreeTraversal tree = new TreeTraversal();
        tree.root = new TreeNode(10);
        tree.root.left = new TreeNode(5);
        tree.root.right = new TreeNode(20);
        tree.root.left.left = new TreeNode(2);
        tree.root.left.right = new TreeNode(7);
        tree.root.right.right = new TreeNode(22);
        tree.root.right.right.right = new TreeNode(50);
        tree.root.right.right.left = new TreeNode(21);
        tree.root.left.right.left= new TreeNode(6);
        tree.root.left.right.right = new TreeNode(8);
        tree.preorder(tree.root);
        System.out.println();
        tree.inorder(tree.root);
        System.out.println();
        tree.postorder(tree.root);
    }
}
