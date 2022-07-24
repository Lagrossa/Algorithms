package com.company;

public class LinkedList<E> {
    Node<E> head;
    Node<E> tail;

    boolean isEmpty(){
        return head == null;
    }

    int size(){
        int count = 0;
        Node<E> current = head;
        while(current != null){
            count++;
            current = current.nextNode;
        }
        return count;
    }
}
