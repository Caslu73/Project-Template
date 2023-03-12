package com.library.step_definitions;

import com.library.pages.HomePage;
import com.library.pages.LoginPage;
import com.library.pages.UsersPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class US001_unique_id_StepDef {

    LoginPage loginPage = new LoginPage();
    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        loginPage.onTheLoginPage();
    }


    @Given("I login as a librarian")
    public void i_login_as_a_librarian() {
        loginPage.login();
    }

    HomePage homePage = new HomePage();

    @When("I click on {string} link")
    public void i_click_on_link(String text) {

       homePage.navigateTo(text);

    }

    UsersPage usersPage = new UsersPage();
    @Then("Each user id should be unique")
    public void each_user_id_should_be_unique() {

        List <String> acceptsDuplicates = new ArrayList<>(); // Array accepts duplicates

        for (WebElement eachId : usersPage.usersIdList) {
            acceptsDuplicates.add(eachId.getText());
        }

        Set <String> notAcceptsDuplicates = new HashSet<>(); //HashSet does not accepts duplicates

        for (WebElement eachId : usersPage.usersIdList) {
            notAcceptsDuplicates.add(eachId.getText());
        }

        Assert.assertEquals(acceptsDuplicates.size(),notAcceptsDuplicates.size());







    }
}
