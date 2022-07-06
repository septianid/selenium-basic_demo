package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5Frame {
      public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver/chromedriver");
            WebDriver driver = new ChromeDriver();

            driver.get("https://the-internet.herokuapp.com");

            driver.findElement(By.linkText("Nested Frames")).click();

            Thread.sleep(3000);

            // System.out.println(driver.findElements(By.name("frameset-middle")).size());

            driver.switchTo().frame(driver.findElement(By.name("frame-top")));
            driver.switchTo().frame(driver.findElement(By.name("frame-middle")));

            System.out.println(driver.findElement(By.id("content")).getText());
      }
}
