package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.BrowserUtils;
import com.nextbasecrm.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

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
    @FindBy(xpath = " //a[@href='/workgroups/group/3/'][.//span[@class='search-title-top-item-img']]")
    public WebElement salesWorkgroupButton;

    @FindBy(xpath = "(//a[.='Technology'])[2]")
    public WebElement techWorkgroup;
    @FindBy(xpath = "(//a[@href='/workgroups/group/5/'])[2]")
    public WebElement techWorkgroupButton;
    @FindBy(css = "input[id=\"search-textbox-input\"]")
    public WebElement searchKeyword;


    public void verifyTypedGroupNameVisibility() {

        // List<WebElement> groupNames1 = new ArrayList<>();
        // groupNames1.addAll(Arrays.asList(salesWorkgroupButton, techWorkgroupButton, advertisingWorkgroupButton, newcompanyWebWorkgroupButton, newProductWorkgroupButton));

        String[] groupNames = {"Sales", "Technology", "New product development", "PR and advertising", "New company web site development"};
        WebElement[] groupButton = {salesWorkgroupButton, techWorkgroupButton, newProductWorkgroupButton, advertisingWorkgroupButton, newcompanyWebWorkgroupButton};
        for (int i = 0, j = 0; i < groupNames.length && j < groupButton.length; i++, j++) {
            searchKeyword.sendKeys(groupNames[i]);
            System.out.println(groupNames[i]);
            Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            Assert.assertTrue("Button is not displayed", groupButton[j].isDisplayed());
            BrowserUtils.sleep(2);
            searchKeyword.clear();


        }
    }


}








