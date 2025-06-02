package com.sdet.InterviewPrograms.MediumPrograms_Level2;

import java.util.HashMap;
import java.util.Map;

public class LRUCache {

    class Node {
        int key,value;
        Node prev,next;

        Node(int k ,int v){
            key =k;
            value=v;

        }
    }
private final int capacity;
    private  HashMap<Integer,Node> map ;
    private Node head ,tail;
    public  LRUCache(int capacity){
        this.capacity = capacity;
        map= new HashMap<>();
        head = new Node(0,0);
        tail =  new Node(0,0);
        head.next=tail;
        tail.prev=head;

    }

    public void put(int key,int value){
        if(map.containsKey(key)){
            remove(map.get(key));
        }
        if(map.size()==capacity){
            remove(tail.prev);
        }

        Node newnnode = new Node(key, value);
        insertToHead(newnnode);
    }
    public int get(int key){
        if(map.containsKey(key)){
            Node node = map.get(key);
            remove(node);
            insertToHead(node);
            return node.value;
        }
        return -1;
    }
    private void insertToHead(Node node){
        map.put(node.key, node);
        node.next=head.next;
        node.prev=head;
        head.next.prev=node;
        head.next=node;
    }
    private void remove(Node node){
        map.remove(node.key);
        node.prev.next=node.next;
        node.next.prev=node.prev;

    }
    public static void main(String[] args) {
LRUCache cache = new LRUCache(2);
        cache.put(1, 1); // cache: {1=1}
        cache.put(2, 2); // cache: {2=2, 1=1}
        System.out.println(cache.get(1)); // returns 1, cache: {1=1, 2=2}
        cache.put(3, 3); // evicts key 2, cache: {3=3, 1=1}
        System.out.println(cache.get(2)); // returns -1 (not found)
        cache.put(4, 4); // evicts key 1, cache: {4=4, 3=3}
        System.out.println(cache.get(1)); // returns -1 (not found)
        System.out.println(cache.get(3)); // returns 3
        System.out.println(cache.get(4)); // returns 4



    }
}
