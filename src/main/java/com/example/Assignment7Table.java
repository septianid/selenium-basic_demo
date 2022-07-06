package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7Table {
      public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver/chromedriver");
            WebDriver driver = new ChromeDriver();

            driver.get("https://www.rahulshettyacademy.com/AutomationPractice");

            int columnCount = driver.findElements(By.cssSelector("table[name='courses'] th")).size();
            int rowCount = driver.findElements(By.cssSelector("table[name='courses'] tr")).size();

            System.out.println(driver.findElement(By.cssSelector("table[name='courses'] tr:nth-child(3) td:nth-child(1)")).getText());
            System.out.println(driver.findElement(By.cssSelector("table[name='courses'] tr:nth-child(3) td:nth-child(2)")).getText());
            System.out.println(driver.findElement(By.cssSelector("table[name='courses'] tr:nth-child(3) td:nth-child(3)")).getText());
            System.out.println(rowCount);
            System.out.println(columnCount);
      }
}
