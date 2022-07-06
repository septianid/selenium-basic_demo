package com.example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoCalendar {
      public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver/chromedriver");
            WebDriver driver = new ChromeDriver();

            driver.get("https://www.path2usa.com/travel-companions");
            // April 23
            driver.findElement(By.xpath(".//*[@id='travel_date']")).click();
            while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("April")){
                  driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
            }

            List<WebElement> dates = driver.findElements(By.className("day")); 
            // Grab common attribute
            // Put into list and iterate

            for (int i = 0; i < dates.size(); i++) {
                  String text = driver.findElements(By.className("day")).get(i).getText();
                  if (text.equalsIgnoreCase("21")) {
                        driver.findElements(By.className("day")).get(i).click();
                        break;
                  }
            }
      }
}
