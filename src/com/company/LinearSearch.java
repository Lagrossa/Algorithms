package com.company;

public abstract class LinearSearch {

    public static int linearSearch(float[] args, float target){
        for(int i = 0; i < args.length; i++){
            if(args[i] == target){
                return i;
            }
        }
        return -1;
    }
}
