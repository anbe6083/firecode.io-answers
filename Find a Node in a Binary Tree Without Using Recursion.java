// java.util.* has been imported for this problem.
// You don't need any other imports.

public TreeNode findNode(TreeNode root, int val) {
    if(root != null) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while(!queue.isEmpty() ) {
            TreeNode current = queue.poll();
            if(current != null) {
                if(current.data == val) return current;
                queue.add(root.left);
                queue.add(current.right);
            }
        }
    }
    return null;
}