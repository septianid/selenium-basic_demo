package com.example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DemoTable1 {
      public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver/chromedriver");
            WebDriver driver = new ChromeDriver();

            driver.get("https://www.rahulshettyacademy.com/AutomationPractice");

            JavascriptExecutor js = (JavascriptExecutor)driver;

            js.executeScript("window.scrollBy(0, 500)");
            Thread.sleep(3000);
            js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");

            List<WebElement> valueList = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
            int sum = 0;

            for (int i = 0; i < valueList.size(); i++) {
                  sum = sum + Integer.parseInt(valueList.get(i).getText());
            }

            System.out.println(sum);
            driver.findElement(By.cssSelector(".totalAmount")).getText();
            int total = Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());

            Assert.assertEquals(sum, total);
      }
}
