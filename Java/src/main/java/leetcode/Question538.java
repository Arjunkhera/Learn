package leetcode;

import leetcode.util.TreeNode;

public class Question538 {
    public TreeNode convertBST(TreeNode root) {
        solve(root, 0);
        return root;
    }

    public int solve(TreeNode root, int add) {
        if(root == null) {
            return add;
        }

        int right = solve(root.right, add);
        int left = solve(root.left, right + root.val);
        root.val = right + root.val;
        return left;
    }
}
