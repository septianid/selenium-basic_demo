package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoAction {
      public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().fullscreen();
            driver.get("https://amazon.com/");

            Actions action = new Actions(driver);
            WebElement move = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));

            action.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click()
                  .keyDown(Keys.SHIFT)
                  .sendKeys("hello")
                  .build()
                  .perform();
            
            action.moveToElement(move).contextClick().build().perform();
      }
}
