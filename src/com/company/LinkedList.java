package com.company;

public class LinkedList<E> {
    Node<E> head;
    Node<E> tail;

    /*
    Checks to see if the linked list is empty.
    */
    boolean isEmpty(){
        return head == null;
    }
    /*
    Returns the size of the linked list as an integer.
    */
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

    Node<E> search(E key){
        Node<E> current = head;
        while(current != null){
            if(current.data == key){
                return current;
            }
            else{
                current = current.nextNode;
            }
        }
        return null;
    }
}
