package com.example;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class DemoBrokenLink {
      public static void main(String[] args) throws MalformedURLException, IOException {
            System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver/chromedriver");
            WebDriver driver = new ChromeDriver();

            // Broken URL
            // Step 1 - IS to get all urls tied up to the links using Selenium
            // Java methods will call URL's and gets you the status code
            // If status code >400 then that url is not working -> link which tied to url is broken

            driver.get("https://rahulshettyacademy.com/AutomationPractice/");
            
            List<WebElement> links=   driver.findElements(By.cssSelector("li[class='gf-li'] a"));    
            SoftAssert assrt =new SoftAssert();

            for (WebElement link: links) {
                  String url = link.getAttribute("href");
                  HttpURLConnection connect = (HttpURLConnection) new URL(url).openConnection();
                  connect.setRequestMethod("HEAD");
                  connect.connect();
                  int responseCode = connect.getResponseCode();

                  System.out.println(responseCode);
                  assrt.assertTrue(responseCode < 400, "The link with Text" + link.getText() + " is broken with code" + responseCode);
            }

            assrt.assertAll();
      }
}
