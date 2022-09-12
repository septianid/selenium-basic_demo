package com.core;

public class CoreJava7_1 extends CoreJava7Inheritance {
      public static void main(String[] args) {
            CoreJava7_1 planeA = new CoreJava7_1();
            planeA.engineGuideline();
            planeA.safetyGuideLine();
            planeA.bodyColor();
      }

      @Override
      public void bodyColor() {
            System.out.println("Green");
      }
}
