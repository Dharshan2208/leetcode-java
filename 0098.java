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
class Solution {
    // Did it using brute force will do using better approach

    // ArrayList<Integer> list = new ArrayList<Integer>();

    // public void inorder(TreeNode root) {
    // if (root == null) {
    // return;
    // }
    // inorder(root.left);
    // list.add(root.val);
    // inorder(root.right);
    // }

    // public boolean isSorted() {
    // for (int i = 0; i < list.size() - 1; i++) {
    // if (list.get(i) >= list.get(i + 1)) {
    // return false;
    // }
    // }
    // return true;
    // }

    // public boolean isValidBST(TreeNode root) {
    // inorder(root);
    // return isSorted();
    // }
}