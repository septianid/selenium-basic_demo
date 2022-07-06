package com.example;

import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class App 
{
    public static void main( String[] args )
    {
        // System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver/chromedriver");
        // System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver/geckodriver");
        System.setProperty("webdriver.edge.driver", "/usr/local/bin/edgedriver/msedgedriver");
        WebDriver driver = new EdgeDriver();
        driver.get("https://funnelgarden.com/");
        driver.manage().window().maximize();
        driver.quit();
    }
}
