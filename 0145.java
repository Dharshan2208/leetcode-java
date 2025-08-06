
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */

import java.util.*;

class Solution {
    public void postorder(List<Integer> myList, TreeNode root) {
        if (root == null) {
            return;
        }

        postorder(myList, root.left);
        postorder(myList, root.right);
        myList.add(root.val);

    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> myList = new ArrayList<>();
        postorder(myList, root);

        return myList;
    }
}

// Have to do without recursion