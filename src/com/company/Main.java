package com.company;

import java.util.Arrays;
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
        LinkedList<Float> Llist = new LinkedList<>();
//        Llist.head = N1;
//        System.out.println(Llist.isEmpty());
//        System.out.println(Llist.size());
        Llist.add(4.0f);
        Llist.add(5.0f);
        Llist.add(6f);
        Llist.add(14f);
        Llist.add(66f);
        Llist.add(23f);
        Llist.add(33f);
        Llist.add(7f);

        Node<Float> test = Llist.search(5f);
        System.out.println(test);
        System.out.println(Llist.toString());
        Llist.insert(3f,8);
        System.out.println(Llist.toString());
        Llist.remove(8);
        System.out.println(Llist.toString());
        float[] arrayTest = {5 ,4 , 4, 4 , 2, 3, 1, 6, 4, 4, 7, 8};
        System.out.println(Arrays.toString(MergeSort.mergeSort(arrayTest)));
    }

}
