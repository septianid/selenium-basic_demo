package com.core;

import java.util.Calendar;

public class CoreJava11Calendar {
      public static void main(String[] args) {
            
            Calendar calendar = Calendar.getInstance();
            // SimpleDateFormat simple = new SimpleDateFormat("d/M/yyyy hh:mm:ss");

            System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
            System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
            System.out.println(calendar.get(Calendar.AM_PM));
            System.out.println(calendar.get(Calendar.MINUTE));
      }
}
