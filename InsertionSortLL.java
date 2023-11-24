/*
 * dummy = ListNode(-1)
 * dummy->next=null
 * cur=head
 * while(cur!=none){
 * prev=dummy
 * while(prev->next!=null&&prev.next.val<cur.val){
 * prev=prev->next
 * }
 * NXT=cur->next
 * cur->next=prev->next
 * prev->next=cur
 * cur=NXT
 * }
 * return dummy->next;
 */
public class InsertionSortLL {
    
}
