package HomeTask.Day9;

import com.github.javafaker.Faker;
import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task_RegistrationForm {
    @Test
    public void RegistrationForm(){
        Driver.getDriver().get(ConfigurationReader.getProperty("reg"));
        Faker faker=new Faker();
        WebElement firstName=Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys(faker.name().firstName());
        WebElement lastName=Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys(faker.name().lastName());
        WebElement username=Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        username.sendKeys(faker.name().username().replace(".",""));
        WebElement email=Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        email.sendKeys(faker.internet().emailAddress());
        WebElement password=Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        password.sendKeys(faker.internet().password());
        WebElement phoneNumber=Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        phoneNumber.sendKeys(faker.numerify("###-###-####"));
        WebElement gender=Driver.getDriver().findElement(By.xpath("//input[@value='female']"));
        gender.click();
        Assert.assertTrue(gender.isSelected());
        WebElement dateOfBirth=Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        dateOfBirth.sendKeys(faker.numerify("12/28/1999"));
        Select departmentDropdown= new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        departmentDropdown.selectByVisibleText("Tourism Office");
        Select jobTitle =new Select(Driver.getDriver().findElement(By.xpath("//select[@name='job_title']")));
        jobTitle.selectByVisibleText("SDET");
        WebElement programmingLanguage=Driver.getDriver().findElement(By.xpath("//div[@class='form-check form-check-inline'][2]"));
        programmingLanguage.click();
        WebElement signUp=Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));
        signUp.click();

    }
}
