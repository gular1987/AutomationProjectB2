package HomeTask.Day4;

import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.WebDriverFactory;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * =============
 * 1. go to docuport app
 * 2. validate that Home, Received docs, My uploads, Invitations are displayed
 * 3. press three lines
 * 4. Home, Received docs, My uploads, Invitations will disappear
 * 5. Validate the buttons are not displayed
 */

public class Task0 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://beta.docuport.app");
        WebElement username = driver.findElement(By.id("input-14"));
        username.sendKeys(DocuportConstants.USERNAME_CLIENT);
        username.click();

        WebElement password = driver.findElement(By.id("input-15"));
        password.sendKeys(DocuportConstants.PASSWORD_CLIENT);
        password.click();

        WebElement loginButton = driver.findElement(By.className("v-btn__content"));
        loginButton.click();
        Thread.sleep(2000);
        WebElement continueButton = driver.findElement(By.cssSelector("button[type='submit']"));
        continueButton.click();


        WebElement home = driver.findElement(By.xpath("//span[text()='Home']"));
        System.out.println("TEST PASSED ===> Home is Displayed");

        WebElement receivedDoc = driver.findElement(By.xpath("//span[text()='Received docs']"));
        System.out.println("TEST PASSED ===> Receive Document is Displayed");


        WebElement myUploads = driver.findElement(By.xpath("//span[text()='My uploads']"));
        System.out.println("TEST PASSED ===> My Uploads is Displayed");


        WebElement invitations = driver.findElement(By.xpath("//span[text()='Invitations']"));
        System.out.println("TEST PASSED ===> Invitations is Displayed");

        WebElement threeLine = driver.findElement(By.xpath("//button[@class='v-app-bar__nav-icon v-btn v-btn--icon v-btn--round theme--light v-size--default']"));
        threeLine.click();
        Thread.sleep(3000);
        System.out.println("===========================================");

        List<WebElement> webElement=Arrays.asList(home,receivedDoc,myUploads,invitations);
        for (WebElement each:webElement) {
            if (each.isDisplayed()) {
                System.out.println("TEST PASSED ===> Web Element \"" + each.getText() + "\" is Not Displayed");
            } else {
                System.out.println("TEST FAILED ===> Web Element \"" + each.getText() + "\" is not  Displayed");

            }
        }

        }
    }
