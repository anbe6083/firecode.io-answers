// java.util.* has been imported for this problem.
// You don't need any other imports.

//Populated the elements of the tree  in the below list in preorder format
ArrayList<Integer> preorderedList = new ArrayList<Integer>();
public void preorder(TreeNode root) {
   if(root != null) {
       preorderedList.add(root.data);
       preorder(root.left);
       preorder(root.right);
   }
}