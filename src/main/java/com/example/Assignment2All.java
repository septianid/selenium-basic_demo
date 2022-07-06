package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment2All {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();

        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/angularpractice/");

        driver.findElement(By.name("name")).sendKeys("Septian");
        driver.findElement(By.name("email")).sendKeys("septian@yahoo.com");
        driver.findElement(By.id("exampleInputPassword1")).sendKeys("automation");

        driver.findElement(By.id("exampleCheck1")).click();

        WebElement genderDropdown = driver.findElement(By.id("exampleFormControlSelect1"));
        Select genderOption = new Select(genderDropdown);
        genderOption.selectByVisibleText("Male");;

        driver.findElement(By.id("inlineRadio2")).click();

        driver.findElement(By.name("bday")).sendKeys("10");
        driver.findElement(By.name("bday")).sendKeys("9");
        driver.findElement(By.name("bday")).sendKeys("1995");

        driver.findElement(By.xpath("//input[@value='Submit']")).click();

        Thread.sleep(2000);

        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText(), "Success! The Form has been submitted successfully!.");
        System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
    }
}
