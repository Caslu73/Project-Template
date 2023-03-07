package com.library.step_definitions;

import com.library.pages.UsersPage;
import com.library.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class US002_records_functionality_StepDef {

    UsersPage usersPage = new UsersPage();

    @Then("show records default value should be {string}")
    public void showRecordsDefaultValueShouldBe(String expectedDefaultValueOnShowRecords) {
        Select select = new Select(usersPage.showRecords);
        String actualDefaultValueOnShowRecords = select.getFirstSelectedOption().getText();
        Assert.assertEquals(expectedDefaultValueOnShowRecords,actualDefaultValueOnShowRecords);

        System.out.println("actualDefaultValueOnShowRecords = " + actualDefaultValueOnShowRecords);
    }

    @Then("show records should have following options:")
    public void show_records_should_have_following_options(List <String> expectedRecordList) {

        List <String> actualListOfShowRecords = BrowserUtils.getElementsText(usersPage.listShowRecords);

        Assert.assertEquals(expectedRecordList,actualListOfShowRecords);

        System.out.println("actualListOfShowRecords = " + actualListOfShowRecords);


    }


}
