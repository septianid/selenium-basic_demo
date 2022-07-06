package com.example;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoScopeTest {
      public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver/chromedriver");
            WebDriver driver = new ChromeDriver();

            driver.get("https://www.rahulshettyacademy.com/AutomationPractice");

            System.out.println(driver.findElements(By.tagName("a")).size());

            WebElement footerDriver = driver.findElement(By.id("gf-BIG"));

            System.out.println(footerDriver.findElements(By.tagName("a")).size());

            WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
            System.out.println(columnDriver.findElements(By.tagName("a")).size());

            for (int i = 1; i < columnDriver.findElements(By.tagName("a")).size(); i++) {
                  String clickLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);

                  columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickLinkTab);
                  Thread.sleep(5000);
            }

            Set<String> windowSet = driver.getWindowHandles();
            Iterator<String> i = windowSet.iterator();

            while (i.hasNext()) {
                  driver.switchTo().window(i.next());
                  System.out.println(driver.getTitle());
            }
      }
}
