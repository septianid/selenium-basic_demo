package com.example;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoWait {
      public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver/chromedriver");
            WebDriver driver = new ChromeDriver();

            // EXPLICIT WAIT
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

            // IMPLICIT WAIT
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

            String[] productNeeded = {"Cucumber", "Brocolli", "Beetroot"};

            driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
            Thread.sleep(3000);

            addProduct(driver, productNeeded);
            driver.findElement(By.cssSelector("img[alt='Cart']")).click();
            driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
            
            // *EX WAIT
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
            driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
            driver.findElement(By.cssSelector("button.promoBtn")).click();

            // *EX WAIT
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
            System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
      }

      public static void addProduct(WebDriver driver, String[] itemNeeded) {
            int j = 0;
            List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

            for (int i = 0; i < products.size(); i++) {
                  String[] productName = products.get(i).getText().split("-");
                  String formattedName = productName[0].trim();
                  //format it to get actual vegetable name
                  //convert array into array list for easy search
                  List<String> productNeededList = Arrays.asList(itemNeeded);
                  if (productNeededList.contains(formattedName)) {
                        j++;
                        driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                        if (j == itemNeeded.length) {
                              break;
                        }
                  }
            }
      }
}
