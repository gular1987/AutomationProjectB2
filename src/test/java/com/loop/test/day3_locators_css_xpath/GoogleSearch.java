package com.loop.test.day3_locators_css_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
    public static void main(String[] args) {
        // setup the driver
        WebDriverManager.chromedriver().setup();

        // create driver object
        WebDriver driver = new ChromeDriver();

        // navigate to google
        driver.get( "https://www.google.com/" );

        // maximize the window
        driver.manage().window().maximize();

        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        String expectedURL = "https://www.google.com/";
        String actualURL = driver.getCurrentUrl();

        if (actualURL.contains( expectedURL )) {
            System.out.println( "Actual url: " + actualURL + ", matches expected url: " + expectedURL + ", => TEST PASS" );
        } else {
            System.err.println( "Actual url: " + actualURL + ", DOES NOT match expected url: " + expectedURL + ", => TEST FAIL" );
        }
    }
}