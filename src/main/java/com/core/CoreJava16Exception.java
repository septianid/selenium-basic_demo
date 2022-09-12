package com.core;

public class CoreJava16Exception {

      int a = 4;

      public static void main(String[] args) {

            int b = 7;
            int c = 0;
            
            try {
                  int d = b / c;
                  System.out.println(d);
            }
            catch (ArithmeticException e) {
                  System.out.println("Arithmetic Error");
            }
            catch (IndexOutOfBoundsException e) {
                  System.out.println("Array Length Error");
            }
            catch (Exception e) {
                  System.out.println("General Error");
            }
            finally {
                  System.out.println("Final executed");
            }
      }
}
