package com.loop.test.day10_upload_download;

import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T4_JSExecutor_scroll {

    /**
     * 1. Go to https://www.etsy.com
     * 2. Scroll down.
     * 3. Generate random email and enter into subscribe box.
     * 4. Click on Subscribe.
     * 5. Verify "Great! We've emailed you to confirm your subscription." Is displayed.
     */



        @Test
        public void etsy_scroll_test() throws InterruptedException {
            Driver.getDriver().get(ConfigurationReader.getProperty("etsy"));

            WebElement emilBox = Driver.getDriver().findElement(By.id("email-list-signup-email-input"));

            // How to scroll to an element?
            // #1 --> Use actions move to an element.

            Actions action = new Actions(Driver.getDriver());
            // action.moveToElement(emilBox).perform();
            // action.scrollToElement(emilBox).perform();

            // #2 --> Use Key press.
            // action.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN).perform();

            JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

            // #3 --> Move horizontally or vertically.
            js.executeScript("window.scroll(0, 5000)");

            // #4
            js.executeScript("arguments[0].scrollIntoView(true)", emilBox);
            js.executeScript("arguments[0].click()", emilBox);
            Thread.sleep(5000);
            js.executeScript("window.scroll(0,0)");

            Driver.closeDriver();
        }
    }
