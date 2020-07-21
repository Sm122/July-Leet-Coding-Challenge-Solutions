class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null)
            return null;
        while(head!=null && head.val==val)
            head=head.next;
        ListNode ctr = head;
        while(ctr!=null && ctr.next!= null)
        {
            if(ctr.next.val==val)
            {
                ctr.next=ctr.next.next;
            }
            else
                ctr=ctr.next;
        }
        return head;
    }
}