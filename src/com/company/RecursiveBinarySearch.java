package com.company;

import java.util.Arrays;

public class RecursiveBinarySearch {

    public static boolean recursiveBinarySearch(float[] arr, float target){
        if(arr.length < 1){
            return false;
        }
        else{
            int midPoint = (int)Math.floor((double)arr.length/2);
            System.out.println(midPoint);
            if(arr[midPoint] == target){
                return true;
            }
            else{
                if(arr[midPoint] < target){
                    return recursiveBinarySearch(Arrays.copyOfRange(arr, midPoint + 1, arr.length), target);
                }
                else{
                    return recursiveBinarySearch(Arrays.copyOfRange(arr, 0, midPoint), target);
                }
            }
        }
    }

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

    boolean myRecursiveBinarySearch(float[] arr, float target){
        if(arr.length == 0){
            return false;
        }
        else{
            int midPoint = (int)Math.floor((double)arr.length/2);
            if(arr[midPoint] == target){
                return true;
            }
            else if(arr[midPoint] > target){
                return myRecursiveBinarySearch(Arrays.copyOfRange(arr,0, midPoint), target);
            }
            else{
                return myRecursiveBinarySearch(Arrays.copyOfRange(arr,midPoint + 1, arr.length), target);
            }
        }
    }

}
