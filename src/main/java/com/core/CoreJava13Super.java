package com.core;

public class CoreJava13Super extends CoreJava13_1 {

      String name = "QA Academy";

      public CoreJava13Super() {
            super();
            System.out.println("Child constructor");
      }

      public void getStringData() {
            System.out.println(name);
            System.out.println(super.name);
      }

      public void getData() {
            super.getData();
            System.out.println("In child class");
      }

      public static void main(String[] args) {
            CoreJava13Super child = new CoreJava13Super();
            child.getStringData();
            child.getData();
      }
}
