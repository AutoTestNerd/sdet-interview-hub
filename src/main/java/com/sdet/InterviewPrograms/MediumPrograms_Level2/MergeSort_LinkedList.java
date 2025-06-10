package com.sdet.InterviewPrograms.MediumPrograms_Level2;
//youTube- https://www.youtube.com/watch?v=ClLO6kFF6gs
class MergeNode {
    int data;
    MergeNode next;

    MergeNode(int data){
        this.data = data;
        this.next = null;
    }
}

public class MergeSort_LinkedList {

    public static MergeNode mergeSort(MergeNode head){
        if (head == null || head.next == null) {
            return head;
        }

        MergeNode mid = getMid(head);
        MergeNode rightHead = mid.next;
        mid.next = null;

        MergeNode left = mergeSort(head);
        MergeNode right = mergeSort(rightHead);

        return merge(left, right);
    }

    public static MergeNode merge(MergeNode l1, MergeNode l2){
        MergeNode dummy = new MergeNode(-1);
        MergeNode tail = dummy;

        while (l1 != null && l2 != null) {
            if (l1.data <= l2.data) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        if (l1 != null) {
            tail.next = l1;
        }
        if (l2 != null) {
            tail.next = l2;
        }

        return dummy.next;
    }

    public static MergeNode getMid(MergeNode head){
        MergeNode slow = head;
        MergeNode fast = head;

        // Use fast.next to avoid null pointer when accessing fast.next.next
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void printList(MergeNode head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MergeNode head = new MergeNode(4);
        head.next = new MergeNode(2);
        head.next.next = new MergeNode(1);
        head.next.next.next = new MergeNode(3);

        System.out.println("Original list:");
        printList(head);

        head = mergeSort(head);

        System.out.println("Sorted list:");
        printList(head);
    }
}
