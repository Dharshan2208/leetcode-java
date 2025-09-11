
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

// class Solution {
//     public void inorder(List<Integer> myList, TreeNode root) {
//         if (root == null) {
//             return;
//         }

//         inorder(myList, root.left);
//         myList.add(root.val);
//         inorder(myList, root.right);

//     }

//     public List<Integer> inorderTraversal(TreeNode root) {
//         List<Integer> myList = new ArrayList<>();
//         inorder(myList, root);

//         return myList;
//     }
// }

// Have to do without recursion

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preorder = new ArrayList<Integer>();

        if (root == null)
            return preorder;

        Stack<TreeNode> st = new Stack<TreeNode>();
        st.push(root);

        while (!st.isEmpty()) {
            root = st.pop();

            preorder.add(root.val);

            if (root.right != null) {
                st.push(root.right);
            }
            if (root.left != null) {
                st.push(root.left);
            }
        }
        return preorder;
    }
}