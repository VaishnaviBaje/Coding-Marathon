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
    public boolean isPalindrome(ListNode head) {  
    List<Integer> original = new ArrayList<>();
    ListNode temp = head;
    while (temp != null) {
        original.add(temp.val);
        temp = temp.next;
    }   
    ListNode curr = head;
    ListNode prev = null;
    while (curr != null) {
        ListNode tempnode = curr.next;
        curr.next = prev;
        prev = curr;
        curr = tempnode;
    }
    ListNode second = prev;
    int i = 0;
    while (second != null) {
        if (original.get(i) != second.val) {
            return false;
        }
        i++;  
        second = second.next;
    }   
    return true;
}
}
