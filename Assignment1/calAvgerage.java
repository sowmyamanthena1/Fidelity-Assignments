package com.Assignment1;

public class calAvgerage {
    public static void main(String[] args){
        int[] num={10,20,30,40,50};
        double avg = CalAvgerage(num);
        System.out.println("Average of numbers is" + avg);
    }
    public static double CalAvgerage(int[] nums){
        int sum = 0;
        for(int num:nums){
            sum += num;
        }
        return (double)sum/nums.length;
    }
}
