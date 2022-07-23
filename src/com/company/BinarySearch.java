package com.company;

public abstract class BinarySearch {

    public static int binarySearch(float[] args, float target){
        int first = 0;
        int last = args.length-1;

        while(first <= last){
            int midPoint = (int)Math.floor((double)(last-first)/2);
            if(args[first+midPoint] > target){
                last = first+midPoint;
            }
            else if(args[first+midPoint] < target){
                first = first+midPoint;
            }
            else {
                return midPoint;
            }
        }

        return -1;
    }
}
