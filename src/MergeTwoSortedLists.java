public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode l = l1.val < l2.val? l1:l2;
        l.next = l1.val < l2.val?mergeTwoLists(l1.next, l2):mergeTwoLists(l1, l2.next);
        return l;
    }
}

///**
// * Definition for singly-linked list.
// * public class ListNode {
// *     int val;
// *     ListNode next;
// *     ListNode(int x) { val = x; }
// * }
// */
//class Solution {
//    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        ListNode l3 = null;
//        ListNode head = l3;
//
//        while(l1.next != null && l2.next != null){
//            if(l1.val < l2.val){
//                l3 = new ListNode(l1.val);
//                l1 = l1.next;
//                l3 = l3.next;
//            }
//            else{
//                if(l1.val > l2.val){
//                    l3 = new ListNode(l2.val);
//                    l1 = l1.next;
//                    l3 = l3.next;
//                }
//            }
//        }
//
//        while(l1.next!=null){
//            l3.next = new ListNode(l1.val);
//            l1 = l1.next;
//            l3 = l3.next;
//        }
//
//        while(l2.next!=null){
//            l3.next = new ListNode(l2.val);
//            l2 = l2.next;
//            l3 = l3.next;
//        }
//        return head.next;
//    }
//}
