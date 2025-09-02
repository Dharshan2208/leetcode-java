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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<TreeNode>();
        List<List<Integer>> answer = new LinkedList<List<Integer>>();

        if (root == null)
            return answer;

        q.offer(root);

        while (!q.isEmpty()) {
            int level = q.size();

            List<Integer> subList = new LinkedList<Integer>();

            for (int i = 0; i < level; i++) {

                if (q.peek().left != null) {
                    q.offer(q.peek().left);
                }
                if (q.peek().right != null) {
                    q.offer(q.peek().right);
                }

                subList.add(q.poll().val);
            }
            answer.add(subList);
        }

        // return answer;

        // using big brain instead of thinking of another logic i just reversed the list
        List<List<Integer>> reverse_answer = new LinkedList<List<Integer>>();
        for (int i = answer.size() - 1; i >= 0; i--) {
            reverse_answer.add(answer.get(i));
        }

        return reverse_answer;
    }

    // will think how to do it
}