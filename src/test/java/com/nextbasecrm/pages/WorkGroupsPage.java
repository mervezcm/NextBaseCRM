package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WorkGroupsPage {
    public WorkGroupsPage() {

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@href='/workgroups/'])[3]")
    public WebElement workgroupsButton;

    @FindBy(xpath = "//span[@class='search-title-top-delete']")
    public WebElement deleteButton;


    @FindBy(xpath = "(//a[.='New product development'])[2]")
    public WebElement newProductWorkgroup;

    @FindBy(xpath = "(//a[@href='/workgroups/group/6/'])[2]")
    public WebElement newProductWorkgroupButton;
    @FindBy(xpath = "(//a[.='New company web site development'])[2]")
    public WebElement newcompanyWebWorkgroup;

    @FindBy(xpath = "(//a[@href='/workgroups/group/1/'])[2]")
    public WebElement newcompanyWebWorkgroupButton;
    @FindBy(xpath = "(//a[.='PR and advertising'])[2]")
    public WebElement advertisingWorkgroup;
    @FindBy(xpath = "(//a[@href='/workgroups/group/2/'])[2]")
    public WebElement advertisingWorkgroupButton;
    @FindBy(xpath = "(//a[.='Sales'])[2]")
    public WebElement salesWorkgroup;
    @FindBy(xpath = " (//a[@href='/workgroups/group/3/'])[4]")
    public WebElement salesWorkgroupButton;

    @FindBy(xpath = "(//a[.='Technology'])[2]")
    public WebElement techWorkgroup;
    @FindBy(xpath = "(//a[@href='/workgroups/group/5/'])[2]")
    public WebElement techWorkgroupButton;


    public void verifyTypedGroupNameVisibility() {
      //  String[] groupNames = {"Sales", "Technology", "New product development", "PR and advertising", "New company web site development"};
        List<WebElement> groupNames1 = new ArrayList<>();
        groupNames1.addAll(Arrays.asList(salesWorkgroupButton, techWorkgroupButton, advertisingWorkgroupButton, newcompanyWebWorkgroupButton, newProductWorkgroupButton));

        for (WebElement eachGroup : groupNames1) {

            Assert.assertTrue(eachGroup.isDisplayed());
            BrowserUtils.sleep(2);
            deleteButton.click();


        }

    }
}

 /*  public void verifySelectedProductDetailsVisibility() {
            List<WebElement> allDetails = new ArrayList<>();
            allDetails.addAll(Arrays.asList(brandBlueTop, conditionBlueTop, availabilityBlueTop, priceBlueTop, productNameBlueTop, categoryBlueTop));

            for (WebElement eachDetail : allDetails) {
                Assert.assertTrue(eachDetail.isDisplayed(), eachDetail.getText() + " is not visible");
                System.out.println(eachDetail.getText() + " is displayed");
            }*/






