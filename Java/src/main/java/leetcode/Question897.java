package leetcode;

import leetcode.util.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

public class Question897 {
    public TreeNode increasingBST(TreeNode root) {

        TreeNode dummy = new TreeNode();
        dummy.right = root;
        TreeNode tail = dummy;

        Deque<TreeNode> stack = new ArrayDeque<>();
        while(!stack.isEmpty() || root != null) {
            while(root != null) {
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            tail.right = root;
            tail = root;
            root.left = null;
            root = root.right;
        }

        return dummy.right;
    }
}
