package com.loop.home_task_pages;

import com.loop.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoopcampDragAndDrop {
    /*
1. Open a chrome browser
2. Go to: https://loopcamp.vercel.app/drag-and-drop-circles.html
3. Click and hold small circle
4. Dropped anywhere outside of big circle
5. validate “Try again!” text appears on big circle
     */

    @FindBy(id="draggable")
   public WebElement smallCircle;

    @FindBy(id="droptarget")
    public  WebElement bigCircle;
public LoopcampDragAndDrop(){PageFactory.initElements(Driver.getDriver(),this);
}
}
