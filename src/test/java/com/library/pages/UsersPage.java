package com.library.pages;

import com.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class UsersPage {

    public UsersPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (xpath = "//tbody//td[2]")
    public List<WebElement> userId;

    @FindBy (xpath = "//select[@name='tbl_users_length']")
    public WebElement showRecords;

    @FindBy(xpath = "//select[@name='tbl_users_length']//option")
    public List <WebElement> listShowRecords;

    @FindBy (xpath = "//tbody//tr")
    public List <WebElement> usersTableRecords;


}
