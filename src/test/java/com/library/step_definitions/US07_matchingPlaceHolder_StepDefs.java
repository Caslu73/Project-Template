package com.library.step_definitions;

import com.library.pages.LoginPage;
import com.library.pages.UsersPage;
import com.library.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.*;

public class US07_matchingPlaceHolder_StepDefs {
    LoginPage loginPage = new LoginPage();
    UsersPage usersPage = new UsersPage();
    @When("I click on the Add Users")
    public void i_click_on_the_add_users() {
        usersPage.addButton.click();
    }

    @Given("I login using following credentials:")
    public void i_login_using_following_credentials(Map <String, String> credentials) {
    loginPage.loginWithDifferentCredentials(credentials.get("email"), credentials.get("password"));

    }

    @Then("dialog fields must have matching placeholder")
    public void dialog_fields_must_have_matching_placeholder(Map <String, String> expectedMap) {
        BrowserUtils.sleep(2);
        Set <String> expectedPlaceHolders = new LinkedHashSet<>(expectedMap.values());

        Set<String> actualPlaceHolders = new LinkedHashSet<>();

        for (int i = 0; i < usersPage.placeHolders.size()-1; i++) {
            actualPlaceHolders.add(usersPage.placeHolders.get(i).getAttribute("placeholder"));
        }
        if(usersPage.address.getText().isEmpty()){
            actualPlaceHolders.add("null");
        }

        Assert.assertEquals(actualPlaceHolders,expectedPlaceHolders);

    }
}
