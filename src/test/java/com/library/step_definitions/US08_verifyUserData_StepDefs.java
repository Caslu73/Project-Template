package com.library.step_definitions;

import com.library.pages.UsersPage;
import com.library.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.*;

public class US08_verifyUserData_StepDefs {
    UsersPage usersPage = new UsersPage();
    @When("I search for {int}")
    public void i_search_for(String number) {
        usersPage.searchBox.sendKeys(number);

    }
    @Then("table should contain this data")
    public void table_should_contain_this_data(Map<String, Object> expectedData) {

             Map<String, Object> expectedMap = new TreeMap<>(expectedData);
             Map <String, Object> actualMap = new TreeMap<>();

        for (int i = 1; i < usersPage.keyMap.size()-2; i++) {
            BrowserUtils.sleep(1);
            actualMap.put(usersPage.keyMap.get(i).getText(), usersPage.valuesMap.get(i).getText());

        }

        Assert.assertEquals(expectedMap,actualMap);




    }

}
