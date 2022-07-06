package com.example;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3Wait {
      public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver/chromedriver");
            WebDriver driver = new ChromeDriver();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

            driver.get("https://rahulshettyacademy.com/loginpagePractise/");

            // SELECT USER LOGIN ROLE VIA RADIO BUTTON & CONFIRM NOTIFICATION
            driver.findElement(By.xpath("(//label[@class='customradio'])[2]/input")).click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
            driver.findElement(By.id("okayBtn")).click();

            // SELECT USER JOB VIA DROPDOWN
            WebElement dropdown = driver.findElement(By.cssSelector("select[class='form-control']"));
            Select roleDropdown = new Select(dropdown);

            roleDropdown.selectByVisibleText("Consultant");

            // CHECK TERM AND CONDITION AGREEMENT
            driver.findElement(By.id("terms")).click();

            // INPUT USERNAME
            driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");

            // INPUT PASSWORD
            driver.findElement(By.id("password")).sendKeys("learning");

            // CLICK LOGIN
            driver.findElement(By.id("signInBtn")).click();

            // ADD ALL PRODUCTS
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1.my-4")));
            List<WebElement> products = driver.findElements(By.cssSelector("button[class='btn btn-info']"));

            for (int i = 0; i < products.size(); i++) {
                  products.get(i).click();
            }
      }
}
