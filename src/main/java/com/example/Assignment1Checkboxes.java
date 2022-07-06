package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignment1Checkboxes {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        WebElement firstCheckbox = driver.findElement(By.xpath("//div[@id='checkbox-example']//fieldset//label[1]//input"));
        firstCheckbox.click();
        Assert.assertTrue(firstCheckbox.isSelected());

        Thread.sleep(2000);

        firstCheckbox.click();
        Assert.assertFalse(firstCheckbox.isSelected());

        System.out.println(driver.findElements(By.xpath("//div[@id='checkbox-example']//fieldset//label")).size());
    }
}
