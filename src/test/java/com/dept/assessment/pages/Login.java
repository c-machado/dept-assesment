package com.dept.assessment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

    private WebDriver driver;

    @FindBy(id = "login_field")
    public WebElement usernameField;

    @FindBy(id = "password")
    public WebElement passwordField;

    @FindBy(name = "commit")
    public WebElement loginCta;

    public Login(WebDriver _driver) {
        this.driver = _driver;
        PageFactory.initElements(_driver,this);
    }

    public void enterUsername(String _username) {
        usernameField.sendKeys(_username);
    }

    public void enterPassword(String _password) {
        passwordField.sendKeys(_password);
    }

    public void clickLoginButton() {
        loginCta.click();
    }
}
