package com.library.pages;

import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.lang.module.Configuration;
import java.util.Map;

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


    public void onTheLoginPage(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    public void login() {
        usernameBox.sendKeys(ConfigurationReader.getProperty("username"));
        passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
        signInButton.click();
    }

    public void loginWithDifferentCredentials(String email, String password){
       usernameBox.sendKeys(email);
       passwordBox.sendKeys(password);
       signInButton.click();
    }

}
