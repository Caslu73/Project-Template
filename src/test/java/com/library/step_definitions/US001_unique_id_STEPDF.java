package com.library.step_definitions;

import com.library.pages.HomePage;
import com.library.pages.LoginPage;
import com.library.pages.UsersPage;
import com.library.utilities.BrowserUtils;
import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class US001_unique_id_STEPDF {

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {

        Driver.getDriver().get("https://library2.cydeo.com/login.html");


    }

    LoginPage loginPage = new LoginPage();
    @Given("I login as a librarian")
    public void i_login_as_a_librarian() {
        loginPage.usernameBox.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage.passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.signInButton.click();

    }

    HomePage homePage = new HomePage();
    @When("I click on Users link")
    public void i_click_on_link() {
        homePage.UsersModule.click();


    }

    UsersPage usersPage = new UsersPage();
    @Then("Each user id should be unique")
    public void each_user_id_should_be_unique() {
        for (int i = 0; i < usersPage.usersIdList.size()-1; i++) {

            Assert.assertNotEquals(usersPage.usersIdList.get(i).getText(),usersPage.usersIdList.get(i+1).getText());
        }






    }
}
