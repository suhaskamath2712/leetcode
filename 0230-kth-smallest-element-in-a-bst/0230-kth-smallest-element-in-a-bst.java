class Solution
{
    private int cnt, ans;

    private void inorder(TreeNode root, int k)
    {
        if (root == null)
            return;
        
        inorder (root.left,k);
        cnt++;

        if (cnt == k)
        {
            ans = root.val;
            return;
        }

        inorder (root.right,k);
    }

    public int kthSmallest(TreeNode root, int k)
    {
        cnt = 0;
        ans = -1;
        inorder(root,k);
        return ans;
    }
}