package com.library.pages;

import com.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.lang.module.Configuration;

public class LoginPage {

    public LoginPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id = "inputEmail")
    public WebElement usernameBox;

    @FindBy (id = "inputPassword")
    public WebElement passwordBox;

    @FindBy (xpath = "//button[.='Sign in']")
    public WebElement signInButton;
}
