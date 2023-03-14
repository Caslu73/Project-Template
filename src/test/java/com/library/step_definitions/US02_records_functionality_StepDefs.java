package com.library.step_definitions;

import com.library.pages.UsersPage;
import com.library.utilities.BrowserUtils;

import io.cucumber.java.en.Then;

import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class US02_records_functionality_StepDefs {

    UsersPage usersPage = new UsersPage();
    Select select = new Select(usersPage.showRecords);

    @Then("show records default value should be {int}")
    public void showRecordsDefaultValueShouldBe(int expectedDefaultValue) {

        int actualDefaultValue = usersPage.stringOfSelectDropdownActualValueToInt(select);

        Assert.assertEquals(expectedDefaultValue,actualDefaultValue);
    }

    @Then("show records should have following options:")
    public void show_records_should_have_following_options(List <String> expectedRecordList) {

        List <String> actualRecordList = BrowserUtils.getElementsText(usersPage.listShowRecords);

        Assert.assertEquals(expectedRecordList,actualRecordList);




    }


}
