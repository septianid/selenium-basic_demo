package com.example;

public class CoreJava2 {
    public static void main(String[] args) {
        int[] arr2 = {1, 2, 4, 5, 6, 7, 8, 9, 10, 126};

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] % 2 == 0)
            {
                System.out.println("Even");
            }
            else
            {
                System.out.println("Odd");
            }
        }
    }
}
