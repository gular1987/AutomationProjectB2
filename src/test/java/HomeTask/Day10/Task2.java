package HomeTask.Day10;

import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task2 {
    /*
 1. Open a chrome browser
2. Go to: https://loopcamp.vercel.app/drag-and-drop-circles.html
3. Click and hold small circle
4. Dropped anywhere outside of big circle
5. validate “Try again!” text appears on big circle
     */
    @Test
    public void drag_And_drop(){
        Driver.getDriver().get(ConfigurationReader.getProperty("loopcamp"));
        WebElement smallCircle=Driver.getDriver().findElement(By.id("draggable"));
        WebElement bigCircle=Driver.getDriver().findElement(By.id("droptarget"));
        WebElement powered=Driver.getDriver().findElement(By.className("container"));
        Actions action=new Actions(Driver.getDriver());
        action.clickAndHold(smallCircle).moveToElement(powered).click().perform();
        String expected="Try again!";
        String actual=bigCircle.getText();
        Assert.assertEquals(actual,expected,"Actual does not match expected");
    }
}
