package com.nextbasecrm.step_definitions;

import com.nextbasecrm.pages.SearchValuePage;
import com.nextbasecrm.pages.WorkGroupsPage;
import com.nextbasecrm.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WorkingGroup_StepDefinitions {
    SearchValuePage searchValues = new SearchValuePage();
    WorkGroupsPage workgroups = new WorkGroupsPage();

    @When("User can write the {string} on the search bar and should see the searched group")
    public void userCanWriteTheOnTheSearchBar(String groupKeyword) {
        workgroups.verifyTypedGroupNameVisibility();

    }


}

