package com.core;

public class CoreJava8Overload {
      public void getData(int a) {
            System.out.println(a);
      }

      public void getData(String a) {
            System.out.println(a);
      }
      
      public void getData(int a,int b) {
            System.out.println(b);
      }

      public static void main(String[] args) {
            
            CoreJava8Overload child = new CoreJava8Overload();
            child.getData(2);
            child.getData("hello");
            child.getData(2, 5);
      }
}
