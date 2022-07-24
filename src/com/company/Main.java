package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //SET 1 ALGORITHMS.
//        boolean checking = true;
//        float[] arr = {0f,1f,2f,3f,4f,5f,6f,7f};
//        while(checking) {
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("What's your target?");
//            float target = scanner.nextFloat();
//            System.out.println(RecursiveBinarySearch.myBinaryRecursionSearch(arr, target));
//            System.out.println("Try Again?");
//            boolean yn = scanner.nextBoolean();
//
//            if (yn) {
//                checking = checking;
//            } else if (!(yn)) {
//                checking = !checking;
//            }
//        }
        //SET 2 - NODES/ LINKED LIST.
//        Node<Integer> N1 = new Node<>(5);
//        Node<Integer> N2 = new Node<>(6);
//        Node<Integer> N3 = new Node<>(6);
//        Node<Integer> N4 = new Node<>(6);
//        N1.nextNode = N2;
//        N2.nextNode = N3;
//        N3.nextNode = N4;
//
//        System.out.println(N1.nextNode.getInfo());
        LinkedList<Integer> Llist = new LinkedList<>();
//        Llist.head = N1;
//        System.out.println(Llist.isEmpty());
//        System.out.println(Llist.size());
        Llist.add(4);
        Llist.add(5);
        Llist.add(6);
        Llist.add(14);
        Llist.add(66);
        Llist.add(23);
        Llist.add(33);
        Llist.add(7);

        Node<Integer> test = Llist.search(5);
        System.out.println(test);
        System.out.println(Llist.toString());
        Llist.insert(3,8);
        System.out.println(Llist.toString());
        Llist.remove(8);
        System.out.println(Llist.toString());
    }

}
