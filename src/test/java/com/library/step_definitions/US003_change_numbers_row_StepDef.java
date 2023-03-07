package com.library.step_definitions;

import com.library.pages.UsersPage;
import com.library.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class US003_change_numbers_row_StepDef {

    UsersPage usersPage = new UsersPage();
    Select select = new Select(usersPage.showRecords);
    @When("I select Show {string} records")
    public void iSelectShowRecords(String int50) {
        select.selectByVisibleText("50");
    }

    @Then("show records value should be {string}")
    public void show_records_value_should_be(String int50) {
        Assert.assertEquals(int50,select.getFirstSelectedOption().getText());
    }
    @Then("the users table must display {int} records")
    public void the_users_table_must_display_records(int expectedQuantityRecords) {
        Assert.assertEquals(expectedQuantityRecords,usersPage.usersTableRecords.size());


    }






}
