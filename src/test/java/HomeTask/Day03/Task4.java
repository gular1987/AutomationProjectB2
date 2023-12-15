package HomeTask.Day03;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task4 {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.etsy.com");
        WebElement searchButton= driver.findElement(By.name("search_query"));
        searchButton.sendKeys("wooden spoon");
        WebElement clickButton= driver.findElement(By.cssSelector("button[type='submit']"));
        clickButton.click();
        if (driver.getTitle().contains("Wooden spoon")){
            System.out.println("Test PASSED");
        }else {
            System.out.println("Test FAILED");
        }

        driver.quit();



    }
}
