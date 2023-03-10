package com.library.step_definitions;

import com.library.pages.UsersPage;
import com.library.utilities.BrowserUtils;
import com.library.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class US005_search_values_StepDef {

    UsersPage usersPage = new UsersPage();
    @When("I search for {string}")
    public void i_search_for(String text) {
        usersPage.searchBox.sendKeys(text);



    }
    @Then("table should contain rows with {string}")
    public void table_should_contain_rows_with_tests(String text) {
        BrowserUtils.sleep(1);
       usersPage.checkEmailsListContainsExpectedTest(text);


    }

    @Then("table should have following column names:")
    public void table_should_have_following_column_names(List <String> expectedColumnsNames) {
        List <String> actualColumnNames = BrowserUtils.getElementsText(usersPage.tableColumnsNames);

        Assert.assertEquals(expectedColumnsNames,actualColumnNames);


    }
}
