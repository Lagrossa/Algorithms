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
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        float[] newList = new float[left.length + right.length];
        int listIndex = 0;
        int x = 0;
        int y = 0;
        while(x < left.length || y < right.length) {
            if(x < left.length){
                if(y < right.length){
                    System.out.println(x + "" + left.length);
                    while(left[x] < right[y]){
                        newList[listIndex] = left[x];
                        listIndex++;
                        x++;
                        break;
                    }
                }
                else{
                    newList[listIndex] = left[x];
                    listIndex++;
                    x++;
                }
            }
            if(y < right.length){
                if(x < left.length){
                    while(left[x] >= right[y]){
                        newList[listIndex] = right[y];
                        listIndex++;
                        y++;
                        break;
                    }
                }
                else{
                    newList[listIndex] = right[y];
                    listIndex++;
                    y++;
                }
            }
        }
        System.out.println(Arrays.toString(newList) + " NEW LIST \n +++++++++++++++++++++++++++++");
        return newList;
    }
}
