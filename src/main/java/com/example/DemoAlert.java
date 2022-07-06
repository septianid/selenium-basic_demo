package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAlert {
      public static void main(String[] args) throws InterruptedException {
            String name = "Gestapo";
            System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver/chromedriver");
            WebDriver driver = new ChromeDriver();

            driver.get("https://rahulshettyacademy.com/AutomationPractice/");
            driver.findElement(By.id("name")).sendKeys(name);
            driver.findElement(By.id("alertbtn")).click();

            Thread.sleep(2000);

            System.out.println(driver.switchTo().alert().getText());
            driver.switchTo().alert().accept();

            driver.findElement(By.id("confirmbtn")).click();

            Thread.sleep(2000);

            driver.switchTo().alert().dismiss();
      }
}
