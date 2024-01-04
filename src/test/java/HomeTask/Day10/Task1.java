package HomeTask.Day10;

import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class Task1 {
    /*
1. Open a chrome browser
2. Go to: https://loopcamp.vercel.app/drag-and-drop-circles.html
3. Click and hold small circle
4. Move it on top of the big circle
5. validate “Now drop…” text appears on big circ
 */
    @Test
    public void drag_And_drop(){
        Driver.getDriver().get(ConfigurationReader.getProperty("loopcamp"));
        WebElement smallCircle=Driver.getDriver().findElement(By.id("draggable"));
        WebElement bigCircle=Driver.getDriver().findElement(By.id("droptarget"));
        Actions action=new Actions(Driver.getDriver());
        action.clickAndHold(smallCircle).moveToElement(bigCircle).perform();
        String expected="Now drop...";
        String actual=bigCircle.getText();
        assertEquals(actual,expected,"Actual does not match expected");



    }
}
