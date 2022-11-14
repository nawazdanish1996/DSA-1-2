package com.linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkedList {
    // Reverse Linked list in java

    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            data = data;
            next = null;
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> result = new LinkedList<>();

        result.add(1);
        result.add(2);
        result.add(3);
        result.add(4);

        System.out.println(result);

        Collections.reverse(result);
        System.out.println(result);
    }

    public void reverse(){
        if(head == null || head.next == null){
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            // update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

}
