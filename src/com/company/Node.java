package com.company;

public class Node<E> {
    E data;
    Node<E> nextNode;

    Node(E data){
        this.data = data;
    }

    E getInfo(){
        return data;
    }

    public String toString(){
        return "[" + data.toString() +"]";
    }
}
