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

    /*
    Inserts a given point of data at the index parameter in the linked list.
    @param data The data of the new node.
    @param index The index your data will be inserted.
    */
    void insert(E data, int index){
        if(index == 0){
            add(data);
        }
        else{
            Node<E> current = head;
            for(int i = 0; i < index-1; i++){
                current = current.nextNode;
            }
            Node<E> insertNode = new Node<>(data);
            insertNode.nextNode = current.nextNode;
            current.nextNode = insertNode;
        }
    }
    /*
        Removes the node at a specified index.
        @param index The index that should be removed from your data.
        */
    void remove(int index){
        if(index == 0){
            head = head.nextNode;
        }
        else {
            Node<E> current = head;
            Node<E> prevNode = current;
            for (int x = 0; x < index; x++) {
                prevNode = current;
                current = current.nextNode;
            }
            prevNode.nextNode = current.nextNode;
        }
    }
    /*
    Search and returns the first item in the list to match the key. Otherwise, will return null.
     */
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

    public String toString(){
        String myReturn = "";
        Node<E> current = head;
        while(current != null){
            if(current == head){
                myReturn += "HEAD " + current.toString() + " -> ";
            }
            else if(current.nextNode == null){
                myReturn += "> " + current.toString() + " TAIL";
            }
            else{
                myReturn += current.toString() + "-";
            }
            current = current.nextNode;
        }
        return myReturn;
    }
}
