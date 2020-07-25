public class ReverseLinkedList {
    public static void main(String[] args) {

        ListNode x = new ListNode(2);
        ListNode head = x;
        x.next = new ListNode(3);
        x = x.next;
        x.next = new ListNode(4);
        ListNode res = reverseList(head);
        while (head.next != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null)
            return head;
        if (head.next == null)
            return head;
        ListNode node = reverseList(head.next);


        head.next.next = head;
        head.next = null;
        System.out.println(node.val);
        return node;
    }
}