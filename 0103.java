
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> answer = new ArrayList<>();
        if (root == null)
            return answer;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean reverse = false;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> subList = new ArrayList<>(levelSize);

            for (int i = 0; i < levelSize; i++) {
                TreeNode current = queue.poll();

                // add depending on direction
                if (!reverse) {
                    subList.add(current.val); // left to right
                } else {
                    subList.add(0, current.val); // right to left
                }

                if (current.left != null)
                    queue.offer(current.left);
                if (current.right != null)
                    queue.offer(current.right);
            }

            answer.add(subList);
            reverse = !reverse;
        }

        return answer;
    }
}
