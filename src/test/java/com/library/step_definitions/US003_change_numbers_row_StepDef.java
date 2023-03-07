package com.library.step_definitions;

import com.library.pages.UsersPage;
import com.library.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

public class US003_change_numbers_row_StepDef {

    UsersPage usersPage = new UsersPage();
    @When("I select Show {string} records")
    public void iSelectShowRecords(String int50) {
        BrowserUtils.sleep(2);
        Select select = new Select(usersPage.showRecords);
        select.selectByVisibleText("50");
    }

    @Then("show records value should be {int}")
    public void show_records_value_should_be(Integer int1) {

    }
    @Then("the users table must display {int} records")
    public void the_users_table_must_display_records(Integer int1) {

    }






}