package com.library.pages;

import com.library.utilities.BrowserUtils;
import com.library.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class UsersPage {

    public UsersPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (xpath = "//tbody//td[2]")
    public List<WebElement> usersIdList;

    @FindBy (xpath = "//select[@name='tbl_users_length']")
    public WebElement showRecords;

    @FindBy(xpath = "//select[@name='tbl_users_length']//option")
    public List <WebElement> listShowRecords;

    @FindBy (xpath = "//tbody//tr")
    public List <WebElement> usersTableRecords;

    @FindBy (xpath = "//input[@type='search']")
    public WebElement searchBox;

    @FindBy (xpath = "//tbody//td[4]")
    public List <WebElement> listOfEmails;

    @FindBy (xpath = "//a[@class='btn btn-lg btn-outline btn-primary btn-sm']")
    public WebElement addButton;

    @FindBy (xpath = "//tr//th")
    public List <WebElement> tableColumnsNames;



    public int stringOfSelectDropdownActualValueToInt(Select select) {

        String actual = select.getFirstSelectedOption().getText();

        int actualValue = Integer.parseInt(actual);

        return actualValue;


    }

    public void selectShowRecordWithInteger(int expectedNumber){
        UsersPage usersPage = new UsersPage();
        Select select = new Select(usersPage.showRecords);
        select.selectByVisibleText(""+expectedNumber);
    }

    public int getRecordListSize(){
        UsersPage usersPage = new UsersPage();
        int actualSize = usersPage.usersTableRecords.size();
        return actualSize;
    }

    public void checkEmailsListContainsExpectedTest(String text){
        UsersPage usersPage = new UsersPage();

        List <String> listOfEmails = BrowserUtils.getElementsText(usersPage.listOfEmails);

        for (String eachEmail : listOfEmails) {
            Assert.assertTrue(eachEmail.contains(text));
        }
    }







}
