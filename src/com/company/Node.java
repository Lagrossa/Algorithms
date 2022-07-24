package com.company;

public class Node<E> {
    E self;
    Node<E> nextNode;

    Node(E data){
        this.self = data;
    }

    E getInfo(){
        return self;
    }
}
