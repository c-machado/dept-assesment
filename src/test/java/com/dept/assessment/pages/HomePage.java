package com.dept.assessment.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    private WebDriver driver;
    private String headingTitle = "Learn Git and GitHub without any code!";
    private String firstResultSelector = "[data-filterable-for='dashboard-repos-filter-left'] li:first-child";

    @FindBy(css = ".shelf-cta[href='/new']")
    public WebElement startAProjectCTA;

    @FindBy(css = ".shelf-title")
    public WebElement headingHomePage;

    @FindBy(id = "js-flash-container")
    public WebElement deletedRepoMessage;

    @FindBy(id = "dashboard-repos-filter-left")
    public WebElement filterRepositoryField;

    public HomePage(WebDriver _driver) {
        this.driver = _driver;
        PageFactory.initElements(_driver, this);
    }

    public void clickStartAProjectCTA() {
        startAProjectCTA.click();
    }

    /**
     * Validates page's title content to confirm the page has been loaded
     * @return boolean
     */
    public boolean isPageOpen() {
        return headingHomePage.getText().contains(headingTitle);
    }

    public void filterRepositoryByKeyword(String _keyword) {
        filterRepositoryField.sendKeys(_keyword);
    }

    public void clickOnFirstResultLink() {
        driver.findElement(By.cssSelector(firstResultSelector)).click();
    }
}
