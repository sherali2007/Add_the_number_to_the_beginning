package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] array = {6, 25, 91, 23, 72, 9, 18, 6};
        int n = 13;

        int[] mas = new int[array.length + 1];
        mas[0] = n ;

        for (int i = 1; i < array.length+1; i++) {
            mas[i] = array[i-1];
        }

        System.out.println(Arrays.toString(mas));
    }
}
