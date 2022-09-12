package com.core;

public class CoreJava6Interface implements CoreJava6_1, CoreJava6_2 {
      public static void main(String[] args) {
            CoreJava6_1 traffic = new CoreJava6Interface();
            traffic.greenGo();
            traffic.yellowAware();
            traffic.redStop();

            CoreJava6_2 train = new CoreJava6Interface();
            train.trainSystem();
      }

      @Override
      public void greenGo() {
            System.out.println("Green");
      }

      @Override
      public void redStop() {
            System.out.println("Red");
      }

      @Override
      public void yellowAware() {
            System.out.println("Yellow");
      }

      @Override
      public void trainSystem() {
            System.out.println("Train System");
      }
}
