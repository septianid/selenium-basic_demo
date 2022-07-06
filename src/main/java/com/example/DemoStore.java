package com.example;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoStore {
      public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver/chromedriver");
            WebDriver driver = new ChromeDriver();

            String[] productNeeded = {"Cucumber", "Brocolli", "Beetroot"};

            driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
            Thread.sleep(3000);

            addProduct(driver, productNeeded);


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
