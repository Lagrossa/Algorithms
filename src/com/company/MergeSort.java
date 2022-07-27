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

            return merge(leftList, rightList);
        }
    }

    public static float[] merge(float[] left, float[] right){
        float[] newList = new float[left.length];
        int listIndex = 0;
        for(int x = 0; x < left.length-1; x++){
            for(int y = 0; y < left.length-1; y++){
                if(x > y){
                    newList[listIndex] = y;
                    listIndex++;
                    newList[listIndex] = x;
                }
                else{
                    newList[listIndex] = x;
                    listIndex++;
                    newList[listIndex] = y;
                }
            }
        }

        return newList;
    }
}
