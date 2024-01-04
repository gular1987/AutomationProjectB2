package HomeTask.Day07;

import com.loop.test.base.TestBase;
import com.loop.test.utilities.DocuportConstants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class MentorPractice extends TestBase {

    @Test
    public void invalidUsernameCorrectPassword(){
        driver.get("https://beta.docuport.app/");
        WebElement username= driver.findElement(By.xpath("//input[@id='input-14']"));
        WebElement password= driver.findElement(By.xpath("//input[@id='input-14']"));
        username.sendKeys("b1g1_client@gmail.com");
        password.sendKeys("Group1");
        WebElement login= driver.findElement(By.xpath("//span[.='username or password is incorrect']"));


    }

   @Test
   public void invalidPasswordCorrectUsername(){
       driver.get("https://beta.docuport.app/");
       WebElement username= driver.findElement(By.xpath("//input[@id='input-14']"));
       WebElement password= driver.findElement(By.xpath("//input[@id='input-14']"));
       username.sendKeys("b1g1_client@gmail.com");
       password.sendKeys("Group1");
       WebElement login= driver.findElement(By.xpath("//span[.='username or password is incorrect']"));


   }

}
