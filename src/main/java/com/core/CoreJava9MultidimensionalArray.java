package com.core;

public class CoreJava9MultidimensionalArray {
      public static void main(String[] args) {
            
            // int a[][] = new int[2][3];
            int a[][] = {{2, 4, 5}, {3, 4, 7}, {1, 2, 9}};
            int min = a[0][0];
            int minColumn = 0;

            for (int i = 0; i < a.length; i++) {
                  for (int j = 0; j < a[0].length; j++) {
                        if (a[i][j] < min) {
                              min = a[i][j];
                              minColumn = j;
                        }
                  }
            }
            System.out.println(min);

            int max = a[0][minColumn];
            int k = 0;
            while (k < 3) {
                  if (a[k][minColumn] < max) {
                        max = a[k][minColumn];
                  }
                  k++;
            }
            System.out.println(max);
      }
}
