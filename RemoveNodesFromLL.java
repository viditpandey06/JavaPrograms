import java.util.Scanner;

public class RemoveNodesFromLL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the linked list:");
        int n = scanner.nextInt();

        System.out.println("Enter the elements of the linked list:");
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int i = 0; i < n; i++) {
            current.next = new ListNode(scanner.nextInt());
            current = current.next;
        }

        Solution solution = new Solution();
        ListNode result = solution.removeNodes(dummy.next);

        System.out.println("Linked list after removing nodes:");
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode removeNodes(ListNode head) {
        // Implement the removeNodes function here
        
        if (head == null) {
            return null;
            
        }
        head=reverseNodes(head)
        int max=head.val;
        ListNode prev=head;
        ListNode current=head.next;
        while(current!=null){
            if(current.val>=max){
                max=current.val;
                prev=current;
                current=current.next;
            }
            else{
                current=current.next;

            }
        }
        return reverseNodes(head);
        
        
        
        
     
    }

    public ListNode reverseNodes(ListNode head) {
        ListNode prev = null;
        ListNode temp = head;
        while (temp != null) {
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        return prev;
    }
}