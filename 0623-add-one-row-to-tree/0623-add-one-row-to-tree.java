
class Solution {
    TreeNode prev = null;
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth == 1) {
            TreeNode add = new TreeNode(val);
            if(prev == null) {
                add.left = root;
                return add;
            } else {
                if(prev.left == root) add.left = root;
                else add.right = root;
                return add;
            }
        }
        if(root == null) return null;
        prev = root;
        root.left = addOneRow(root.left, val, depth-1);
        root.right = addOneRow(root.right, val, depth-1);
        return root;
    }
}