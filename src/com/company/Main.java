package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        float[] arr = {1f,2f,3f,4f,5f,6f,7f,8f};
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your target?");
        float target = scanner.nextFloat();
        System.out.println(LinearSearch.linearSearch(arr, target));
    }

}
