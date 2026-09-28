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
        // step1 -> find mid
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next !=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        

        // step2 -> reverse half
        ListNode prev = null;
        ListNode curr = slow;
        ListNode  next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode right = prev;  //right half ka head
        ListNode left = head; //left half ka head


        // step3 ->check ist half == 2nd half

        while(right!= null ) {
            if(right.val != left.val) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
}