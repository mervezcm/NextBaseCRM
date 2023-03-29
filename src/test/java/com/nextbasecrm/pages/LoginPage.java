package com.nextbasecrm.pages;

import com.nextbasecrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy( css = "input[type=\"text\"]")
    public WebElement inputLoginEmail;

    @FindBy( css = "input[type=\"password\"]")
    public WebElement inputPassword;

    @FindBy(css = "input.login-btn")
    public WebElement loginButton;

}