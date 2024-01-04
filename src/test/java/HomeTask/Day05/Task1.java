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

public class Task1 {
    /**
     * 1. go to http://the-internet.herokuapp.com/dropdown
     * 2. validate "Please select an option" is selected by default
     * 3. Choose option 1 and validate that it is selected
     * 4. Choose option 2 and validate that it is selected
     * 5. Validate dropdown name is "Dropdown List"
     */

    public static WebDriver driver;


    @BeforeMethod
    public static void setUp(){
       driver= WebDriverFactory.getDriver("chrome");
       driver.manage().window().maximize();
       driver.get("http://the-internet.herokuapp.com/dropdown");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }


    @AfterMethod
    public static void tearDownMethod(){
       // driver.close();

    }

    @Test(priority =1)
    public void dropdownSelect(){
        Select dropdown=new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));

       Assert.assertEquals(dropdown.getFirstSelectedOption().getText(),"Please select an option","TEST PASSED ==> Select an option  is selected");
    }
    @Test(priority = 2)
    public void dropdownSelectOption1(){
        Select dropdwon=new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        dropdwon.selectByIndex(1);
        Assert.assertEquals(dropdwon.getFirstSelectedOption().getText(),"Option 1","TEST PASSED ==> Option 1 is selected");
    }

    @Test(priority = 3)
    public void dropdownSelectOption2(){
        Select dropdwon=new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));
        dropdwon.selectByIndex(2);
        Assert.assertEquals(dropdwon.getFirstSelectedOption().getText(),"Option 2","TEST PASSED ==> Option 2 is selected");

    }
    @Test(priority = 4)
    public void dropdownListName(){
        WebElement dropdownName= driver.findElement(By.xpath("//h3[contains(text(),'Dropdown List')]"));
        Assert.assertEquals(dropdownName.getText(),"Dropdown List","TEST PASSED ==> Dropdown List is Displayed");
    }


}
