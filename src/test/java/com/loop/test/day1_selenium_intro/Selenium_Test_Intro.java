package com.loop.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Test_Intro {
    public static void main(String[] args) {
        // setting up the web driver
        WebDriverManager.chromedriver().setup();

        // create an instance of webdriver
        WebDriver driver = new ChromeDriver();

        // navigate to web page
        driver.get("https://www.loopcamp.io");



    }
}
