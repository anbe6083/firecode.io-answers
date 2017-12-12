// java.util.* has been imported for this problem.
// You don't need any other imports.

public ArrayList<Integer> preorderItr(TreeNode root) {
    ArrayList<Integer> result = new ArrayList<Integer>();
    Stack<TreeNode> stack = new Stack<TreeNode>();
    stack.push( root );
    while( !stack.isEmpty() ) {
        TreeNode currNode = stack.pop();
        if(currNode != null) {
            result.add( currNode.data );
            stack.push( currNode.right );
            stack.push( currNode.left );
        }
    }
    return result;
}