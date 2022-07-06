package com.example;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class DemoGlobalVariable {
      public static void main(String[] args) throws IOException {
            
            Properties props = new Properties();

            FileInputStream in = new FileInputStream("src/main/resources/global.properties");
            props.load(in);

            System.out.println(props.getProperty("browser"));
            System.out.println(props.getProperty("url"));

            props.setProperty("browser", "firefox");
            System.out.println(props.getProperty("browser"));

            FileOutputStream out = new FileOutputStream("src/main/resources/global.properties");
            props.store(out, null);
      }
}
