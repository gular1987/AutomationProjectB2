package com.loop.home_task_pages;

import com.loop.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SmartBearSoftwareLoadingPage {

    /*
1. Open browser
2. Go to website: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
3. Enter username: “Tester”
4. Enter password: “test”
5. Click to Login button
6. Print out count of all the links on landing page
7. Print out each link text on this page

 */
    @FindBy(id="ctl00_MainContent_username")
        public WebElement username;


    @FindBy(id="ctl00_MainContent_password")
    public WebElement password;

    @FindBy(id="ctl00_MainContent_login_button")
    public WebElement loginButton;

    @FindBy(tagName = "a")
    public List<WebElement> link;

    public SmartBearSoftwareLoadingPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    }


