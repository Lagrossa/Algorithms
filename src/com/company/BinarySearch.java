package com.company;

public abstract class BinarySearch {

    public static int binarySearch(float[] args, float target){
        int first = 0;
        int last = args.length-1;

        while(first <= last){
            int midPoint = (int)Math.floor((double)(first+last)/2);
            System.out.println(midPoint);
            if(args[midPoint] == target){
                return midPoint;
            }
            else if(args[midPoint] > target){
                last = midPoint - 1;
            }
            else{
                first = midPoint + 1;
            }
        }

        return -1;
    }
}
