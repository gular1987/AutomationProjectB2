package HomeTask.Day3;

import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * 1. login to docuport application
 * 2. logout from docuport application
 * 3. Validate successful login
 * 4. Validate successful logout
 */

public class Task1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://beta.docuport.app");
        WebElement username=driver.findElement(By.id("input-14"));
        username.sendKeys(DocuportConstants.USERNAME_CLIENT);
        username.click();

        WebElement password= driver.findElement(By.id("input-15"));
        password.sendKeys(DocuportConstants.PASSWORD_CLIENT);
        password.click();

        WebElement loginButton=driver.findElement(By.className("v-btn__content"));
        loginButton.click();
        Thread.sleep(2000);
       WebElement continueButton= driver.findElement(By.cssSelector("button[type='submit']"));
        continueButton.click();


        WebElement clickButton= driver.findElement(By.cssSelector("span[class='subtitle-2 text-none pl-2 pr-3 gray--text text--darken-3']"));
        clickButton.click();


        WebElement logOutButton= driver.findElement(By.id("list-item-153"));
        logOutButton.click();
        if (logOutButton.isDisplayed()){
            System.out.println("Log out button is Displayed.Test PASSED");
        }else {
            System.out.println("Log out button is not Displayed.Test FAILED");
        }

        Thread.sleep(3000);

        driver.quit();





    }
}