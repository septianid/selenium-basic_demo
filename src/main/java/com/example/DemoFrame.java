package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoFrame {
      public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver/chromedriver");
            WebDriver driver = new ChromeDriver();

            driver.get("http://jqueryui.com/droppable");
            
            System.out.println(driver.findElements(By.tagName("iframe")).size());
            // driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
            // driver.findElement(By.id("draggable")).click();
            driver.switchTo().frame(0);
            Actions action = new Actions(driver);
            WebElement source = driver.findElement(By.id("draggable"));
            WebElement target = driver.findElement(By.id("droppable"));

            action.dragAndDrop(source, target).build().perform();
            driver.switchTo().defaultContent();
      }
}
