package com.library.step_definitions;

import com.library.pages.HomePage;
import com.library.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;





public class US006_loginValidCredentials_StepDef {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    @When("I login using {string} and {string}")
    public void i_login_using_and_library_user(String email, String password) {
       loginPage.loginWithDifferentCredentials(email,password);
    }
    @Then("account holder name should be {string}")
    public void account_holder_name_should_be(String expectedName) {
        homePage.checkIfStudentAccountNameAndLibrarianAccountNameIsEqualToExpectedName(expectedName);


    }
}
