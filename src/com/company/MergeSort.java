package com.company;

import java.util.Arrays;

public abstract class MergeSort {
    /*
    Sorts a given list in ascending order. The function will return a sorted list.
     */
    public static float[] mergeSort(float[] list){

        /*
        Divide: Divide the list into sorted sublists
        Conquer: Recursively sort each list
        Combine: Combine the sorted lists into a singular sorted list.
         */
        if(list.length <= 1){
            return list;
        }
        else{
            float[] leftList = mergeSort(Arrays.copyOfRange(list, 0, (int)Math.floor((double)list.length/2)));
            float[] rightList = mergeSort(Arrays.copyOfRange(list, (int)Math.floor((double)list.length/2), list.length));

            System.out.println(Arrays.toString(leftList));
            System.out.println(Arrays.toString(rightList));
            return merge(leftList, rightList);
        }
    }

    public static float[] merge(float[] left, float[] right){
        System.out.println("LLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL");
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        float[] newList = new float[left.length + right.length];
        int listIndex = 0;
        int x = 0;
        int y = 0;
        while(x < left.length || y < right.length) {
            if(x < left.length){
                System.out.println("TATATATATATA");
                System.out.println("TRUE");
                if(y < right.length){
                    System.out.println(x + "" + left.length);
                    while(left[x] < right[y]){
                        newList[listIndex] = left[x];
                        listIndex++;
                        x++;
                        System.out.println(Arrays.toString(newList) + " NEW LIST UPDATED IN LOOP 1 \n ");
                        break;
                    }
                }
                else{
                    System.out.println("DOIN THIS ELSE 1");
                    newList[listIndex] = left[x];
                    listIndex++;
                    x++;
                    System.out.println(Arrays.toString(newList) + " NEW LIST UPDATED IN LOOP 1 Y MAX CAPACITY\n ");
                }
            }
            if(y < right.length){
                System.out.println("TETETETETE");
                if(x < left.length){
                    System.out.println("DOIN THIS BREAKS 2");
                    while(left[x] >= right[y]){
                        newList[listIndex] = right[y];
                        listIndex++;
                        y++;
                        System.out.println(Arrays.toString(newList) + " NEW LIST UPDATED IN LOOP 2 \n ");
                        break;
                    }
                }
                else{
                    newList[listIndex] = right[y];
                    listIndex++;
                    y++;
                    System.out.println(Arrays.toString(newList) + " NEW LIST UPDATED IN LOOP 2 X MAX CAPCITY \n ");
                }
            }
        }
        System.out.println(Arrays.toString(newList) + " NEW LIST \n +++++++++++++++++++++++++++++");
        return newList;
    }
}
