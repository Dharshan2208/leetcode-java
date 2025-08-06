
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
import java.util.*;

class Solution {

    public void preorder(List<Integer> myList, TreeNode root) {
        if (root == null) {
            return;
        }

        myList.add(root.val);
        preorder(myList, root.left);
        preorder(myList, root.right);

    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> myList = new ArrayList<>();
        preorder(myList, root);

        return myList;
    }
}

// Have to do without recursion