package com.example;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4WindowHandle {
      public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver/chromedriver");
            WebDriver driver = new ChromeDriver();

            driver.get("https://the-internet.herokuapp.com");
            driver.findElement(By.linkText("Multiple Windows")).click();
            
            Thread.sleep(3000);

            driver.findElement(By.linkText("Click Here")).click();
            Set<String> window = driver.getWindowHandles();
            String parentWindow = driver.getWindowHandle();
            Iterator<String> iterate = window.iterator();

            while (iterate.hasNext()) {
                  String childWindow = iterate.next();
                  if (!parentWindow.equalsIgnoreCase(childWindow)) {
                        driver.switchTo().window(childWindow);
                        System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
                  }
            }

            driver.switchTo().window(parentWindow);
            System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
      }
}
