package com.Assignment3;

import java.util.Scanner;

public class SentenceReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String string = sc.nextLine();
        String[] words = string.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if(i>0){
                reversed.append(" ");
            }
        }
        System.out.println(reversed);
        sc.close();
    }
}
