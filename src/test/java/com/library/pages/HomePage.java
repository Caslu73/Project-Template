package com.library.pages;

import com.library.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//ul//li[2]")
    public WebElement usersModule;

    @FindBy (xpath = "(//ul//span)[7]")
    public WebElement librarianName;

    @FindBy (xpath = "(//ul//span)[5]")
    public WebElement studentName;


    public void navigateTo(String text){
    WebElement linkToPage = Driver.getDriver().findElement(By.xpath("//span[.='"+text+"']"));
    linkToPage.click();


    }


    public void checkIfStudentAccountNameAndLibrarianAccountNameIsEqualToExpectedName(String expectedName){
        HomePage homePage = new HomePage();
        if(expectedName.contains("Student")){
            Assert.assertEquals(expectedName,homePage.studentName.getText());
        }else{
            Assert.assertEquals(expectedName,homePage.librarianName.getText());
        }
    }

}
