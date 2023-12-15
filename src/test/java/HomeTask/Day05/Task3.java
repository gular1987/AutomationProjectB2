package HomeTask.Day05;

import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Task3 {
    /**1. login as an advisor
     2. go to received document
     3. click search
     4. click status dropdown
     5. choose in progress
     *
      */

WebDriver driver;



    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://beta.docuport.app");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterMethod
    public void tearDownMethod(){
        //driver.close();
    }
    @Test
    public void getDocuport() throws InterruptedException {
        WebElement username = driver.findElement(By.id("input-14"));
        username.sendKeys(DocuportConstants.USERNAME_ADVISOR);
        username.click();

        WebElement password = driver.findElement(By.id("input-15"));

        password.sendKeys(DocuportConstants.PASSWORD_ADVISOR);
        password.click();

        WebElement loginButton = driver.findElement(By.className("v-btn__content"));
        loginButton.click();

        WebElement receiveDoc=driver.findElement(By.xpath("//div[@class='doc-card--icon d-flex justify-end']"));
       receiveDoc.click();
       WebElement searchButton=driver.findElement(By.xpath("//span[contains(text(),'Search')]"));
     searchButton.click();

     WebElement allButton=driver.findElement(By.xpath("//div[@class='mb-3 col-sm-6 col-md-4 col-12'][4]"));
     allButton.click();
     WebElement inProgress=driver.findElement(By.xpath("//div[@id='list-item-157-1']"));
     inProgress.click();









    }

}
