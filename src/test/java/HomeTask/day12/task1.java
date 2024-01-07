package HomeTask.day12;

import com.github.javafaker.Faker;
import com.loop.home_task_pages.SmartBearSoftwareWebOrdersPage;
import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class task1 {

    /*
    task1
1. Open browser
2. Go to website: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
3. Enter username: “Tester”
4. Enter password: “test”
5. Click on Login button
6. Click on Order
7. Select familyAlbum from product, set quantity to 2
8. Click to “Calculate” button
9. Fill address Info with JavaFaker
• Generate: name, street, city, state, zip code
10.Click on “visa” radio button
11.Generate card number using JavaFaker
12.Click on “Process”
13.Verify success message “New order has been successfully added.”

     */
    SmartBearSoftwareWebOrdersPage smartBearSoftwareWebOrdersPage1=new SmartBearSoftwareWebOrdersPage();
    Faker faker;
    Select dropdown;
    WebDriverWait wait;

@BeforeMethod
public void setUpMethod() {
    smartBearSoftwareWebOrdersPage1 = new SmartBearSoftwareWebOrdersPage();
    Driver.getDriver().get(ConfigurationReader.getProperty("smartbearsoftware"));
}
    @Test
    public void SmartBearWebOrders(){
  smartBearSoftwareWebOrdersPage1.username.sendKeys("Tester");
  smartBearSoftwareWebOrdersPage1.password.sendKeys("test");
  smartBearSoftwareWebOrdersPage1.loginButton.click();
  smartBearSoftwareWebOrdersPage1.order.click();
  dropdown=new Select(smartBearSoftwareWebOrdersPage1.dropdown);
  dropdown.selectByValue("FamilyAlbum");
  smartBearSoftwareWebOrdersPage1.quantity.clear();
  smartBearSoftwareWebOrdersPage1.quantity.sendKeys("2");
  smartBearSoftwareWebOrdersPage1.quantity.click();
  smartBearSoftwareWebOrdersPage1.calculateButton.click();

  faker=new Faker();
  smartBearSoftwareWebOrdersPage1.costumerName.sendKeys(faker.name().fullName());
  smartBearSoftwareWebOrdersPage1.street.sendKeys(faker.address().streetName());
  smartBearSoftwareWebOrdersPage1.city.sendKeys(faker.address().cityName());
  smartBearSoftwareWebOrdersPage1.state.sendKeys(faker.address().state());
  smartBearSoftwareWebOrdersPage1.zip.sendKeys(faker.numerify("####"));
  smartBearSoftwareWebOrdersPage1.card.click();
  smartBearSoftwareWebOrdersPage1.cardNr.sendKeys(faker.numerify("#############"));
  smartBearSoftwareWebOrdersPage1.expireDate.sendKeys(faker.numerify("##/##"));
  smartBearSoftwareWebOrdersPage1.processButton.click();
  smartBearSoftwareWebOrdersPage1.successMessage.isDisplayed();


    }
}


