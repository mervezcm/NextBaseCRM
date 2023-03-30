package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindingGroupPage {
    public FindingGroupPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    //@FindBy(css = "span[class=\"search-title-top-delete\"]")


    @FindBy(xpath = "(//a[@class='search-title-top-item-link'])[1]")
    public WebElement findingGroupKey;

    @FindBy(xpath = "//img[@src='/upload/learning/2/res16/Fv6AU.group_filter.png']")
    public WebElement searchGroup;




}
