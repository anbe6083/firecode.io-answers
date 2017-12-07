// java.util.* has been imported for this problem.
// You don't need any other imports.

public int numberOfLeaves(TreeNode root) { 
    if(root != null) {
        if(root.left == null && root.right == null) return 1;
        else if(root.left != null && root.right != null) {
            return numberOfLeaves(root.left) + numberOfLeaves(root.right);
        }
        else if(root.left != null) return 0 + numberOfLeaves(root.left);
        else return numberOfLeaves(root.right);
    }
    return 0;
}