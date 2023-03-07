package com.library.step_definitions;

import com.library.pages.UsersPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class US004_show_records {

    UsersPage usersPage = new UsersPage();
    @Then("the users table must display {string} records")
    public void the_users_table_must_display_records(String expectedUsersTableDisplays) {
      Assert.assertEquals(expectedUsersTableDisplays, ""+usersPage.usersTableRecords.size());

        System.out.println("usersPage.usersTableRecords.size() = " + ""+usersPage.usersTableRecords.size());
    }

}
