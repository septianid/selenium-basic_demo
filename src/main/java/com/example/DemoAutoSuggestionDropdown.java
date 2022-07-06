package com.example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAutoSuggestionDropdown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("autosuggest")).sendKeys("ind");

        Thread.sleep(3000);

        List<WebElement> options = driver.findElements(By.cssSelector("li[class$='ui-menu-item'] a"));
        for (WebElement optionItem : options) {
            if (optionItem.getText() == "India") {
                optionItem.click();
                break;
            }
        }
    }
}
