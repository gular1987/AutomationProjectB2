package HomeTask.Day4;

import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://beta.docuport.app");
        WebElement username = driver.findElement(By.id("input-14"));
        username.sendKeys(DocuportConstants.USERNAME_ADVISOR);
        username.click();

        WebElement password = driver.findElement(By.id("input-15"));
        password.sendKeys(DocuportConstants.PASSWORD_ADVISOR);
        password.click();

        WebElement loginButton = driver.findElement(By.className("v-btn__content"));
        loginButton.click();
        Thread.sleep(2000);
        WebElement continueButton = driver.findElement(By.cssSelector("button[type='submit']"));
        continueButton.click();

        WebElement home = driver.findElement(By.xpath("//span[text()='Home']"));
        WebElement receivedDoc = driver.findElement(By.xpath("//span[text()='Received docs']"));
        WebElement myUploads = driver.findElement(By.xpath("//span[text()='My uploads']"));
        WebElement clients = driver.findElement(By.xpath("//span[text()='Clients'"));
        WebElement invitations = driver.findElement(By.xpath("//span[text()='Invitations']"));
        WebElement users = driver.findElement(By.xpath("//span[text()='Users'"));
        WebElement Leads = driver.findElement(By.xpath("//span[text()='Leads'"));
        WebElement bookKeeping = driver.findElement(By.xpath("//span[text()='Bookkeeping'"));
        WebElement Form1099 = driver.findElement(By.xpath("//span[text()='1099 Form'"));
        WebElement Reconciliation = driver.findElement(By.xpath("//span[text()='Reconciliations'"));

        List<String> expectedURL = Arrays.asList("https://https://beta.docuport.app/", "https://https://beta.docuport.app/received-docs",
                "https://https://beta.docuport.app/my-uploads", "https://https://beta.docuport.app/clients",
                "https://https://beta.docuport.app/invitations", "https://beta.docuport.app/users", "https://beta.docuport.app/leads",
                "https://beta.docuport.app/bookkeeping", "https://beta.docuport.app/1099-form", "https://beta.docuport.app/reconciliations");
        System.out.println(expectedURL);
            }

        }


