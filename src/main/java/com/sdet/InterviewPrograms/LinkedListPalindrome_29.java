package com.sdet.InterviewPrograms;


class ListNode{
    String data;
    ListNode next;

    ListNode(String data){
        this.data=data;
        this.next=null;
    }
}
public class LinkedListPalindrome_29 {
    public static boolean isPalindromeLinkedList(ListNode head){
        ListNode mid = findMidLinkedList(head);
        ListNode last= reverseLinkedList(mid.next);
        ListNode cur=head;
        while (last!=null){
            if(last.data!=cur.data){
                return false;
            }
            else {
                last =last.next;
                cur= cur.next;
            }
        }
        return true;
    }

    public static ListNode findMidLinkedList(ListNode head){
        ListNode fast=head;
        ListNode slow =head;
        while(fast!=null & fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static ListNode reverseLinkedList(ListNode head){
        ListNode cur=head;
        ListNode prev =null;
        while(cur!=null){

            ListNode temp = cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode("m");
        node.next = new ListNode("a");
        node.next.next = new ListNode("d");
        node.next.next.next = new ListNode("a");
        node.next.next.next.next = new ListNode("m");
        boolean istru= isPalindromeLinkedList(node);
        if (istru){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");

        }

    }
}
