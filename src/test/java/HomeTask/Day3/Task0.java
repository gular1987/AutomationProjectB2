package HomeTask.Day3;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 *  go to https://loopcamp.vercel.app/forgot-password.html
 * 2. locate 5 elements, forgot password, email, email input, retrieve password, powered by LOOPCAMP
 * 3. use css
 * 4. verify those elements are displayed
 */

public class Task0 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://loopcamp.vercel.app/forgot-password.html");
        driver.manage().window().maximize();

        WebElement forgotPassword = driver.findElement(By.cssSelector("div[class='example']>h2"));
        System.out.println(forgotPassword.isDisplayed());

        WebElement email = driver.findElement(By.cssSelector("label[for='email']"));
        System.out.println(email.getText());


        WebElement emailInput= driver.findElement(By.cssSelector("input[name='email']"));
        System.out.println(emailInput.isDisplayed());

        WebElement retrievePassword=driver.findElement(By.cssSelector("button[type='submit']"));
        System.out.println(retrievePassword.getText());

        Thread.sleep(2000);

        WebElement poweredByLoopCamp= driver.findElement(By.cssSelector("a[target='_blank']"));
        poweredByLoopCamp.click();
        System.out.println(poweredByLoopCamp.isDisplayed());
        Thread.sleep(3000);
        driver.quit();




    }




    }

