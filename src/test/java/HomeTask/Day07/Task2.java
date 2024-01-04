package HomeTask.Day07;

import com.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class Task2 extends TestBase {
    /**
     *  1. go to https://loopcamp.vercel.app/
     *     2. click "Multiple Windows" link
     *     3. Validate "Powered by Loopcamp" is displayed
     *     4. Validate title is "Windows"
     *     5. Click - click here
     *     6. Switch to new window and validate title
     */

    @Test
    public void multipleWindow() {
        driver.get("https://loopcamp.vercel.app/");
        WebElement multipleWindows = driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]"));
        multipleWindows.click();

        WebElement poweredbyLoopcam = driver.findElement(By.xpath("//a[contains(text(),'LOOPCAMP')]"));
        Assert.assertTrue(poweredbyLoopcam.isDisplayed());

        Assert.assertEquals(driver.getTitle(),"Windows");

        WebElement clickHere = driver.findElement(By.xpath("//a[contains(text(),'Click Here')]"));
        clickHere.click();

        Set<String> windowHandles = driver.getWindowHandles();

        for (String each : windowHandles) {

            driver.switchTo().window(each);
        }
        System.out.println(driver.getTitle());


        Assert.assertEquals(driver.getTitle(),"New Window","actual does not match expected");

    }


    }

