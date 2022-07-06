package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8AutoComplete {
      public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver/chromedriver");
            WebDriver driver = new ChromeDriver();

            driver.get("https://www.rahulshettyacademy.com/AutomationPractice");

            driver.findElement(By.id("autocomplete")).sendKeys("Ind");
            Thread.sleep(3000);
            driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
            driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
            driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

            driver.findElement(By.id("autocomplete")).sendKeys(Keys.ENTER);

            System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
      }
}
