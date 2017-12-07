// java.util.* has been imported for this problem.
// You don't need any other imports.

public int findMax(TreeNode root) {
    return maxHelper(root, Integer.MIN_VALUE);
}

public int maxHelper(TreeNode root, int max) {
    if(root != null) {
        if(root.data > max) max = root.data;
        return Math.max( maxHelper(root.left, max), maxHelper(root.right, max) );
    }
    return max;
}