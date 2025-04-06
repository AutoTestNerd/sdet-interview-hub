package com.sdet.InterviewPrograms;


class Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next =null;

    }
}
public class ReverseLinkedList_27 {

    public static Node reverseLinkedList(Node head){

        Node prev =null;
        Node cur = head;
         while(cur!=null){
             Node temp= cur.next;
             cur.next=prev;
             prev = cur;
             cur=temp;
         }
         return prev;
    }
    public static void displayList(Node head){
        while(head!=null){
            System.out.println(head.data + "");
            head=head.next;
        }
    }
    public static void main(String[] args) {
        Node list = new Node(1);
        list.next = new Node(2);
        list.next.next = new Node(3);
        list.next.next.next = new Node(4);
        list.next.next.next.next = new Node(5);
        displayList(list);
        Node res = reverseLinkedList(list);
        System.out.println();
        displayList(res);
    }
}
