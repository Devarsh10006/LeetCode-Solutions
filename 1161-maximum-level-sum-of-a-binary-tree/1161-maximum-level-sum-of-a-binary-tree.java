// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
class Solution {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        int currentLevel = 1;
        int maxLevel = 1;
        int currentMax = root.val;

        while(!q.isEmpty())
        {
            int size = q.size(); // ek level na nodes
            int sum = 0;         // us level no sum

            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                sum += node.val;

                if (node.left != null)
                    q.add(node.left);
                if (node.right != null)
                    q.add(node.right);
            }

            if (sum > currentMax) {
                currentMax = sum;
                maxLevel = currentLevel;
            }

            currentLevel++;
        } 

        return maxLevel;
    }
}