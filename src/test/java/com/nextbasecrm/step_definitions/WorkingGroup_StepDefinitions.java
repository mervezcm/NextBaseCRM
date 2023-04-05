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

    @When("User can write the {string} on the search bar")
    public void userCanWriteTheOnTheSearchBar(String groupKeyword) {




    }

    @When("User can write the workgroup keyword on the search bar")
    public void userCanWriteTheWorkinggroupKeywordOnTheSearchBar() {

        searchValues.searchKeyword.sendKeys("workgroup");

    }



    @And("User should see workgroup button and click it.")
    public void userShouldSeeWorkgroupButtonAndClickIt() {
        BrowserUtils.sleep(2);
        System.out.println(workgroups.workgroupsButton.isDisplayed());
        BrowserUtils.sleep(2);
        workgroups.workgroupsButton.click();
        BrowserUtils.sleep(2);
    }

    @Then("User should see the all workgroups.")
    public void userShouldSeeTheAllWorkGroups() {
        BrowserUtils.sleep(2);
        System.out.println(workgroups.techWorkgroup.isDisplayed());
        BrowserUtils.sleep(2);
        System.out.println(workgroups.salesWorkgroup.isDisplayed());
        BrowserUtils.sleep(2);
        System.out.println(workgroups.newProductWorkgroup.isDisplayed());
        BrowserUtils.sleep(2);
        System.out.println(workgroups.advertisingWorkgroup.isDisplayed());
        BrowserUtils.sleep(2);
        System.out.println(workgroups.newcompanyWebWorkgroup.isDisplayed());
    }


}

