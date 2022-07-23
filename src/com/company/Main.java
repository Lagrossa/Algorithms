package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float[] arr = {0f,1f,2f,3f,4f,5f,6f,7f};
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your target?");
        float target = scanner.nextFloat();
        System.out.println(RecursiveBinarySearch.recursiveBinarySearch(arr,target));
    }

}
