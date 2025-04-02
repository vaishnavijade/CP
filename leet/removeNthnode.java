class removeNthnode{
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int k=0;
        ListNode curr=head;
        while(curr!=null){
            curr=curr.next;
            k++;
        }if(k-n==0) return head.next;
        curr=head;
        for(int i=1;i<k-n;i++){
            curr=curr.next;
        }
        curr.next=curr.next.next;
        return head;
    }
}
/*Example 1:


Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
Example 2:

Input: head = [1], n = 1
Output: []
Example 3:

Input: head = [1,2], n = 1
Output: [1] */