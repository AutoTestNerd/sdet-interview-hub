package com.sdet.InterviewPrograms;

public class LoopInLinkedList_28 {


    public static boolean hasLoop(Node head){
        Node fast =head;
        Node slow = head;
        while(fast!=null && fast.next!=null){
            slow =slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
      Node ll = new Node(1);
         ll.next = new Node(2);
         ll.next.next = new Node(3);
         ll.next.next.next = ll.next;
        System.out.println(hasLoop(ll) ? "Loop detected" : "No loop");

    }
}
