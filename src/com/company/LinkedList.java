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
    /*
    Inserts a new node as the head. The previous head then becomes a 'normal' node.
    @param data The data of the new node.
     */
    void add(E data){
        Node<E> node = new Node<>(data);
        node.nextNode = head;
        head = node;
    }
}
