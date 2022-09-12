package com.core;

public class CoreJava12Constructor {

      public CoreJava12Constructor () {
            System.out.println("Default Constructor");
      }

      public CoreJava12Constructor (int a, int b) {
            System.out.println("Parameterized Constructor");
            int c = a + b;
            System.out.println(c);
      }

      public CoreJava12Constructor(String str) {
            System.out.println("Assignable Constructor");
            System.out.println(str);
      }

      public static void main(String[] args) {
            CoreJava12Constructor cons = new CoreJava12Constructor();
            CoreJava12Constructor cons1 = new CoreJava12Constructor(4, 7);
            CoreJava12Constructor cons2 = new CoreJava12Constructor("test");

            System.out.println(cons);
            System.out.println(cons1);
            System.out.println(cons2);
      }
}
