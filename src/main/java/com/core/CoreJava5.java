package com.core;

public class CoreJava5 {
      public static void main(String[] args) {
            int k = 1;
            for (int i = 1; i < 4; i++) {
                  for (int j = 1; j <= 4 - i; j++) {
                        System.out.print(k);
                        System.out.print("\t");
                        k++;
                  }
            }

            for (int i = 1; i < 5; i++) {
                  for (int j = 1; j <= i; j++) {
                        // int l = 1;
                        System.out.print(j);
                        System.out.print("\t");
                        // l++;
                  }
                  System.out.println("");
            }
      }
}
