package com.dept.assessment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RepositoriesListPage {

    private WebDriver driver;

    @FindBy(id = "your-repos-filter")
    public WebElement searchInput;

    @FindBy(css = ".user-repo-search-results-summary strong")
    public WebElement totalResultsNumber;

    public RepositoriesListPage(WebDriver _driver) {
        this.driver = _driver;
        PageFactory.initElements(_driver,this);
    }
}
