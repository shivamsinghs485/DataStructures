class abc
{
public static void main(string [args])
        {


        }
    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null) {
            return t2;
        }
        Stack<TreeNode> treeNodesStack1 = new Stack<>(); // t1 Stack
        Stack<TreeNode> treeNodesStack2 = new Stack<>(); // t2 Stack
        treeNodesStack1.push(t1);
        treeNodesStack2.push(t2);

        while (!treeNodesStack1.isEmpty()) {
            TreeNode first = treeNodesStack1.pop(); // tree 1 node
            TreeNode second = treeNodesStack2.pop(); // tree 2 node

            if (first != null && second != null) {
                first.val += second.val;

                /* check right node */
                if (first.right == null) {
                    first.right = second.right;
                } else {
                    treeNodesStack1.push(first.right);
                    treeNodesStack2.push(second.right);
                }
                /* check left node */
                if (first.left == null){
                    first.left = second.left;
                } else {
                    treeNodesStack1.push(first.left);
                    treeNodesStack2.push(second.left);
                }
            }
        }
        return t1;
    }
}
