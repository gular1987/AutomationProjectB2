package HomeTask.Day05;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Task2 {
    /**
     * 1. go to https://www.etsy.com/
     * 2. search for rings
     * 3. validate that Estimated Arrival shows any time
     * 3. click Estimated Arrival dropdown
     * 4. click Select custom date
     * 5. choose may 30 from dropdown
     * 6. validate Estimated Arrival shows may 30
     */
    WebDriver driver;
    String actual;
    String expected;

    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get(" https://www.etsy.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @AfterMethod
    public void tearDownMethod(){
       // driver.close();
    }
    @Test
    public void getEtsy(){
        WebElement searchButton= driver.findElement(By.xpath("//input[@id='global-enhancements-search-query']"));
        searchButton.sendKeys("rings");
        WebElement clickButton= driver.findElement(By.xpath("//span[@class='wt-icon wt-nudge-b-2 wt-nudge-r-1']"));
       clickButton.click();
       WebElement estimatedArrival= driver.findElement(By.xpath("//div[@class='wt-pr-xs-1 wt-hide-xs wt-show-lg']"));
       estimatedArrival.click();
       Select customDate=new Select(driver.findElement(By.xpath("//select[@id='edd_select_tf']")));
       customDate.selectByVisibleText("By Dec 30");
       Assert.assertEquals(actual,expected,"Doesn't match with actual title");

    }
}
