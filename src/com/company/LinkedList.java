package com.company;

public class LinkedList<E> {
    Node<E> head;
    Node<E> tail;

    boolean isEmpty(){
        return head == null;
    }
}
