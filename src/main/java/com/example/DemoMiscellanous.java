package com.example;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoMiscellanous {
      public static void main(String[] args) throws IOException {
            System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver/chromedriver");
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            // driver.manage().deleteCookieNamed(name);

            // Click any link
            // Login Page - Verify page

            driver.get("https://google.com");

            File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(src, new File("/Users/septian/Pictures/Screenshots"));
      }
}
