package com.company;

import java.util.Arrays;

public class RecursiveBinarySearch {
    public static boolean myBinaryRecursionSearch(float[] arr, float target){
        if(arr.length == 0){
            return false;
        }
        else{
            int midPoint = (int)Math.floor((double)arr.length/2);
            if(arr[midPoint] == target){
                return true;
            }
            else if(arr[midPoint] < target){
                return myBinaryRecursionSearch(Arrays.copyOfRange(arr, midPoint + 1, arr.length),target);
            }
            else{
                return myBinaryRecursionSearch(Arrays.copyOfRange(arr, 0, midPoint),target);
            }
        }
    }
}
