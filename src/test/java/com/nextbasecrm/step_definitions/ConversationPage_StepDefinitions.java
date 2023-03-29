package com.nextbasecrm.step_definitions;

import com.nextbasecrm.pages.LoginPage;
import com.nextbasecrm.pages.SearchValue;
import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.ConfigurationReader;
import com.nextbasecrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ConversationPage_StepDefinitions {

    LoginPage loginPage = new LoginPage();
    SearchValue searchValues = new SearchValue();

    @Given("{string} navigates website and enters valid credentials,should see homepage")
    public void navigates_website_and_enters_valid_credentials_should_see_homepage(String user) {
        Driver.getDriver().get(ConfigurationReader.getProperty("website"));
       loginPage.inputLoginEmail.sendKeys(user);
        loginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("loginPassword"));
        loginPage.loginButton.click();


    }

    @When("User on the homepage should write {string}  to the search box")
    public void user_on_the_homepage_should_write_to_the_search_box(String searchValue) {
        searchValues.searchKeyword.sendKeys(searchValue);
    }

    @When("User clicks to search button")
    public void user_clicks_to_search_button() {

        searchValues.searchButton.click();
    }


    @And("User should see the conversations keyword")
    public void userShouldSeeTheConversationsKeyword() {
        BrowserUtils.sleep(2);
        System.out.println(searchValues.conversationsKeyword.isDisplayed());
    }

    @And("User clicks on the Conversation keyword")
    public void userClicksOnTheConversationKeyword() throws InterruptedException {
        Thread.sleep(3000);
        searchValues.conversationsKeyword.click();
    }

    @Then("User should see Conversations on the opened page")
    public void userShouldSeeConversationsOnTheOpenedPage() {
        System.out.println(searchValues.conversationsTitle.isDisplayed());
        Driver.closeDriver();
    }



}
