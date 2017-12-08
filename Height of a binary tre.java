// java.util.* has been imported for this problem.
// You don't need any other imports.

public int findHeight(TreeNode root) { 
    if(root != null) {
        return 1 + Math.max( findHeight(root.left), findHeight(root.right) );
    }
    return 0;
}