/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        
        while (head != null) {
            
            // If node is already present, cycle exists
            if (set.contains(head)) {
                return true;
            }
            
            // Store the current node
            set.add(head);
            
            // Move to next node
            head = head.next;
        }
        
        // Reached null, so no cycle
        return false;
    }
}