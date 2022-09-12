package com.core;

public class CoreJava15Static {

      String name;
      String address;
      static String city = "Bandung";
      static int i = 0;

      CoreJava15Static(String n, String a) {
            this.name = n;
            this.address = a;
            i++;
            System.out.println(i);
      }

      public void getAddress() {
            System.out.println(address);
      }

      public static void getCity() {
            System.out.println(city);
      }

      public static void main(String[] args) {
            
            CoreJava15Static obj1 = new CoreJava15Static("Gestapo", "Serpong");
            CoreJava15Static obj2 = new CoreJava15Static("Blyat", "Kebayoran");

            obj1.getAddress();
            obj2.getAddress();

            CoreJava15Static.getCity();
            CoreJava15Static.i = 4;
            obj1.address = "JNJNO";
      }
}
