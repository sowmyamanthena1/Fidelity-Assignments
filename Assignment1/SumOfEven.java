package com.Assignment1;

public class SumOfEven {
    public static int SumofEvenNum(int[] array) {
        int sum = 0;
        for(int num: array){
            if(num%2 == 0){
                sum += num;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] numbers = {2,4,6,8,10};
        int sumOfEvens = SumofEvenNum(numbers);
        System.out.println("The sum of even num is " + sumOfEvens);

    }
}
