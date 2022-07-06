package com.example;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
// import org.openqa.selenium.firefox.FirefoxOptions;

public class DemoDriverOptions {
      public static void main(String[] args) {
            // FirefoxOptions firefox = new FirefoxOptions();
            // EdgeOptions edge = new EdgeOptions();
            // SafariOptions safari = new SafariOptions();
            ChromeOptions chrome = new ChromeOptions();
            Proxy proxy = new Proxy();
            proxy.setHttpProxy("ipaddress:4444");
            chrome.setCapability("proxy", proxy);
            Map<String, Object> prefs = new HashMap<String, Object>();
            prefs.put("download.default_directory", "/directory/path");
            
            chrome.setExperimentalOption("prefs", prefs);     
            chrome.setAcceptInsecureCerts(true);
            
            System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver/chromedriver");
            WebDriver driver = new ChromeDriver(chrome);

            driver.get("https://expired.badssl.com");

            System.out.println(driver.getTitle());
      }
}
