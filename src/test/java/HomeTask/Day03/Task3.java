package HomeTask.Day03;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://google.com");
        WebElement Gmail= driver.findElement(By.className("gb_E"));
        Gmail.click();
        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();
        if (driver.getTitle().contains(expectedTitle)){
            System.out.println(expectedTitle+" is expected title.Test PASSED");
        }else {
            System.out.println(expectedTitle+" is not expected title. Test FAILED");
        }

        driver.navigate().back();
        String expectedTitle1 = "Google";
        String actualTitle1 = driver.getTitle();
        if (driver.getTitle().contains(expectedTitle1)){
            System.out.println(expectedTitle1+" is expected title.Test PASSED");
        }else {
            System.out.println(expectedTitle1+" is not expected title. Test FAILED");
        }
        Thread.sleep(2000);
        driver.quit();

    }
}
