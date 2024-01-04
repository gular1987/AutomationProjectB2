package HomeTask.Day11;

import com.loop.home_task_pages.LoopcampDragAndDrop;
import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Task2_dragAndDrop {
    /*
 1. Open a chrome browser
2. Go to: https://loopcamp.vercel.app/drag-and-drop-circles.html
3. Click and hold small circle
4. Dropped anywhere outside of big circle
5. validate “Try again!” text appears on big circle
     */
    LoopcampDragAndDrop loopcampDragAndDrop;
    Actions actions;

    @BeforeMethod
    public void setUpMethod() {
        Driver.getDriver().get(ConfigurationReader.getProperty("loopcamp"));
        loopcampDragAndDrop = new LoopcampDragAndDrop();
        actions = new Actions(Driver.getDriver());
    }

    @Test
    public void NowDrop() {
        actions.moveToElement(loopcampDragAndDrop.smallCircle)
                .clickAndHold()
                .moveToElement(loopcampDragAndDrop.bigCircle)
                .pause(1000)
                .perform();
        assertEquals(loopcampDragAndDrop.bigCircle.getText(), "Now drop...");
    }


    @Test
    public void dragAndDrop() {
        actions.clickAndHold(loopcampDragAndDrop.smallCircle)
                .moveToElement(loopcampDragAndDrop.bigCircle)
                .moveByOffset(100, 100)
                .pause(2000)
                .release()
                .perform();
        assertEquals(loopcampDragAndDrop.bigCircle.getText(), "Try again!");
    }


}



