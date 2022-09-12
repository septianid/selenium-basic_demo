package com.core;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CoreJava10Date {
      public static void main(String[] args) {
            
            Date date = new Date();
            SimpleDateFormat simple = new SimpleDateFormat("d/M/yyyy hh:mm:ss");

            System.out.println(simple.format(date));
            System.out.println(date);
      }
}
