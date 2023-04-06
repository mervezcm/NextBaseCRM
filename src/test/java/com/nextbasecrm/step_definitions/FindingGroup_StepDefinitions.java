package com.nextbasecrm.step_definitions;

import com.nextbasecrm.pages.FindingGroupPage;
import com.nextbasecrm.pages.SearchValuePage;
import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FindingGroup_StepDefinitions {

    SearchValuePage searchValues = new SearchValuePage();
    FindingGroupPage groupKeyword = new FindingGroupPage();

    @When("User on the homepage can write the finding group keyword on the search bar")
    public void userOnTheHomepageCanWriteTheKeywordOnTheSearchBar() {
        searchValues.searchKeyword.sendKeys("finding group");

    }

    @And("User should see the FindingGroups keyword")
    public void userShouldSeeTheFindingGroupKeyword() {
        BrowserUtils.sleep(2);
        System.out.println(groupKeyword.findingGroupKey.isDisplayed());

    }

    @And("User clicks on the FindingGroup  button")
    public void userClicksOnTheFindingGroupButton() {
        BrowserUtils.sleep(2);
        groupKeyword.findingGroupKey.click();

    }

    @Then("User should click search button under the search in groups title opened page")
    public void userShouldClickSearchButtonUnderTheSearchInGroupsTitleOnOpenedPage() {

        groupKeyword.searchGroup.click();
        Assert.assertEquals("Finding Group",groupKeyword.searchGroup.getText());




    }
}
