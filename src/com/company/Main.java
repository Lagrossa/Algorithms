package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
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
        Node<Integer> N1 = new Node<>(5);
        Node<Integer> N2 = new Node<>(6);
        N1.nextNode = N2;
        N2.nextNode = N1;
        System.out.println(N1.nextNode.getInfo());

    }

}
