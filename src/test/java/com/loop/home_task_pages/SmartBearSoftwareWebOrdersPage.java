package com.loop.home_task_pages;

import com.loop.test.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearSoftwareWebOrdersPage {

    @FindBy(id="ctl00_MainContent_username")
    public WebElement username;


    @FindBy(id="ctl00_MainContent_password")
    public WebElement password;

    @FindBy(id="ctl00_MainContent_login_button")
    public WebElement loginButton;

    @FindBy(xpath = "//a[@href ='Process.aspx']" )
    public WebElement order;

    @FindBy(id="ctl00_MainContent_fmwOrder_ddlProduct")
    public WebElement dropdown;
    @FindBy(id="ctl00_MainContent_fmwOrder_txtQuantity")
    public WebElement quantity;

    @FindBy(xpath ="//input[@value='Calculate']")
    public WebElement calculateButton;

    @FindBy(id="ctl00_MainContent_fmwOrder_txtName")
    public WebElement costumerName;

    @FindBy(id="ctl00_MainContent_fmwOrder_TextBox2")
    public WebElement street;
    @FindBy (id="ctl00_MainContent_fmwOrder_TextBox3")
    public WebElement city;
   @FindBy(id="ctl00_MainContent_fmwOrder_TextBox4")
   public WebElement state;
   @FindBy(id="ctl00_MainContent_fmwOrder_TextBox5")
   public WebElement zip;
   @FindBy(id="ctl00_MainContent_fmwOrder_cardList_0")
   public WebElement card;
   @FindBy(id="ctl00_MainContent_fmwOrder_TextBox6")
   public WebElement cardNr;
   @FindBy(id="ctl00_MainContent_fmwOrder_TextBox1")
   public WebElement expireDate;
   @FindBy(id="ctl00_MainContent_fmwOrder_InsertButton")
   public WebElement processButton;

   @FindBy(xpath ="//strong[contains(text(),'New order has been successfully added.')]")
   public WebElement successMessage;


public SmartBearSoftwareWebOrdersPage(){
    PageFactory.initElements(Driver.getDriver(),this);
}

}
