package com.company;

public class LinkedList<E> {
    Node<E> head;
    Node<E> tail;

    boolean isEmpty(){
        return head == null;
    }

    int size(){
        int count = 1;
        Node<E> current = head;
        while(current.nextNode != null){
            count++;
            current = current.nextNode;
        }
        return count;
    }
}
