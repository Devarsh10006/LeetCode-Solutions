/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        
        int[][] ans = new int[m][n];

        for (int i = 0; i < m; i++) { Arrays.fill(ans[i], -1); }

        int top = 0, bottom = m - 1;
        int left = 0, right = n - 1;

        while(head != null)
        {
            // Left to Right
            for (int j = left; j <= right && head != null; j++) {
                ans[top][j] = head.val;
                head = head.next;
            }
            top++;

            // Top to Bottom
            for (int i = top; i <= bottom && head != null; i++) {
                ans[i][right] = head.val;
                head = head.next;
            }
            right--;

            // Right to Left
            for (int j = right; j >= left && top <= bottom && head != null; j--) {
                ans[bottom][j] = head.val;
                head = head.next;
            }
            bottom--;

            // Bottom to Top
            for (int i = bottom; i >= top && left <= right && head != null; i--) {
                ans[i][left] = head.val;
                head = head.next;
            }
            left++;
        }

        return ans;
    }
}