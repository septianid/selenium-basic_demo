package com.example;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment6DynamicValue {
      public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver/chromedriver");
            WebDriver driver = new ChromeDriver();

            driver.get("https://www.rahulshettyacademy.com/AutomationPractice");

            WebElement checkboxDriver = driver.findElement(By.id("checkbox-example"));
            
            List<WebElement> checkboxList = checkboxDriver.findElements(By.tagName("label"));
            Random rand = new Random();

            WebElement selectedCheckbox = checkboxList.get(rand.nextInt(checkboxList.size()));
            String selectedCheckboxText = selectedCheckbox.getText();

            selectedCheckbox.findElement(By.tagName("input")).click();

            System.out.println(selectedCheckboxText);

            Select dropdown = new Select(driver.findElement(By.id("dropdown-class-example")));
            dropdown.selectByVisibleText(selectedCheckboxText);

            Thread.sleep(3000);

            driver.findElement(By.id("name")).sendKeys(selectedCheckboxText);
            driver.findElement(By.id("alertbtn")).click();

            Assert.assertEquals(driver.switchTo().alert().getText(), "Hello "+ selectedCheckboxText +", share this practice page and share your knowledge");

            driver.switchTo().alert().accept();
      }
}
