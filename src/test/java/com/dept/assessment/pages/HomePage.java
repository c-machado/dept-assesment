package com.dept.assessment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;
    private String headingTitle = "Learn Git and GitHub without any code!";

    @FindBy(css = ".shelf-cta[href='/new']")
    public WebElement startAProjectCTA;

    @FindBy(css = ".shelf-title")
    public WebElement headingHomePage;

    public HomePage(WebDriver _driver) {
        this.driver = _driver;
        PageFactory.initElements(_driver, this);
    }

    public void clickStartAProjectCTA() {
        startAProjectCTA.click();
    }

    public boolean isPageOpen() {
        return headingHomePage.getText().contains(headingTitle);
    }
}
