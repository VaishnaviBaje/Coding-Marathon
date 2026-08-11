class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr= head;
        ListNode prev=null;
        while(curr != null){
            
           ListNode tempnode= curr.next;
            curr.next= prev;
            prev= curr;
            curr= tempnode;
        }return prev;
        
        
    }
}
