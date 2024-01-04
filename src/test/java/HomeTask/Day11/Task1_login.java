package HomeTask.Day11;

import com.loop.home_task_pages.SmartBearSoftwareLoadingPage;
import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task1_login {
/*
1. Open browser
2. Go to website: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
3. Enter username: “Tester”
4. Enter password: “test”
5. Click to Login button
6. Print out count of all the links on landing page
7. Print out each link text on this page

 */
     SmartBearSoftwareLoadingPage smartBearSoftwareLoadingPage;


    @BeforeMethod
    public void setUpMethod(){
        Driver.getDriver().get(ConfigurationReader.getProperty("smartbearsoftware"));
        smartBearSoftwareLoadingPage=new SmartBearSoftwareLoadingPage();}



        @Test
       public void login_page(){
        smartBearSoftwareLoadingPage.username.sendKeys("Tester");
        smartBearSoftwareLoadingPage.password.sendKeys("test");
        smartBearSoftwareLoadingPage.loginButton.click();
        System.out.println("Total number of links is: "+smartBearSoftwareLoadingPage.link.size());
        for (WebElement each:smartBearSoftwareLoadingPage.link){
            System.out.println("Link text: "+each.getText());

        }


        }






        }


