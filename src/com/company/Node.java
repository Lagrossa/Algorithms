package com.company;

public class Node<E> {
    E self;
    Node<E> nextNode;

    Node(E data, Node<E> nextNode){
        this.self = data;
        this.nextNode = nextNode;
    }

    E getInfo(){
        return self;
    }
}
