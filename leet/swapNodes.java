package leet;
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
class swapNodes {
    public ListNode swapNodes(ListNode head, int k) {
        int len=0;
        ListNode first=head,second=head,curr=head;
        while(curr!=null){
            len++;
            curr=curr.next;
        }
        for(int i=1;i<k;i++){
            first=first.next;   
        }
        curr=head;
        for(int i=1;i<len-k+1;i++){
            second=second.next;
        }int swapVal=first.val;
        first.val=second.val;
        second.val=swapVal;

        return head;
    }
}/*Input: head = [1,2,3,4,5], k = 2
Output: [1,4,3,2,5]
Example 2:

Input: head = [7,9,6,6,7,8,3,0,9,5], k = 5
Output: [7,9,6,6,8,7,3,0,9,5] */
