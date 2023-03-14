package com.library.step_definitions;


import com.library.pages.UsersPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;



public class US03_change_numbers_row_StepDefs {

    UsersPage usersPage = new UsersPage();
    Select select = new Select(usersPage.showRecords);

    @When("I select Show {int} records")
    public void iSelectShowRecords(int expectedSelectedNumber) {
    usersPage.selectShowRecordWithInteger(expectedSelectedNumber);


    }

    @Then("show records value should be {int}")
    public void show_records_value_should_be(int expectedRecordValue) {

        int actualDefaultValue = usersPage.stringOfSelectDropdownActualValueToInt(select);
        Assert.assertEquals(expectedRecordValue,actualDefaultValue);



    }
    @Then("the users table must display {int} records")
    public void the_users_table_must_display_records(int expectedQuantityRecords) {
        int actualSize = usersPage.getRecordListSize();
        Assert.assertEquals(expectedQuantityRecords,actualSize);




    }






}
